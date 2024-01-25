package no.hiof.oleedvao.lecture6;

import no.hiof.oleedvao.lecture6.models.Course;
import no.hiof.oleedvao.lecture6.models.Student;

public class ObjectInObject {

    public static void main(String[] args) {

        Student student1 = new Student("Ole-Edvard", "Ørebæk", 26, "123456");
        // Vi kan se at Student-objektet har fått instansvariabelen favoriteCourse, men den har ikke fått noen verdi
        // enda
        System.out.println(student1.getFavoriteCourse());

        // Vi oppretter et nytt Course-objekt med dens konstruktør
        Course course1 = new Course("Programmering 2", "ITF10619", 10);

        // Vi kan benytte Student-objekts set-metode for favoriteCourse for å sette verdien for denne.
        // Merk her at det kontrolleres at det som sendes inn faktisk er tilsvarende et Course-objekt.
        student1.setFavoriteCourse(course1);

        System.out.println();
        // Det under henter Student-objektets favoriteCourse (Course-objektet) og skriver ut courseName for dette
        // objektet.
        // Altså er det som returneres av student1.getFavoriteCourse() et Course-objekt og kan benyttes på
        // akkurat samme måte som en variabel med et Course-objekt. Dermed kan vi kalle slikt som .getCourseName()
        // eller .setStudyPoints() direkte på student1.getFavoriteCourse()
        System.out.println(student1.getFavoriteCourse().getCourseName());



    }

}
