package no.hiof.oleedvao.lecture15.models;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);

        this.length = length;
        this.width = width;
    }

    // Override av getDrawing() fra interfacet Drawable som er påkrevd implementert ettersom at foreldreklassen, Figure,
    // implementerer dette interfacet. Vanligvis ville dette hovedsakelig vært påkrevd i foreldreklassen direkte, men
    // ettersom Figure er abstrakt vil dette ikke være påkrevd før barneklassene som er ment å opprette objekter av.
    // Det er også hensiktsmessig å override metoden unikt per barneklasse ettersom visualisering er avhengig av typen
    // figur.
    @Override
    public String getDrawing() {
        return "----------\n" +
                "|        |\n" +
                "----------";
    }

    @Override
    public double circumference() {
        //2*lengde + 2*vidde
        return 2*length + 2*width;
    }

    @Override
    public double area() {
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
