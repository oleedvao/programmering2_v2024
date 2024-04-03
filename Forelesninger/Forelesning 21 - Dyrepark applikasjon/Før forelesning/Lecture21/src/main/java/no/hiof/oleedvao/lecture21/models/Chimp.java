package no.hiof.oleedvao.lecture21.models;

public class Chimp extends Animal{
    private int iq;

    public Chimp(String name, int iq) {
        super(name);
        this.iq = iq;
        species = "Chimp";
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
