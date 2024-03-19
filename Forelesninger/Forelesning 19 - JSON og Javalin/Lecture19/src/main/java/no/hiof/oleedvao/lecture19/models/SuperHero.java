package no.hiof.oleedvao.lecture19.models;

import java.util.ArrayList;

// Klasse med intern liste med objekter. Altså en litt mer komplisert datastruktur enn bare rene data.
public class SuperHero {
    private String name;
    private String secretIdentity;
    private ArrayList<SuperHero> sidekicks = new ArrayList<>();

    public SuperHero() {

    }

    public SuperHero(String name, String secretIdentity) {
        this.name = name;
        this.secretIdentity = secretIdentity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public ArrayList<SuperHero> getSidekicks() {
        return sidekicks;
    }

    public void setSidekicks(ArrayList<SuperHero> sidekicks) {
        this.sidekicks = sidekicks;
    }
}
