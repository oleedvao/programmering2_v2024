public class BasicConcepts {

    public static void main(String[] args) {

        System.out.println(args[0] + " " + args[1]);

        //If-tests
        // Forklaring: if-tester fungerer likt som i andre programmeringsspråk men noen minimale forskjeller i
        // syntaks. Betingelsene må spesifikt defineres innen for () og kode-kroppen for hver if-test
        // defineres på innsiden av {}
        // I java skriver vi else if i stedet for foreksempel elif.
        int number = 10;
        if (number < 5) {
            System.out.println("The number is less than 5.");
        }
        else if (number > 15) {
            System.out.println("The number is greater than 15.");
        }
        else {
            System.out.println("Bingus");
        }

        // While-loops
        // Forklaring: Fungerer likt som i andre programmersspråk, men som med if-tester defineres betingelsen innenfor
        // () og kode-kroppen innen {}
        System.out.println();
        int iteration = 0;
        while (iteration < 5) {
            System.out.println(iteration);
            // operatoren ++ oppdaterer variabelen ved å øke verdien med 1.
            iteration++;
        }

        //For-loops
        // Forklaring: For-løkker har litt flere syntaks-forskjeller enn de tidligere konseptene.
        // Mer spesifikt må vi i Java være veldig tydelige på intereringslogikken og definere denne ganske så manuelt.
        // Dette kan konseptuelt deles i tre kompoentent som alle skrives på innsiden av () og er sepparert med ;
        // Første komponent er "iterasjonsreferansen/-variabelen" som er en lokal variabel vi definerer for å holde
        // styr på hvilken iterasjon vi er i. Under er denne definert som int x = 0 og betyr at vi starter denne på 0.
        // Andre komponent er sluttbetingelsen og fungerer likt som en betingelse i en while-løkke gjør. Her er denne
        // definiert som x < 5. Altså vil løkken kjøre så lenge x er mindre enn 5.
        // Tredje og siste komponent er oppdateringslogikken som skal utføres for "iterasjonsreferansen" x per
        // iterasjon. Her venytter vi ++ for å øke x med en hver iterasjon.
        // Når alt kommer sammen vil denne løkken i praksis kjøre 5 ganger og skrive ut tallene 0 til 4. Altså
        // tilsvarende som while-løkken definert over.
        // Som en liten ting å nevne: Det er mulig å definere løkker som itererer gjennom liste-elementer, men vi
        // sparer dette til senere i kurset.
        System.out.println();
        for (int x = 0; x < 5; x++) {
            System.out.println(x);
        }

        // Vi kan også være kreative med iterasjonslogikken. For eksempel kan vi starte x på 5 og iterere nedover ved
        // å benytte --. Men da må vi i så fall også passe på at sluttbetingelsen samsvarer med at det itereres nedover.
        System.out.println();
        for (int x = 5; x > 0; x--) {
            System.out.println(x);
        }

        // Vi kan også iterere med større sted ved å oppdatere ved bruk av +=, -=, *= eller lignende. Vi kan være
        // kreative her.
        System.out.println();
        for (int x = 0; x < 10; x += 3) {
            System.out.println(x);
        }

        // Methods
        // Forklaring: Vi kaller metode-navent for å utføre dens kode.
        System.out.println();
        printSomething();

        // Forklaring: Hvis metoden har en parameter må vi sende med en verdi som tilsvarer parameterens datatype.
        System.out.println();
        printNumberTo(7);
        System.out.println();
        printNumberTo(3);

        // Forklaring: Hvis metoden har en return-verdi er det oftest naturlig å lagre verdien denne i en variabel.
        System.out.println();
        double pi = returnPi();
        System.out.println(pi);

    }

    // Forklaring: Dette er en ganske enkel metode definisjon. For nå ignorer public og static nøkkelordene, men
    // vit at static er nødvendig hvis vi skal kalle metoden direkte i main-metoden, slik vi gjør over.
    // I dette tilfellet skal metoden bare skrive noe ut og vi må i dermed definere void som return-type. Altså
    // skal ikke metoden returnere noe, og Java vil også kontrollere at det ikke blir returnert noe.
    public static void printSomething() {
        System.out.println("Something!");
    }

    // Forklaring: Her lager vi en metode som dynamisk skriver ut en rekke med tall fra 1 til og med ett slutt-tall, som
    // vi spesifiserer som en parameter innenfor (). Merk at parameteren er static-typed og må defineres med en datatype.
    // Når vi kaller metoden, som du kan se over, vil Java kontrollere at verdien vi sender inn samsvarer med denne
    // datatypen. Samt at antall parametere stemmer overens.
    public static void printNumberTo(int endNumber) {
        for (int x = 1; x <= endNumber; x++) {
            System.out.println(x);
        }
    }

    // Forklaring: Hvis vi skal returnere en verdi, må vi eksplisitt definere hvilken datatype dette skal være.
    // Her returneres en enkel double-verdi, dermed må returntypen være satt til double før metodenavnet. Java vil
    // kontrollere at det som returneres samsvarer med denne returntypen.
    public static double returnPi() {
        return 3.14;
    }

}
