package no.hiof.oleedvao.lecture14.models;

public abstract class Figure {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double circumference();

    public abstract double area();

    @Override
    public String toString() {
        // Selv om de abstrakte klassene circumference() og area() ikke har noen kodekropper definert i denne klassen
        // kan vi fremdeles benytte disse i instansmetoder. Dette går bra fordi vi aldri vil kunne opprette objekter av
        // den abstrakte klassen direkte, men av barneklasser, som må ha implementasjoner for disse.
        // Når vi gjør dette vil den nærmeste implementasjonen for de abstrakte metodene gjelde, altså de som er
        // definerte for barneklassene. 
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
