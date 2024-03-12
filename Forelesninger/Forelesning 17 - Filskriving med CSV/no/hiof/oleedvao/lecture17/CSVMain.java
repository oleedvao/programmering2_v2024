package no.hiof.oleedvao.lecture17;

import no.hiof.oleedvao.lecture17.models.SuperHero;

import java.io.*;
import java.util.ArrayList;

public class CSVMain {
    public static void main(String[] args) {
        // Oppretter en liste med SuperHero-objekter som vi vil benytte som utgangspunkt ved håndtering av CSV-filer.
        ArrayList<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(new SuperHero("Batman", "Bruce Wayne"));
        superHeroes.add(new SuperHero("Superman", "Clark Kent"));
        superHeroes.add(new SuperHero("Wonder Woman", "Diana Prince"));

        // Skriver SuperHero-objektene til CSV-fil
        writeSuperHerosToCSV(superHeroes, "superheros.csv");

        // Produserer en liste med (nye) SuperHero-objekter basert på en csv-fil.
        ArrayList<SuperHero> superHeroesFromCSV = readSuperHeroesFromCSV("superheros.csv");

        // Vi kan nå gjøre hva vi vil med de produserte objektene.
        for (SuperHero superHeroX : superHeroesFromCSV) {
            System.out.println("Name: " + superHeroX.getName() +
                    "\nSecret Identity: " + superHeroX.getSecretIdentity() + "\n");
        }
    }

    // Leser en fil, tolker inholdet som SuperHero-objekter og returnerer disse som en ArrayList.
    public static ArrayList<SuperHero> readSuperHeroesFromCSV(String fileName) {

        // ArrayList som skal fylles opp med SuperHero-objekter og til slutt returneres som resultatet av metdoen.
        ArrayList<SuperHero> fetchedSuperHeroes = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            // Leser hver linje til slutten av filen og konverterer disse internt til SuperHero-objekter.
            String line;
            while ( (line = bufferedReader.readLine()) != null ) {

                // Splitter verdiene i fil-linjen basert på skilletegnet (her ;)
                // Dette produserer en String-array med hver at disse verdiene. Her vil dette føre til en array med
                // to elementer, hvor det første er SuperHero-objektet sitt name, og det andre secretIdentity.
                String[] values = line.split(";");

                // Etter å ha splittet verdiene kan vi benytte disse til å opprette et SuperHero-objekt ved bruk av
                // konstruktøren.
                SuperHero superHeroX = new SuperHero(values[0], values[1]);

                // Legger til det nye objektet i listen som skal returneres.
                fetchedSuperHeroes.add(superHeroX);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

        // Returnerer listen med SuperHero-objekter
        return fetchedSuperHeroes;
    }

    // Metode for å skrive en liste med SuperHero-objekter til fil i CSV-format
    public static void writeSuperHerosToCSV(ArrayList<SuperHero> superHeroes, String fileName) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {

            // Går gjennom listen med SuperHero-objekter
            for (SuperHero superHeroX : superHeroes) {
                // Skriver hvert SuperHero-objekt som en linje til filen med formatet:
                //      name;secretIdentity
                // Altså henter vi ut name og secretIdentity fra objektene og skiller på med med semikolon (;).
                // Vi kunne fint valgt et annet skilletegn også om vi hadde ønsket det.
                bufferedWriter.write(superHeroX.getName() + ";" + superHeroX.getSecretIdentity());
                bufferedWriter.newLine(); // Lager linjeskift i filen.
            }

        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
