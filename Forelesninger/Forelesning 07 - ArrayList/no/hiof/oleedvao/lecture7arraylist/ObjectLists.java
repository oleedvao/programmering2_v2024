package no.hiof.oleedvao.lecture7arraylist;


import no.hiof.oleedvao.lecture7arraylist.models.Course;
import no.hiof.oleedvao.lecture7arraylist.models.Student;

import java.util.ArrayList;

public class ObjectLists {

    public static void main(String[] args) {

        // Under er syntaksen for å opprette en ArrayList med Course-objekter
        // Vi kunne laget en slik ArrayList for objekter av hvilken som helst klasse.
        // Merk at hvis vi skulle opprettet en ArrayList for primitive datatyper måtte vi imidlertid benyttet en
        // wrapper-klasse for dette (Integer -> int, Double -> double, Boolean -> boolean osv.)
        ArrayList<Course> courseList = new ArrayList<>();
        System.out.println(courseList.size()); // Skriver ut listen størrelse. Til nå, 0


        // Vi oppretter her et Course-objekt og legger det til i listen ved bruk at ArrayList sin .add()-metoden, som
        // tar et objekt som parameter. Merk at dette objektet må tilsvare klassen vi definerte denne ArrayList-en
        // skulle inneholde objekter av.
        Course course1 = new Course("Programmering 2",
                "ITF10619", 10);
        // Legger til et Course-objekt i listen
        courseList.add(course1);

        // Vi kan nå se at vi har fått et Course-objekt på første posisjon i listen og vi kan referere til dette
        // objektet ved bruk av ArrayList sin .get()-metode og eventuelt gjøre operasjoner på dette objektet direkte.
        System.out.println();
        System.out.println(courseList.size());
        System.out.println(courseList.get(0));
        System.out.println(courseList.get(0).getCourseName());


        Course course2 = new Course("Databasesystemer",
                "ITF10319", 10);
        // Legger til et annet Course-objekt i listen
        courseList.add(course2);

        // Henter ut det andre Course-objektet i listen (index 1) og skriver ut dets navn
        System.out.println();
        System.out.println(courseList.size());
        System.out.println(courseList.get(1).getCourseName());


        System.out.println();
        System.out.println("For loop:");

        // Iterering av listeobjekter med vanlig løkke. Iterasjonslogikken baserer seg her på indexer fra 0 til
        // størrelsen av listen.
        for (int x = 0; x < courseList.size(); x++) {
            // Vi kan benytte iterasjons-variabelen som index for å gjøre noe med det aktuelle objektet.
            Course courseX = courseList.get(x);
            System.out.println(courseX.getCourseName() + " - " + courseX.getCourseCode());
        }

        // Oppretter og legger til et tredje Course-objekt
        Course course3 = new Course("Magi og Trolldom", "ÆØÅ", -10);
        courseList.add(course3);


        System.out.println();
        System.out.println("Reverse loop:");
        // En fordel med å benytte en vanlig for-løkke er at vi da har full kontroll over hvordan objektene i listen
        // itereres gjennom. Altså har vi muligheten til å iterere baklengs eller iterere gjennom anhvert element, eller
        // lignende
        for (int x = courseList.size()-1; x >= 0; x--) {
            Course courseX = courseList.get(x);
            System.out.println(courseX.getCourseName() + " - " + courseX.getCourseCode());
        }

        System.out.println();
        System.out.println("For each loop:");
        // Vi kan også itere på en litt smidigere måte ved bruk av for each syntaksen.
        // Her oppretter vi en variabel for hva for slags type objekt dette skal gjelde (her Course) og spesifiserer med
        // : hvilken liste som skal itereres gjennom. Vi kan lese linjen under som "for hvert Course-objekt courseX,
        // gjør *kodekropp*"
        for (Course courseX : courseList) {
            // Vi kan her gjøre hvilke operasjoner vi ønsker på iterasjonsvariabelen (vil gjelde hvert objekt i listen)
            courseX.setCourseCode("fjksdlfjls");
            System.out.println(courseX.getCourseName() + " - " + courseX.getCourseCode());
        }

        System.out.println();
        System.out.println("Remove:");

        // Vi kan også fjerne elementer i en liste ved bruk av .remove() go index. Det følgende vil fjerne det
        // tredje elementet i listen
        courseList.remove(2);
        // Skriver igjen ut inholdet av listen.
        for (Course courseX : courseList) {
            System.out.println(courseX.getCourseName() + " - " + courseX.getCourseCode());
        }

        // Koden under er kommentert ut, men kan benyttes for å illustrere hvordan neste kodesekvens fungerer.
        /*
        System.out.println();
        courseList.add(course2);
        for (Course courseX : courseList) {
            System.out.println(courseX.getCourseName() + " - " + courseX.getCourseCode());
        }
         */

        System.out.println();

        // Her benytter vi .remove() ved å spesifisere hvilket objekt som skal fjernes uavhengig av hvor i listen
        // det ligger. Denne metoden fjerner likevel bare første tilfelle av objektet. Dette kan illustreres ved å
        // uncommente den kommenterte koden på linje 96-103.
        courseList.remove(course2);
        for (Course courseX : courseList) {
            System.out.println(courseX.getCourseName() + " - " + courseX.getCourseCode());
        }
    }
}
