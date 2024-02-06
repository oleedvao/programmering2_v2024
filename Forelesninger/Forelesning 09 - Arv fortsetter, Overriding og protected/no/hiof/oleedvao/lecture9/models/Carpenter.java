package no.hiof.oleedvao.lecture9.models;

public class Carpenter extends Person {

    protected int numHousesBuilt;

    public Carpenter(String firstName, String lastName, int age,
                     int numHousesBuilt){
        super(firstName, lastName, age);

        this.numHousesBuilt = numHousesBuilt;
    }

    // Her overrider vi toString() på nytt slik at den tekslige representasjonen av Carpenter er mer
    // tilpasset for dens egenskaper.
    @Override
    public String toString() {
        // Merk at vi kan direkte aksessere firstName og lastName fordi disse instansvariablene, som er
        // arvet, er definert til å være protected i Person. Hadde disse vært
        // definert som private, måtte vi ha benytte gettere for dette (f.eks. getFirstName())
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
