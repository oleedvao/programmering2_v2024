package no.hiof.oleedvao.lecture11.models;

public class BussDriver extends Person{

    private String route = "not assigned";


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