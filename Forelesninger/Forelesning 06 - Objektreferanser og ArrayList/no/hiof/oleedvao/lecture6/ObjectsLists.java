package no.hiof.oleedvao.lecture6;

import no.hiof.oleedvao.lecture6.models.Course;
import no.hiof.oleedvao.lecture6.models.Student;

import java.util.ArrayList;

public class ObjectsLists {

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
        courseList.add(course1);

        // Vi kan nå se at vi har fått et Course-objekt på første posisjon i listen og vi kan referere til dette
        // objektet ved bruk av ArrayList sin .get()-metode og eventuelt gjøre operasjoner på dette objektet direkte.
        System.out.println();
        System.out.println(courseList.size());
        System.out.println(courseList.get(0));
        System.out.println(courseList.get(0).getCourseName());


    }
}
