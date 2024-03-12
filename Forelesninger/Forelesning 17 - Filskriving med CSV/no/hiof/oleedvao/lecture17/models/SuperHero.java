package no.hiof.oleedvao.lecture17.models;

public class SuperHero {

    private String name;
    private String secretIdentity;

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
}
