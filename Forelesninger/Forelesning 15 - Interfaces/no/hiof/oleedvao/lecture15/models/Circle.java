package no.hiof.oleedvao.lecture15.models;

public class Circle extends Figure{

    private double radius;

    public Circle(String color, double radius) {
        super(color);

        this.radius = radius;
    }

    // Override av getDrawing() fra interfacet Drawable som er påkrevd implementert ettersom at foreldreklassen, Figure,
    // implementerer dette interfacet. Vanligvis ville dette hovedsakelig vært påkrevd i foreldreklassen direkte, men
    // ettersom Figure er abstrakt vil dette ikke være påkrevd før barneklassene som er ment å opprette objekter av.
    // Det er også hensiktsmessig å override metoden unikt per barneklasse ettersom visualisering er avhengig av typen
    // figur.
    @Override
    public String getDrawing() {
        return "  -- \n" +
                "/    \\\n" +
                "\\    /\n" +
                "  -- ";
    }

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
