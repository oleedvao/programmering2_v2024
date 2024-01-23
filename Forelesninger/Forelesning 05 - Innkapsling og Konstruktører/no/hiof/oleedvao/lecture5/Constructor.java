package no.hiof.oleedvao.lecture5;

import no.hiof.oleedvao.lecture5.models.Student;

public class Constructor {
    public static void main(String[] args) {

        // Her benytter vi en konstruktør til å ta imot verdier for firstName, lastName, age og studentId og sette dem
        // samtidig som Student-objektet blir opprettet.
        Student student2 = new Student("John", "Doe", 30,
                "654321");

        // Etter å ha benyttet konstruktøren er verdiene for disse instansvariablene satt og vi kan benytte dem uten å
        // foreta oss noe mer.
        student2.printDescription();
    }
}
