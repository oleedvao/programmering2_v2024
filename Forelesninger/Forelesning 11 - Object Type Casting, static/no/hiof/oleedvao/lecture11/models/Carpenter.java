package no.hiof.oleedvao.lecture11.models;

public class Carpenter extends Person {

    // Her har vi opprettet en statisk variabel for å spesifikt holde styr på hvor mange Carpenter-objekter som har
    // blitt opprettet. Logikken fungerer likt som beskrevet i Person-klassen.
    private static int numCarpenters = 0;

    protected int numHousesBuilt = 0;


    public Carpenter(String firstName, String lastName, int age) {
        super(firstName, lastName, age);

        // Hvis vi skal ha en riktig oversikt over hvor mange Carpenter-objekter som er blitt opprettet må vi i så
        // fall sørge for at oppdateringslogikken er inneholdt i alle tilgjengelige konstruktører.
        numCarpenters++;
    }

    public Carpenter(String firstName, String lastName, int age,
                     int numHousesBuilt){
        super(firstName, lastName, age);

        this.numHousesBuilt = numHousesBuilt;

        // Hvis vi skal ha en riktig oversikt over hvor mange Carpenter-objekter som er blitt opprettet må vi i så
        // fall sørge for at oppdateringslogikken er inneholdt i alle tilgjengelige konstruktører.
        numCarpenters++;
    }

    public static int getNumCarpenters() {
        return numCarpenters;
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
