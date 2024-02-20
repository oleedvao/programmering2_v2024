package no.hiof.oleedvao.lecture12.models;

// Vi kan late som det vi gjør i denne klassen bygger på Person-klassen fra tidligere forelesninger, men for dette
// eksemplet gjør vi dette isolert for å slippe følgefeil i slikt som barneklassene sine konstruktører.
public class Person {

    // Variabelen under er satt til final. Dette vil definere at variabelens verdi bare skal settes én gang.
    // Dette vil også bli kontrollert av Java, både at vi ikke setter inn noen ny verdi og at den blir initialisert.
    // Fordelen med å gjøre dette overfor å bare restrihere variabelens tilgang via gettere og settere er at vi da
    // helt tydelig gir beskjed til Java og eventuelle andre programmerere om at denne variabelen ikke skal modifiseres.
    private final String birthNumber;

    // Hvis vi har en final variabel må disse enten initialiseres direkte ved deklarasjon, eller bli satt i samtlige
    // av tilgjengelige konstruktører.
    public Person(String birthNumber) {
        this.birthNumber = birthNumber;
    }

    // Hadde konstruktøren under vært benyttet, vil vi bli tvunget til å også sette en verdi for final-variabelen.
    /*
    public Person() {
        this.birthNumber = "12345678910";
    }
     */

    // Vi kan fint hente ut verdien i final-variabelen via getter ...
    public String getBirthNumber() {
        return birthNumber;
    }

    // ..., men vi kan ikke benytte en setter på denne ettersom Java ikke tillater at vi oppdaterer en verdie for en
    // final-variabel.
    /*
    public void setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
    }
     */
}
