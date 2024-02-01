package no.hiof.oleedvao.lecture8;

import no.hiof.oleedvao.lecture8.models.BussDriver;
import no.hiof.oleedvao.lecture8.models.Carpenter;
import no.hiof.oleedvao.lecture8.models.Person;

public class Inheritance {

    public static void main(String[] args) {

        // Opprettelse av et Person-objekt. Dette fungerer som vi er vant til fra før.
        Person person1 = new Person("Jimmy", "Neutron", 12);
        System.out.println(person1.getFirstName() + " " + person1.getLastName());

        // Her oppretter vi et objekt av Carpenter. Merk at konstruktøren her tar verdier for firstName, lastName og
        // age, i tillegg til numHousesBuilt.
        Carpenter carpenter1 = new Carpenter("Rudolf", "Arnesen", 45, 3);
        System.out.println();
        // Vi kan også se at vi gjennom dette Carpenter-objektet, har tilgang til all funksjonalitet vi vanligvis har
        // i Person-objekter og verdiene for instansvariablene arvet fra Person har blitt satt ved konstruktøren over.
        System.out.println(carpenter1.getFirstName() + " " + carpenter1.getLastName());
        // I tillegg til funksjonalitet som er arvet har vi selvfølgelig også tilgang til det som er unikt for denne
        // klassen.
        System.out.println(carpenter1.getNumHousesBuilt());

        // Opprettelse av BussDriver-objekter, som også arver fra Person, er noe likt som ved Carpenter (firstName,
        //, lastName og age), men med en unik paramter for route.
        BussDriver bussDriver1 = new BussDriver("Ola", "Normann", 30, "630 - Moss, Halden");
        System.out.println();
        // Som med Carpenter har vi tilgang til alt et Person-objekt ville hatt, i tillegg til funksjonalitet rundt
        // sin unike instansvariabel. Merk også at Carpenter- og BussDriver-objekter har ikke tilgang på hverandres
        // unike instansvariabler og Person-objekter har heller ikke tilgang på disse. Arv er en enveisforhold mellom
        // hvor egenskaper arves fra foreldreklassen til barneklassen.
        System.out.println(bussDriver1.getFirstName() + " " + bussDriver1.getLastName());
        System.out.println(bussDriver1.getRoute());

        // Vi kan også endre på instansvariabler med settere som vanlig.
        bussDriver1.setFirstName("Noldus");
        bussDriver1.setLastName("Gnoldus");
        System.out.println(bussDriver1.getFirstName() + " " + bussDriver1.getLastName());

        // Se på hvordan metoden printDescription() er definert i Person. Ettersom både Carpenter og BussDriver arver
        // fra Person får alle barneklasser tilgang til denne metoden og dens funksjonalitet
        System.out.println();
        person1.printDescription();
        carpenter1.printDescription();
        bussDriver1.printDescription();



    }

}
