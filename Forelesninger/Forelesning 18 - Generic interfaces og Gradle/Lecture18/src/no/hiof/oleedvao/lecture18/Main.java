package no.hiof.oleedvao.lecture18;

import no.hiof.oleedvao.lecture18.tools.StringFileHandler;

public class Main {
    public static void main(String[] args) {
        // Vi kan nå opprette et objekt av StringFileHandler for skriving og lesing av tekst...
        StringFileHandler stringFileHandler = new StringFileHandler();
        // .. og benytte de implementerte metodene for selve håndteringen.
        stringFileHandler.writeToFile("something.txt",
                "Something interesting...");
        String textFromFile = stringFileHandler.readFromFile("something.txt");
        System.out.println(textFromFile);
    }
}
