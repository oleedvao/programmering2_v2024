package no.hiof.oleedvao.lecture7arraylist;

import no.hiof.oleedvao.lecture7arraylist.models.Course;
import no.hiof.oleedvao.lecture7arraylist.models.Student;

public class StudentWithCourses {

    public static void main(String[] args) {

        // Oppretter ett Student-objekt. Ettersom Student-klassen nå er definert til å ha en ArrayList med Course-
        // objekter som instansvariabel vil dette objektet ha en slik liste innehold.
        Student student1 = new Student("Ole-Edvard",
                "Ørebæk", 26, "123456");

        // Hvis vi følger innkapslingsprinsippet på normal måte kan vi aksessere og modifisere denn listen gjennom
        // dens get-metode.
        //System.out.println(student1.getCourses().size());

        // Oppretter et par Course-objekter.
        Course course1 = new Course("Programmering 2",
                "ITF10619", 10);

        Course course2 = new Course("Databasesystemer",
                "ITF10319", 10);

        // Koden under fungerer hvis vi har vanlige gettere og settere, men er argumenterbart litt dårlig i henhold til
        // innkapsling ettersom vi nå har ingen kontroll over hvilke operasjoner man kan gjøre på listen. I tillegg
        // kan vi argumentere for at koden blir lite intuitiv.
        /*
        student1.getCourses().add(course1);
        student1.getCourses().add(course2);

        System.out.println();
        System.out.println(student1.getCourses().get(0).getCourseName());
        student1.getCourses().

         */

        // Her benytter vi en dedikert metode definert i Student-klassen for å legge til Course-objekter i den aktuelle
        // studenten sin "kurs-liste".
        student1.addCourse(course1);
        student1.addCourse(course2);

        System.out.println();
        // Bruk av dedikert metode for å hente ut antall kurs.
        System.out.println(student1.getNumCourses());

        System.out.println();
        // Bruk av dedikert metode for å skrive ut alle kursene til den aktuelle studenten.
        student1.printCourses();

        // Bruk av dedikert metode for å fjerne et kurs.
        student1.removeCourse(course2);

        System.out.println();
        System.out.println("Removed course:");
        student1.printCourses();


    }

}
