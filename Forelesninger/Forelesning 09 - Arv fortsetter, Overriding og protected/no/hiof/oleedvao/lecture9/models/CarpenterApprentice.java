package no.hiof.oleedvao.lecture9.models;

// Denne klassen arver fra Carpenter, som igjen arver fra Person. Altså er CarpenterApprentice her en Barneklasse av
// en annen barneklasse og vil arve alle egenskapene fra Carpenter, men også Person. Altså vil den arve alle egenskapene
// fra alle Foreldre klassen over i arvhierarkiet.
public class CarpenterApprentice extends Carpenter {

    private String trainingPeriod;

    // Ettersom klassen arver fra Carpenter må CarpenterApprentice sin konstruktør minst ta parameterene som Carpenter
    // sin konstruktør og sende disse opp til Carpenter via super().
    public CarpenterApprentice(String firstName, String lastName,
                               int age, int numHousesBuilt,
                               String trainingPeriod) {
        super(firstName, lastName, age, numHousesBuilt);

        this.trainingPeriod = trainingPeriod;
    }

    // Her overrider vi toString() på nytt slik at den tekslige representasjonen av CarpenterApprentice er mer
    // tilpasset for dens egenskaper.
    @Override
    public String toString() {
        // Merk at vi kan direkte aksessere firstName, lastName og numHousesBuilt fordi disse instansvariablene, som er
        // arvet, er definert til å være protected i sine respektive klasser (Person og Carpenter). Hadde disse vært
        // definert som private, måtte vi ha benytte gettere for dette (f.eks. getFirstName())
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
