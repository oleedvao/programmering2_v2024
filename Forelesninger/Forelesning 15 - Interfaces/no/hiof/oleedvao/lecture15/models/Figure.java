package no.hiof.oleedvao.lecture15.models;

import no.hiof.oleedvao.lecture15.InterfaceUsage;
import no.hiof.oleedvao.lecture15.interfaces.Drawable;

// Her ser vi en implementasjon av to interfaces ved bruk av nøkkelordet implements: Drawable og Comparable.
// Merk at vi kan implementere så mange interfaces som vi ønsker for en gitt klasse. Vi kan også gjøre dette sammen
// med arv, f.eks:    public class Class extends AnotherClass implements Interface { ... }
// Drawable interfacet sier at Figure skal ha funksjonalitet for å kunne "tegnes".
// Mens Comparable<Figure> sier at alle objekter av denne klassen skal kunne sammenlignes med objekter av Figure (her
// den samme klassen).
// En implementasjon av interfaces vil typisk kreve at de abstrakte metodene som er inneholdt i hver av disse blir
// overridet direkte i den gjeldende klassen, men siden Figure i dette tilfellet er abstract er ikke dette et direkte
// krav her, men vil være påkrevd i barneklassene, som ikke er abstracte og som vi ønsker å opprette objekter av.
public abstract class Figure implements Drawable, Comparable<Figure> {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    // Dette er en implementasjon av compareTo()-metoden, som er påkrevd av Comparable<Figure>-implementasjonen.
    // Merk her at parameteren (Figure o) er av typen Figure. Dette er basert på at vi har spesifisert Figure i <>
    // i Comparable<Figure> i implementasjonen i toppen av klassen.
    // compareTo() er en metode som benyttes av diverse ferdiglagde sorterings-metoder for slikt som lister.
    // Metoden fungerer slikt at det skal returneres en int-verdi, hvor hvis denne er positiv vil det si at
    // objektet som kaller metoden er "større" en det det sammenlignes med, eller hvis verdien er negativ er den
    // "mindre", mens hvis verdien er 0 er de like store.
    @Override
    public int compareTo(Figure o) {
        // Logikken for hvordan int-verdiene blir beregnet er opp til programmereren og typisk avhengig av hva for
        // slags type objekter det er snakk om. Under er et eksempel av hvordan man kan sammenligne areal mellom
        // det gjeldende objektet (this) og det det sammenlignes med (o). Det under tar utganspunkt i at objekter skal
        // sorteres stigende, men hvis vi ønsker å få en synkende sortering kan vi bytte om på hvor det returneres en
        // negativ og positiv verdi.
        /*
        if (this.area() < o.area()) {
            return -1;
        }
        else if (this.area() > o.area()) {
            return 1;
        }
        else {
            return 0;
        }
         */

        // En enklere og mindre manuell måte å gjøre dette på er å benytte Double.compare(), som tar verdiene
        // og gjør i praktis det samme som i eksemplet over (stingende sortering).
        // Hvis vi hadde sammenlignet int-verdier kunne vi eventuelt benyttet Integer.compare().
        return Double.compare(this.area(), o.area());

        // For å fått en synkende sortering kan vi enten returnere det negative (-) resultatet av det samme metodekallet,
        // eller stokke om på rekkefølgen av parameterene
        //return -Double.compare(this.area(), o.area());
        //return Double.compare(o.area(), this.area());
    }

    public abstract double circumference();

    public abstract double area();

    @Override
    public String toString() {
        return "This figure has a circumference of " + circumference() +
                " and an area of " + area() + ".";
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
