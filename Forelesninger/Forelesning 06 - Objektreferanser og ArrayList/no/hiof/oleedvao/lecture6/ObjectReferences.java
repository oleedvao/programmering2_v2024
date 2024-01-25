package no.hiof.oleedvao.lecture6;

import no.hiof.oleedvao.lecture6.models.Student;

public class ObjectReferences {

    public static void main(String[] args) {

        // Her oppretter vi et Student-objekt som én variabel og setter en annen Student-variabel lik verdien av denne.
        Student student1 = new Student("Ole-Edvard", "Ørebæk", 26, "123456");
        Student student2 = student1;

        // Vi kan se at både student1 og student2 har samme innhold
        student1.printDescription();
        student2.printDescription();

        // Her endrer vi student1 sitt etternavn, men ikke for student2
        student1.setLastName("Antonsen");


        // Til tross for at vi bare endret etternavnet på den éne Student-variabelen over blir resultatet at begge
        // varablene har fått denne endringen. Dette er fordi objekt-variabler peker på et objekt. Ved å sette en
        // objekt-variabel lik en annen er IKKE dette det samme som å kopiere objektet, men vi vil istedet får to
        // variabler som peker på nøyaktig samme objekt. Altså hvis vi endrer objektet gjennom én variabel vil dette
        // bli tilfellet for alle variabler som peker på dette objektet.
        System.out.println();
        student1.printDescription();
        student2.printDescription();

    }

}
