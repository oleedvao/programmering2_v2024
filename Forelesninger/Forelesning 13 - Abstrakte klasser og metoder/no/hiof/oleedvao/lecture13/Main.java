package no.hiof.oleedvao.lecture13;

import no.hiof.oleedvao.lecture13.models.Circle;
import no.hiof.oleedvao.lecture13.models.Figure;
import no.hiof.oleedvao.lecture13.models.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Ettersom klassen Figure er deklarert som abstract kan vi ikke opprette objekter av denne klassen direkte...
        //Figure figure = new Figure("blue");

        // ... På en annen side kan vi fint opprette objekter av Figure sine barneklasser
        Rectangle rectangle = new Rectangle("green", 10, 4);
        Circle circle = new Circle("yellow", 4.7);

        // Under demonstreres bruk av (de abstrakte) metodene for omkrets og areal som er blitt implementert i hver av
        // Rectangle og Circle.
        System.out.println("-----Rectangle------");
        System.out.println("circumference: " + rectangle.circumference());
        System.out.println("area: " + rectangle.area());

        System.out.println();
        System.out.println("-----Circle-----");
        System.out.println("circumferance: " + circle.circumference());
        System.out.println("area: " + circle.area());


    }
}
