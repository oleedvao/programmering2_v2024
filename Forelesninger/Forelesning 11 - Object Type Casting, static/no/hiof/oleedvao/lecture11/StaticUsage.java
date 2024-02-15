package no.hiof.oleedvao.lecture11;

import no.hiof.oleedvao.lecture11.models.Carpenter;
import no.hiof.oleedvao.lecture11.models.CarpenterApprentice;
import no.hiof.oleedvao.lecture11.models.Person;

public class StaticUsage {

    public static void main(String[] args) {

        //System.out.println(Person.numPersons);

        Person person1 = new Person(
                "Ole-Edvard",
                "Ørebæk",
                26);

        //person1.numPersons = 4;
        //System.out.println();
        //System.out.println(Person.numPersons);

        Person person2 = new Person(
                "Ola",
                "Nordmann",
                30);

        //System.out.println();
        //System.out.println(Person.numPersons);

        Carpenter carpenter1 = new Carpenter("John",
                "Carpenter", 50);

        //System.out.println();
        //System.out.println(Person.numPersons);

        // For å aksessere en statisk variabel referer vi til dette direkte gjennom klassen (klassen navn)
        // Merk også at det kommenterte eksemplet under er basert på at den statiske variabelen er deklarert som public.
        // Dette er fremdeles "bad practise" i Java og vi bør heller benytte innkapsling.
        //Person.numPersons = 10;
        //System.out.println(Person.numPersons);

        // Under benyttes en statisk metode getNumPersons() for å hente ut verdien av den statiske variablen.
        // Her bør vi også kalle denne direkte gjennom Klassen.
        System.out.println(Person.getNumPersons());
        // Merk også at den statiske metoden blir arvet og kan også aksesseres gjennom direkte eller indirekte
        // barneklasser.
        System.out.println(Carpenter.getNumPersons());

        // Under benyttes en statisk metode for å hente ut antall opprettede Carpenter-objekter (statisk variabel),
        // ut ifra at dette også har blitt implementert for Carpenter-klassen.
        System.out.println();
        System.out.println(Carpenter.getNumCarpenters());

        CarpenterApprentice carpenterApprentice1 = new CarpenterApprentice(
                "Noldus",
                "Gnoldus",
                23,
                "2024-2026"
        );

        System.out.println(Carpenter.getNumCarpenters());




    }

}
