package no.hiof.oleedvao.lecture12;

import no.hiof.oleedvao.lecture12.models.Person;
import no.hiof.oleedvao.lecture12.tools.UnitConverter;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("10987654321");
        System.out.println(person.getBirthNumber());


        // Under benytter vi UnitConverter-metodene, direkte gjennom UnitConverter-klassen ettesom de er
        // statiske metoder
        double result1 = UnitConverter.cmToMeter(2356);
        System.out.println();
        System.out.println(result1);

        double result2 = UnitConverter.meterToCm(45);
        System.out.println();
        System.out.println(result2);

        double result3 = UnitConverter.meterToKm(6327283);
        System.out.println();
        System.out.println(result3);

        double result4 = UnitConverter.kmToMeter(5.6);
        System.out.println();
        System.out.println(result4);

        // Ettersom konstantene er satt til public kan vi også aksessere disse gjennom klassen (static). Merk at vi
        // likevel ikke kan endre på verdiene ettersom de er final.
        System.out.println();
        System.out.println(UnitConverter.CM_METER_FACTOR);
        //UnitConverter.CM_METER_FACTOR = 4;

        // En vanlig "verktøyklasse" i Java er Math, som inneholder en stor mengde metoder for matematiske operasjoner
        // hvis du inspiserer denne klassen, vil du se at den er definert veldig likt slik som vi defienrte
        // UnitConverter
        System.out.println();
        System.out.println(Math.sqrt(25));

    }

}
