package no.hiof.oleedvao.lecture11.models;

public class CarpenterApprentice extends Carpenter {

    private String trainingPeriod;

    public CarpenterApprentice(String firstName, String lastName,
                               int age, String trainingPeriod) {
        super(firstName, lastName, age);

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
