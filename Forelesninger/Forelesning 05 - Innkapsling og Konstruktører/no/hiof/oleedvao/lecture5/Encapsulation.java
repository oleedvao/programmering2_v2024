package no.hiof.oleedvao.lecture5;

import no.hiof.oleedvao.lecture5.models.Student;

public class Encapsulation {
    public static void main(String[] args) {

        // Etter å fulgt innkapslings-prinsippet kan vi nå bare aksessere instansvariablene gjennom get- og set-metoder.

        Student student1 = new Student();
        // Linjen under er ikke lenger godtatt av java ettersom studentId er satt til private.
        //student1.studentId = "jdfksjf";
        System.out.println(student1.getStudentId());
        student1.setStudentId("123456");
        System.out.println(student1.getStudentId());
        student1.setFirstName("Ole-Edvard");
        System.out.println(student1.getFirstName());

        // En fordel med å benytte get- og set-metoder er at vi kan automatisere logikk, slik som å kontrollere
        // parameterverdier. Her har vi automatisert at bare alder-verdier mellom 0 og 120 er godtatt.
        // Se setAge()-definisjonen i Student-klassen for logikken.
        System.out.println();
        student1.setAge(-26);
        System.out.println(student1.getAge());
        student1.setAge(300);
        System.out.println(student1.getAge());
        student1.setAge(26);
        System.out.println(student1.getAge());

        // En annen fordel med get- og set-metoder er at vi kan kontrollere akkurat hvilke handlinger som skal være lov
        // for en gitt instansvariabel. Her kan vi bare lese birthNumber, men ikke sette noen ny verdi.
        // Det motsatte hadde også vært mulig ved å bare opprette en set-metode og ingen get-metode.
        System.out.println();
        System.out.println(student1.getBirthNumber());



    }
}
