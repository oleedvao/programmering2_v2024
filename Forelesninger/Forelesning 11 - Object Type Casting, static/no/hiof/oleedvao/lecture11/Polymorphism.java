package no.hiof.oleedvao.lecture11;

import no.hiof.oleedvao.lecture11.models.BussDriver;
import no.hiof.oleedvao.lecture11.models.Carpenter;
import no.hiof.oleedvao.lecture11.models.CarpenterApprentice;
import no.hiof.oleedvao.lecture11.models.Person;

import java.util.ArrayList;

public class Polymorphism {

    public static void main(String[] args) {
        Carpenter carpenter1 = new Carpenter(
                "John",
                "Doe",
                30);
        System.out.println(carpenter1);

        System.out.println();
        Carpenter carpenter2 = new Carpenter(
                "Jane",
                "Doe",
                40,
                4);
        System.out.println(carpenter2);

        System.out.println();
        BussDriver bussDriver1 = new BussDriver(
                "Ola",
                "Nordmann",
                50);
        System.out.println(bussDriver1);

        System.out.println();
        CarpenterApprentice carpenterApprentice1 = new CarpenterApprentice(
                "Noldus",
                "Gnoldus",
                23,
                "2024-2026"
        );
        System.out.println(carpenterApprentice1);

        System.out.println();
        Person person1 = new Person("Ole-Edvard",
                "Ørebæk", 26);
        person1.compareAgeWith(person1);
        person1.compareAgeWith(carpenter1);
        person1.compareAgeWith(carpenter2);
        person1.compareAgeWith(bussDriver1);
        person1.compareAgeWith(carpenterApprentice1);
        carpenterApprentice1.compareAgeWith(carpenter1);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(carpenter1);
        personList.add(carpenter2);
        personList.add(bussDriver1);
        personList.add(carpenterApprentice1);

        System.out.println();
        for (Person personX : personList) {
            if (personX instanceof CarpenterApprentice) {
                System.out.println("CarpenterApprentice --> " + personX);

                // På grunn av polymorfi vil Java fremdeles tolke personX som et objekt av Person og funksjonaliteten
                // tilgjengelig gjennom denne variabelen vil fortsatt være begrenset til Person-funksjonalitet.
                // Hvis vi ønsker å benytte spesifikk funksjonalitet for CarpenterApprentice, slik som
                // getTrainingPeriod() og setTrainingPeriod(), må vi dermed fortelle Java at objektvariabelen skal
                // spesifikt tolkes som et CarpenterApprentice-objekt. Dette gjør vi med Object Type Casting.
                // Altså som vi kan se under Type Caster vi personX til å tolkes som et CarpenterApprentice-object
                // med koden ((CarpenterApprentice) personX), og vi kan kalle funksjonalitet tilhørende
                // CarpenterApprentice gjennom den ytre parantesen. Den ytre parantesen blir altså et objekt.
                String trainingPeriod = ((CarpenterApprentice) personX).getTrainingPeriod();
                System.out.println(trainingPeriod);
            }
            else if (personX instanceof Carpenter) {
                System.out.println("Carpenter --> " + personX);

                // Under benyttes Type Casting til å konvertere Person-variabelen personX til å tolkes som et objekt
                // av Carpenter, for å få tilgang til denne klassen sin funksjonalitet.
                int numHousesBuilt = ((Carpenter) personX).getNumHousesBuilt();
                System.out.println(numHousesBuilt);
            }
            else {
                System.out.println(personX);
            }

        }


    }
}