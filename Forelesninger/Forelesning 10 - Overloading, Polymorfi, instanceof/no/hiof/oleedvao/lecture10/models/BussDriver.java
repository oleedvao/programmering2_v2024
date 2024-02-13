package no.hiof.oleedvao.lecture10.models;

public class BussDriver extends Person{

    // Ved å initialisere en instansvariabel ved deklarasjon vil den satte verdien bli standardverdien for alle
    // opprettede objekter, med mindre konstruktøren benyttet overskriver denne til en mer spesifikk verdi.
    private String route = "not assigned";


    // Det er generelt OK å definere flere metoder med samme navn (Overloading) så lenge metodene kan differensieres
    // basert på antall parametere eller rekkefølgen av parameterenes datatyper, eller en blanding av begge deler.
    // Return-typer kan også være forskjellige så lenge metodene kan skilles på parameterene.
    // Vi benytter her Overloading for å lage en alternativ konstruktør som bare håndterer de helt nødvendige
    // instansvariablene (her de som er arvet fra Person), som er naturlige å definere ved opprettelse av
    // BussDriver-objekter. route kan på en annen side håndteres med en standardverdi.
    public BussDriver(String firstName, String lastName, int age) {
        super(firstName, lastName, age);

    }

    public BussDriver(String firstName, String lastName, int age,
                      String route) {
        super(firstName, lastName, age);

        this.route = route;
    }

    @Override
    public String toString() {
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