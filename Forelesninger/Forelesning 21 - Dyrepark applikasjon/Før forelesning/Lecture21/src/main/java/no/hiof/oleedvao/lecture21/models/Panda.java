package no.hiof.oleedvao.lecture21.models;

public class Panda extends Animal{
    private String kungFuBelt;

    public Panda(String name, String kungFuBelt) {
        super(name);
        this.kungFuBelt = kungFuBelt;
        species = "Panda";
    }

    public String getKungFuBelt() {
        return kungFuBelt;
    }

    public void setKungFuBelt(String kungFuBelt) {
        this.kungFuBelt = kungFuBelt;
    }
}
