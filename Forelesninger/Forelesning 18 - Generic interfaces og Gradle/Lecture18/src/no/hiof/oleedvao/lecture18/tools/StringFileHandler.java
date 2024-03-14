package no.hiof.oleedvao.lecture18.tools;

import no.hiof.oleedvao.lecture18.interfaces.FileHandler;

import java.io.*;

// Denne klassen vil fungere som et verktøy for å skrive/lese ren tekst (String) til fil.
// Klassen implementerer det generiske interfacet FileHandler<T> og vi spesifiserer her at den gjeldende datatypen skal
// være String i <>. Dette vil medføre at metode-implementasjonene fra interfacet blir dynamisk tilpasset denne
// datatypen (hvor T er blitt definert som parameter og/eller returntype).
public class StringFileHandler implements FileHandler<String> {

    // I denne metode-implementasjonen, som er basert på FileHandler<String>, ser vi at den andre inputparameteren
    // er av typen String i stedet for T. Dette er på grunn av nøyaktig av String er blitt definert i
    // FileHandler<String> i klassens hode.
    @Override
    public void writeToFile(String fileName, String inputString) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {

            bufferedWriter.write(inputString);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    // I denne metode-implementasjonen er return-typen også blitt til String i stedet for T, basert på at vi definerer
    // String i FileHandler<String> i klassens hode.
    @Override
    public String readFromFile(String fileName) {

        String content = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ( (line = bufferedReader.readLine()) != null ) {
                content += line + "\n";
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }


}
