package no.hiof.oleedvao.lecture17;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        simpleFileWriting("textFile.txt");
        fileWritingFromInput("inputFile.txt");
        fileReading("inputFile.txt");
    }

    // Leser innholdet av en tekst-fil og skriver det ut til output
    public static void fileReading(String fileName) {

        // Vi benytter her BufferedReader som en ressurs for å kunne lese innholdet av en fil linje for linje.
        // Vi spesifiserer her at BufferedReader spesifikt skal benytte FileReader underliggende for å lese tegnene
        // i en fil.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));) {

            // Koden under er logikken for å lese hver linje hver for seg helt til hele filen er gjennomgått.
            String line;
            // Vi skriver her en litt snodig, men smidig while-løkke som i betingelsen både oppdaterer variabelen line
            // med den neste linjen i filen og samtidig sjekker at denne linjen ikke er null. Altså vil denne
            // while-løkken gjennomgå hver linje. En slik while løkke kan typisk gjenbrukes i alle tilfeller vi ønsker
            // gjør gjøre dette.
            while ( (line = bufferedReader.readLine()) != null ) {
                // Her spesifiserer vi logikken vi ønsker å benytte for hver linje. I dette tilfellet er det så enkelt
                // at vi skriver den ut direkte til output.
                System.out.println(line);
            }

        }
        // FileReader har en checked Exception kalt FileNotFoundException (underklasse av IOException) som må håndteres.
        // Merk at exceptions håndteres i rekkefølgen som catch-blokkene er definert. Altså vil det først sjekkes
        // om det er en FileNotFoundException før den eventuelt sjekker neste catch-blokk.
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Vi vil fremdeles være påkrevd å håndtere mer generelle former for IOExceptions i dette tilfellet.
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void simpleFileWriting(String fileName) {

        try (FileWriter fileWriter = new FileWriter(fileName, true);) {
            fileWriter.append("Something...\n");
            fileWriter.append("jfkdsljfls\n");
            fileWriter.append("Something else...\n");
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void fileWritingFromInput(String fileName) {

        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {

            while (true) {
                System.out.print(":");
                String inputText = bufferedReader.readLine();

                if (inputText.equals("quit")) {
                    break;
                }
                else {
                    fileWriter.append(inputText + "\n");
                }
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
