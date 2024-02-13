package no.hiof.oleedvao.lecture10.models;

public class Carpenter extends Person {

    // Ved å initialisere en instansvariabel ved deklarasjon vil den satte verdien bli standardverdien for alle
    // opprettede objekter, med mindre konstruktøren benyttet overskriver denne til en mer spesifikk verdi.
    protected int numHousesBuilt = 0;


    // Det er generelt OK å definere flere metoder med samme navn (Overloading) så lenge metodene kan differensieres
    // basert på antall parametere eller rekkefølgen av parameterenes datatyper, eller en blanding av begge deler.
    // Return-typer kan også være forskjellige så lenge metodene kan skilles på parameterene.
    // Vi benytter her Overloading for å lage en alternativ konstruktør som bare håndterer de helt nødvendige
    // instansvariablene (her de som er arvet fra Person), som er naturlige å definere ved opprettelse av
    // Carpenter-objekter. kan på en annen side håndteres med en standardverdi.
    public Carpenter(String firstName, String lastName, int age) {
        super(firstName, lastName, age);

        // Vi kunne eventuelt valgt å sette en standard-verdi for numHousesBuilt i konstruktøren, men vi dette vil i
        // så fall bare gjelde for akkurat denne konstruktøren.
        //this.numHousesBuilt = 0;

    }

    public Carpenter(String firstName, String lastName, int age,
                     int numHousesBuilt){
        super(firstName, lastName, age);

        this.numHousesBuilt = numHousesBuilt;
    }

    @Override
    public String toString() {
        return "My name is " + firstName + " " + lastName +
                ". I am a carpenter and I have built " +
                numHousesBuilt + " houses.";
    }

    public int getNumHousesBuilt() {
        return numHousesBuilt;
    }

    public void setNumHousesBuilt(int numHousesBuilt) {
        this.numHousesBuilt = numHousesBuilt;
    }
}
