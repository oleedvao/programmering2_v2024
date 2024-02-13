package no.hiof.oleedvao.lecture10;

import no.hiof.oleedvao.lecture10.models.BussDriver;
import no.hiof.oleedvao.lecture10.models.Carpenter;
import no.hiof.oleedvao.lecture10.models.CarpenterApprentice;

public class Overloading {
    public static void main(String[] args) {
        // Vi har nå muligheten til å opprette et Carpenter-objekt hvor vi bare setter verdier for firstName, lastName
        // og age, mens numHousesBuilt blir håndtert automatisk i klassen...
        Carpenter carpenter1 = new Carpenter("John", "Doe", 30);
        System.out.println(carpenter1);

        // Alternativt kan vi benytte konstruktøren for Carpenter som krever at vi setter numHousesBuilt manuelt.
        // Merk at Java vet forskjellen på disse basert på parameterene og datatypene, her String, String, int, int,
        // mens forrige konstruktør benyttet var String, String, int. Altså forskjellig antall, og dermed også
        // forskjellige datatyper.
        System.out.println();
        Carpenter carpenter2 = new Carpenter("Jane", "Doe", 40, 4);
        System.out.println(carpenter2);

        // Her benytter vi en helt basic konstruktør for BussDriver, hvor route blir håndtert automatisk av klassen.
        System.out.println();
        BussDriver bussDriver1 = new BussDriver("Ola", "Nordmann", 50);
        System.out.println(bussDriver1);

        // Her benytter vi en konstruktør for vi definerer opp det vi anser som nødvendig for CarpenterApprentice
        // (firstName, lastName, age og trainingPeriod, mens numHousesBuilt blir automatisk håndtert av klassen.
        System.out.println();
        CarpenterApprentice carpenterApprentice1 = new CarpenterApprentice("Noldus", "Gnoldus",
                23, "2024-2026"
        );
        System.out.println(carpenterApprentice1);

    }
}
