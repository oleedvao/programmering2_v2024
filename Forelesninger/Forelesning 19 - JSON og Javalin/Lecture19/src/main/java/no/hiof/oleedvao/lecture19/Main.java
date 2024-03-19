package no.hiof.oleedvao.lecture19;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import no.hiof.oleedvao.lecture19.models.SuperHero;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Oppretter ett litt "komplisert" objekt som har en liste med andre objekter. Dette er vanskelig å skrive
        // til noe slikt som CSV-fil, og trenger en mer hierarkisk struktur.
        SuperHero batman = new SuperHero("Batman",
                "Bruce Wayne");
        batman.getSidekicks().add(new SuperHero("Robin", "Jason Todd"));
        batman.getSidekicks().add(new SuperHero("Batgirl", "Barbara Gordon"));

        // JSON er en filstruktur som er basert på nøkkel/verdi-par og godt egnet for å ivareta hierarkiske strukturer
        // og objekter generelt.
        // I java finnes det en rekke med eksterne biblioteker som har klasser vi kan benytte for konvertering og
        // fil håndtering av JSON. I dette tilfellet benytter vi ObjectMapper-klassen fra biblioteket Jackson.
        // Merk at dette krever bruk av et byggeverktøy for importere. Se build.gradle og slidene for forelesning 19.
        ObjectMapper objectMapper = new ObjectMapper();

        // ObjectMapper sine metoder for å skrive og lese fra fil krever et File-objekt:
        File file = new File("superheroes.json");

        try {
            // Vi kan benytte .writerWithDefaultPrettyPrinter().writeValue() for å skrive et objekt til fil. Dette
            // krever to parametere, et File-objekt og objektet som vi ønsker å skrive.
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, batman);

            // For å lese fra fil kan vi benytte .readValue(), som krever et File-objekt og klassen som json-innholdet
            // av filen skal tolket som. Her spesifiserer vi SuperHero.class for å si at innholdet skal tolkes som
            // et objekt av SuperHero. Etter å ha lest og konvertert filen til et objekt, kan dette benyttes som vanlig.
            SuperHero superHeroFromJson = objectMapper.readValue(file, SuperHero.class);
            System.out.println(superHeroFromJson.getName());
        } // Merk at writeValue() og readValue() har en rekke med Checked Exceptions so må håndteres.
        catch (IOException e) {
            e.printStackTrace();
        }

        // Vi kan også konvertere objekter frem og tibake fra XML-formatet, som et alternativ til JSON.
        // I så fall kan vi beytte klassen XmlMapper, som også kommer fra Jackson.
        XmlMapper xmlMapper = new XmlMapper();

        // Ellers fungerer XmlMapper på akkurat samme måte som ObjectMapper.
        File file1 = new File("superheroes.xml");
        try {
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(file1, batman);
            SuperHero superHeroFromXml = xmlMapper.readValue(file1, SuperHero.class);
            System.out.println(superHeroFromXml.getName());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
