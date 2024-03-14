package no.hiof.oleedvao.lecture18.tools;

import no.hiof.oleedvao.lecture18.interfaces.FileHandler;
import no.hiof.oleedvao.lecture18.models.SuperHero;

// Den store styrken av generic interfaces er at vi kan implementere det samme interfacet for mange klasser men hvor
// datatypen for metodene likevel kan være unik. Her ser vi en tiltenkt klasse for å håndtere lesing/skriving av
// SuperHero-objekter.
public class SuperHeroFileHandler implements FileHandler<SuperHero> {

    // Merk at andre parameter nå er tilpasset SuperHero-objekter.
    @Override
    public void writeToFile(String fileName, SuperHero superHero) {

    }

    // Merk at return-typen nå er tilpasset SuperHero-objekter.
    @Override
    public SuperHero readFromFile(String fileName) {
        return null;
    }
}
