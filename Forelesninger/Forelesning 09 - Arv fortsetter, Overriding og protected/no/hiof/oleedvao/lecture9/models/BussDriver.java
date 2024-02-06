package no.hiof.oleedvao.lecture9.models;

public class BussDriver extends Person{

    private String route;

    public BussDriver(String firstName, String lastName, int age,
                      String route) {
        super(firstName, lastName, age);

        this.route = route;
    }

    // Her overrider vi toString() på nytt slik at den tekslige representasjonen av Carpenter er mer
    // tilpasset for dens egenskaper.
    @Override
    public String toString() {
        // Merk at vi kan direkte aksessere firstName og lastName fordi disse instansvariablene, som er
        // arvet, er definert til å være protected i Person. Hadde disse vært
        // definert som private, måtte vi ha benytte gettere for dette (f.eks. getFirstName())
        return "My name is " + firstName + " " + lastName +
                ". I am a buss driver and my route is " + route + ".";
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}