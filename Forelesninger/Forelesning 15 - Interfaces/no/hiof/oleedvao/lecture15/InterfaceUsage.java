package no.hiof.oleedvao.lecture15;

import no.hiof.oleedvao.lecture15.interfaces.Drawable;
import no.hiof.oleedvao.lecture15.models.Circle;
import no.hiof.oleedvao.lecture15.models.Figure;
import no.hiof.oleedvao.lecture15.models.Person;
import no.hiof.oleedvao.lecture15.models.Rectangle;

import java.util.ArrayList;
import java.util.Collections;

public class InterfaceUsage {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("green", 6.4, 3.1);
        Circle circle = new Circle("yellow", 2.7);


        // Alle objekter som implementerer et interface vil ha tilgang på metodene som interfacet spesifiserer.
        System.out.println(rectangle.getDrawing());
        System.out.println(circle.getDrawing());

        Person person = new Person();
        System.out.println(person.getDrawing());


        // Vi kan også benytte polymorfi i forbindelse med interfaces. Altså kan vi opprette variabler og/eller lister
        // som er baserte på et interface, for eksempel Drawable. Hvis vi gjør dette, vil vi bare kunne "sette inn"
        // typer objekter som implementerer Drawable-interfacet. Gjennom slike variabler (og lister) vil vi også være
        // begrenset til denne interface-funksjonaliteten, her metoden getDrawing() (og det som ellser er arvet fra
        // Object).
        Drawable drawable = new Circle("purple", 5);
        System.out.println(drawable.getDrawing());

        ArrayList<Drawable> drawables = new ArrayList<>();
        drawables.add(rectangle);
        drawables.add(circle);
        drawables.add(person);

        for (Drawable drawableX : drawables) {
            drawableX.getDrawing();
        }


        // koden under demonstrerer listesortering.
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(new Circle("green", 1.1));
        figures.add(rectangle);


        System.out.println();
        System.out.println("-----List------");
        for (Figure figureX : figures) {
            if (figureX instanceof Rectangle) {
                System.out.println("Rectangle: " + figureX.area());
            }
            else {
                System.out.println("Circle: " + figureX.area());
            }
        }

        // Collections.sort() kan benyttes for å sortere lister i Java, men er da avhengig av at objektene som skal
        // sorteres har implementert interfacet Comparable. Merk at det ikke er nødvendig å oppdatere variabelen
        // figures på noen måte Collections.sort() vil direkte modifisere listen som sendes med som parameter.
        Collections.sort(figures);

        System.out.println();
        System.out.println("-----Sorted List------");
        for (Figure figureX : figures) {
            if (figureX instanceof Rectangle) {
                System.out.println("Rectangle: " + figureX.area());
            }
            else {
                System.out.println("Circle: " + figureX.area());
            }
        }

    }
}
