package no.hiof.oleedvao.lecture13.models;

// Figure er her deklarert med nøkkelordet abstract. Dette betyr at vi ikke kan opprette objekter av denne klassen
// direkte, men vi kan fremdeles opprette underklasser som arver fra denne og opprette objekter av de.
public abstract class Figure {

    private String color;

    // Merk at vi fremdeles oppretter en konstruktør for en abstrakt metode. Dette er fordi barneklasser fremdeles
    // vil benytte denne gjennom super() for å sette instansvariablene som blir arvet fra den abstrakte klassen.
    public Figure(String color) {
        this.color = color;
    }

    // Metodene under er deklarert som abstract. Dette er bare mulig å gjøre i en abstract (elle tilsvarende...) klasse.
    // Vi deklarerer abstrakte metoder uten kodekropp, men alle klasser som arver disse vil bli påkrevd å override
    // for å implementere kodekropper. Abstrakte metoder er typisk benyttet i tilfeller hvor implementasjonen av
    // kodekropp er helt avhengig av typen klasse/underklasse. For eksempel er omkrets og areal helt avhengig av
    // hva for slags type figur som er gjeldende (rektangel, sirkel osv.).
    public abstract double circumference();

    public abstract double area();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
