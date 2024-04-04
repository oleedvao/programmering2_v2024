package no.hiof.oleedvao.lecture21.models;

public abstract class Animal {
    private final int id;
    private String name;
    private static int numAnimals;
    protected String species;

    public Animal(String name) {
        this.id = 1000 + numAnimals;
        this.name = name;
        numAnimals++;
    }

    public final int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumAnimals() {
        return numAnimals;
    }

    public static void setNumAnimals(int numAnimals) {
        Animal.numAnimals = numAnimals;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
