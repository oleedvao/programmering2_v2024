package no.hiof.oleedvao.lecture16;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        simpleFileWriting("textFile.txt");
        fileWritingFromInput("inputFile.txt");
    }


    // Metode for å gjøre en enkel filskriving
    public static void simpleFileWriting(String fileName) {

        // Dette er en try (with resources) block.
        // Denne blokken inneholder kode vi som programmerere, samt Java, vet kan gi en eller flere
        // Exceptions.
        // Parantesen knyttet til try blokken, altså 'try (...)', spesifisere de ressursene vi ønsker å benytte
        // for try logikken. Disse ressursene vil automatisk lukkes etter try-blokken er ferdig eller en Exception
        // har forekommet. Disse ressursene kan typisk være slikt som stream-objekter.
        // Stream objektene vi benytter (vil automatisk lokkes ettersom de er definert som ressurser for
        // try-blokken).
        // FileWriter er en type stream som hjelper oss å skrive til fil. Hvis vi spesifiserer append som
        // true vil denne streamen legge til tekst til den gitte filen. Hvis false, eller ikke spesifisert,
        // vil filen overskrives.
        // Denne oppretter også filen automatisk hvis den ikke finnes fra før av.
        // String verdien representerer filnavnet/-stien vi ønsker skal gjelde. Hvis vi bare skriver et
        // filnavn vil filen opprettes/leses fra roten av intellij prosjektet altså direkte under
        // prosjektmappen.
        try (FileWriter fileWriter = new FileWriter(fileName, true);) {
            // Vi kan benytte FileWriter sin .append()-metode for å spesifisere det som skal skrives til fil.
            // Vi kan kalle .append() så mange ganger vi vil. Merk likevel at vi manuelt må legge til "\n" for å få
            // linjeskift.
            fileWriter.append("Something...\n");
            fileWriter.append("jfkdsljfls\n");
            fileWriter.append("Something else...\n");
        }
        // Dette er en catch-blokk.
        // I denne kan vi spesifisere hva for slags type exception vi ønsker å håndtere (hvilket type Exeption-objekt)
        // og skrive kode logikk for hvordan vi ønsker å håndtere den.
        // I dette tilfellet hånderer vi en IOException som er en checked exception som Java vil påkreve at vi håndterer
        // når vi benytter FileWriter.
        catch (IOException e) {
            // Vi hånderer en IOException i dette tilfellet ved å enkelt skrive ut en error melding til output.
            System.err.println(e.getMessage());
        }

    }

    // Metode for å skrive til fil fra input
    public static void fileWritingFromInput(String fileName) {

        // Vi benytter et objekt av klassen BufferedReader for å lese fra input linje for linje.
        // Merk at denne også er spesifisert som en resource i try-blokken for å sørge for at denne blir lukket
        // automatisk.
        // BufferedReader krever at vi også sender med et StreamReader-objekt (leser tegn for tegn) den kan benytte.
        // Vi benytter her spesifikt InputStreamReader, som leser tegn fra en input stream. Vi spesifiserer
        // at den gjeldende input streamen skal være IntelliJ sin input fra konsoll (System.in).
        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {

            // Denne while løkken benyttes for å kontinuerlig lese linjer fra input og skrive dem til fil inntil
            // bruken skriver "quit" for å avslutte filskrivingen.
            while (true) {
                System.out.print(":");
                // BufferedReader sin .readLine()-metode kan benyttes for å hente input fra brukeren. Vi mellomlagrer
                // her denne i en String-variabel.
                String inputText = bufferedReader.readLine();

                // Hvis brukeren skriver "quit" avbrytes løkken med break...
                if (inputText.equals("quit")) {
                    break;
                }
                else { // ... ellers skriver vi siste tilgjengelige input til filen.
                    fileWriter.append(inputText + "\n");
                }
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
