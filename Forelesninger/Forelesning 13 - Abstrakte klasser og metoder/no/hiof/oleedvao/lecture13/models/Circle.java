package no.hiof.oleedvao.lecture13.models;

// Merk at vi fint kan arve fra Figure selv om denne er abstrakt
public class Circle extends Figure{

    private double radius;

    // Konstruktøren blir definert som vi ville gjort hvis vi hadde arvet fra en vanlig klasse.
    public Circle(String color, double radius) {
        super(color);

        this.radius = radius;
    }

    // Ettersom circumference() og area() er deklarert som abstrakte i Figure er vi påkrevd av Java om å implementere
    // disse i Figure-sine barneklasser. Merk også at vi gjør dette ved å override på vanlig måte (vi benytter ikke
    // nøkkelordet abstract her).
    @Override
    public double circumference() {
        //2 * radius * pi
        return 2 * radius * Math.PI;
    }

    @Override
    public double area() {
        // pi * radius^2
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
