package no.hiof.oleedvao.lecture10.models;

public class CarpenterApprentice extends Carpenter {

    // Her ønsker vi at trainingPeriod alltid skal settes ved opprettelse, så vi setter ingen standardverdi for denne.
    private String trainingPeriod;

    // Det er generelt OK å definere flere metoder med samme navn (Overloading) så lenge metodene kan differensieres
    // basert på antall parametere eller rekkefølgen av parameterenes datatyper, eller en blanding av begge deler.
    // Return-typer kan også være forskjellige så lenge metodene kan skilles på parameterene.
    // Vi benytter her Overloading for å lage en alternativ konstruktør som bare håndterer de helt nødvendige
    // instansvariablene (her de som er arvet fra Person), som er naturlige å definere ved opprettelse av
    // CarpenterApprentice-objekter. I tillegg håndterer vi trainingPeriod.
    public CarpenterApprentice(String firstName, String lastName,
                               int age, String trainingPeriod) {
        super(firstName, lastName, age);

        // Her velger vi å sette verdien for trainingPeriod via parameter i stedet for å håndtere dette via standard-
        // parameter. Den arvede instansvariabelen numHousesBuilt, på en annen side, setter vi ikke manuelt i denne
        // konstruktøren og vil i stedet håndteres slik som det er definert i Carpenter.
        this.trainingPeriod = trainingPeriod;
    }

    public CarpenterApprentice(String firstName, String lastName,
                               int age, int numHousesBuilt,
                               String trainingPeriod) {
        super(firstName, lastName, age, numHousesBuilt);

        this.trainingPeriod = trainingPeriod;
    }

    @Override
    public String toString() {
        return "My name is " + firstName + " " + lastName +
                ". I am a carpenter apprentice between " + trainingPeriod +
                ". I have built " + numHousesBuilt + " so far.";
    }

    public String getTrainingPeriod() {
        return trainingPeriod;
    }

    public void setTrainingPeriod(String trainingPeriod) {
        this.trainingPeriod = trainingPeriod;
    }
}
