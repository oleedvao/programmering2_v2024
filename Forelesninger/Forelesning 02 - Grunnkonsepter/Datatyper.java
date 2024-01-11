import java.util.Arrays;

public class Datatyper {
    public static void main(String[] args) {
        // Dette er en variabeldeklarasjon. For å gjøre dette kreves det at vi definerer en datatype og et navn.
        int number;
        //System.out.println(number); // Forsøker vi å skrive ut, vil vi få en feilmelding.

        // Selve initialiseringen (setting av verdi) er noe vi kan gjøre separat fra variabelens deklarasjon.
        // Java er veldig streng på at verdien vi setter inn må være tilsvarende datatypen vi deklarerte variabelen med.
        // (I dette tilfellet int.)
        number = 42;
        System.out.println(number);

        // int er selvfølgelig ikke den eneste mulige datatypen. Her benytter vi double for decimal tall.
        double decimalNumber = 3.14;
        System.out.println(decimalNumber);
        // Dette er en variabel av typen long. Merk at vi må avslutte tallet med L for at det skal riktig tolkes som
        // en long-verdi. Vanlige heltall tolkes som int til standard.
        long longNumber = 7_483_274_982_374_982_374L;
        // Dette er et eksempel på en float, merk at vi må avslutte decimaltallet med F for at det skal tolkes som en
        // float. Vanlige decimaltall tolkes som double til standard.
        float floatNumber = 4.67F;
        // String fungerer som forventet...
        System.out.println();
        String stringVariable = "Ett eller annet";
        System.out.println(stringVariable);

        // Veldig enkelt eksempel på typecasting her. Hvis vi forsøker å sette inn et decimaltall (double) i en
        // int-variabel vil java bli missfornøyd. For å fikse dette må vi typecase (konvertere) decimaltallet til en
        // int. Siden decimalNumber her inneholder 3.14 vil dette konvertere til 3 (decimal til heltall runder alltid
        // NED til nærmeste heltall)
        System.out.println("Typecasting:");
        int typecasting = (int)decimalNumber;
        System.out.println(typecasting);
        System.out.println();

        // Denne kodesekvensen kjører og viser at det går an å typecase long til int, men gir et veldig rart resultat.
        // Ikke tenk noe særlig på hvorfor resultatet blir som det blir. Det er ikke så viktig.
        int sum = (int)(number + longNumber);
        System.out.println(sum);
        System.out.println();


        System.out.println("Sette en variabel like en annen");
        // Hvis vi setter en variabel lik en annen variabel vil dette være det samme som å sette verdien til å være lik
        // den andre variabelens verdi. Det er altså IKKE en referanse til variabelen selv.
        int anotherNumber = 10;
        number = anotherNumber;
        System.out.println(number);
        // Hvis vi nå endrer anotherNumber, vil dette altså IKKE ha noen effekt på number. Tallet i number vil
        // fremdeles være uendret (10).
        anotherNumber = 5;
        System.out.println(number);
        System.out.println();




        System.out.println("Arrays:");
        // Her deklareres det en String-array, men vi kunne like fint benyttet en annen datatype.
        String[] stringArray;
        // Her opprettes selve arrayen og vi må definere en størrelse (her 3, som satt på insiden av klammeparantes).
        // 3 er likevel ikke noe magisk tall her, vi kunne satt størrelsen til å være noe helt annet. f.eks. 10, 100,
        // 5 osv. Det som er viktig å bemerke er imidlertid at arrays er låst i størrelse etter de har blitt opprettet.
        // Hvis vi trenger flere posisjoner enn vi nå har satt, må vi opprette en helt ny array.
        // Ikke tenk så mye må nøkkelordet new enda. Vi kommer tilbake til dette senere i kurset. Bare vit at dette er
        // nødvendig for å opprette arrayen.
        stringArray = new String[3];
        // For å skrive ut en array er dette litt spesielt, hvor vi må benytte Arrays.toString() for å få en forståelig
        // utskrift. Ikke tenk så altfor mye på dette heller, bare vit at dette er forskjellig fra typecasting.
        // Ettersom vi til nå bare har opprettet arrayen uten å sette inn noe i posisjonene er de enn så lenge tomme.
        System.out.println(Arrays.toString(stringArray));
        // Selv om vi ikke kan endre på størrelsen av arrayen, kan vi oppdatere verdiene i hver opprettet posisjon,
        // så lenge disse tilsvarer arrayens datatype (her String).
        // For å oppdatere posisjonenes verdier må vi referere til deres indexer (starter på 0 og går oppover) ved å
        // benytte array-variabelen og klammeparantes.
        stringArray[0] = "Første pos";
        System.out.println(Arrays.toString(stringArray));
        stringArray[2] = "Siste pos";
        System.out.println(Arrays.toString(stringArray));
        // Merk at vi ikke kan aksessere eller modivisere en posisjon som ikke eksisterer.
        // Dette gir en feilmelding
        stringArray[100] = "jfkdjfksd";



    }
}
