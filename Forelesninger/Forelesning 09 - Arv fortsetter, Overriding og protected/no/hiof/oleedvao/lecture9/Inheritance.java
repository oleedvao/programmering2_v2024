package no.hiof.oleedvao.lecture9;


import no.hiof.oleedvao.lecture9.models.BussDriver;
import no.hiof.oleedvao.lecture9.models.Carpenter;
import no.hiof.oleedvao.lecture9.models.CarpenterApprentice;
import no.hiof.oleedvao.lecture9.models.Person;

public class Inheritance {

    public static void main(String[] args) {

        Person person1 = new Person("Jimmy", "Neutron", 12);
        System.out.println(person1.getFirstName() + " " + person1.getLastName());


        Carpenter carpenter1 = new Carpenter("Rudolf", "Arnesen", 45, 3);
        System.out.println();
        System.out.println(carpenter1.getFirstName() + " " + carpenter1.getLastName());
        System.out.println(carpenter1.getNumHousesBuilt());


        BussDriver bussDriver1 = new BussDriver("Ola", "Normann", 30, "630 - Moss, Halden");
        System.out.println();
        System.out.println(bussDriver1.getFirstName() + " " + bussDriver1.getLastName());
        System.out.println(bussDriver1.getRoute());

        bussDriver1.setFirstName("Noldus");
        bussDriver1.setLastName("Gnoldus");
        System.out.println(bussDriver1.getFirstName() + " " +
                bussDriver1.getLastName());


        // Vi ser at objekter av CarpenterApprentice har alle se samme mulighetene som både Carpenter-objekter
        // og Person-objekter.
        CarpenterApprentice carpenterApprentice1 = new CarpenterApprentice(
                "Jon",
                "Skog",
                35,
                0,
                "2024-2026"
        );
        System.out.println();
        System.out.println(carpenterApprentice1.getFirstName());
        System.out.println(carpenterApprentice1.getNumHousesBuilt());
        System.out.println(carpenterApprentice1.getTrainingPeriod());


        /*
        System.out.println();
        person1.printDescription();
        carpenter1.printDescription();
        bussDriver1.printDescription();
        carpenterApprentice1.printDescription();

         */


        // Utskriftene under benytter toString() metoden for å få en tekstlig representasjon av objektene.
        // Se hvordan toString() er overridet i hver av objektenes klasser for mer info.
        // Merk også at når vi skriver ut trenger vi ikke å kalle .toString(). Java skjønner automatisk at vi ønsker å
        // benytte toString() når vi skriver ut et objekt.
        System.out.println();
        System.out.println(person1.toString());
        System.out.println(person1);
        System.out.println(carpenter1);
        System.out.println(bussDriver1);
        System.out.println(carpenterApprentice1);


        // Etter å ha endret til protected har vi fremdeles ikke mulighet til å aksessere instansvariablene på utsiden
        // av klassehierarkiet. Altså er disse fremdels beskyttet av innkapslingssprinsippet.
        //person1.firstName =



    }

}