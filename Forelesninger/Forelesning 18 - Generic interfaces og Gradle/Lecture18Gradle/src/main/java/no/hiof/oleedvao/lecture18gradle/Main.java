package no.hiof.oleedvao.lecture18gradle;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {

        // Denne klassen er en klasse fra det eksterne biblioteket, Jackson, og kan benyttes for konvertering mellom
        // objekter og JSON (tekst og filer).
        // Ettersom dette er et eksternt bibliotek må vi imidlertid sette opp prosjektet til å være et Gradle-prosjekt
        // (se slides) og legge til linjen under i filen build.gradle sin dependencies-blokk.:
        //      implementation 'com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.16.0'
        // Dette er også beskrevet i slidene.
        ObjectMapper objectMapper = new ObjectMapper();
    }
}
