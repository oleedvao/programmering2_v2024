package no.hiof.oleedvao.lecture10;

import no.hiof.oleedvao.lecture10.models.BussDriver;
import no.hiof.oleedvao.lecture10.models.Carpenter;
import no.hiof.oleedvao.lecture10.models.CarpenterApprentice;
import no.hiof.oleedvao.lecture10.models.Person;

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


        // Vi ser under at compareAgeWith() kan benyttes for å sammenligne med alle typer objekter som er av eller
        // arver fra Person.
        System.out.println();
        Person person1 = new Person("Ole-Edvard",
                "Ørebæk", 26);
        person1.compareAgeWith(person1);
        person1.compareAgeWith(carpenter1);
        person1.compareAgeWith(carpenter2);
        person1.compareAgeWith(bussDriver1);
        person1.compareAgeWith(carpenterApprentice1);
        carpenterApprentice1.compareAgeWith(carpenter1);


        // Under oppretter vi en liste med Person-objekter. Igjen ser vi at kan sette inn alle typer objekter som
        // arver fra Person, på grunn av Polymorfi.
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(carpenter1);
        personList.add(carpenter2);
        personList.add(bussDriver1);
        personList.add(carpenterApprentice1);

        // Hvis vi skal iterere gjennom listen er det naturlig å ta utganspunkt i den mest generelle formen for
        // objekt som listen kan inneholde (her Person).
        // Merk da likevel at vi i utganspunktet bare kan håndtere disse ut ifra funksjonalitet som er definert i
        // Person.
        System.out.println();
        for (Person personX : personList) {
            // Vi kan også sjekke om et objekt er av en spesifikk type klasse ved bruk av nøkkelordet instanceof, som
            // returnerer true hvis objektet er av den spesifiserte klassen og false hvis ikke.
            // Merk også at vi må først lage if-tester for barneklassene for å forsikre oss om at disse blir håndtert.
            // Hvis vi bytter om på rekkefølgen av if og else if under vil alle CarpenterApprentice-objekter bli
            // identifisert som Carpenter objekter først. Altså som en tommelfingerregel: Definer if-tester for
            // underklasser først, så for mer generelle overklasser.
            if (personX instanceof CarpenterApprentice) {
                System.out.println("CarpenterApprentice --> " + personX);
            }
            else if (personX instanceof Carpenter) {
                System.out.println("Carpenter --> " + personX);
            }
            else {
                System.out.println(personX);
            }

        }


    }
}
