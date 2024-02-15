package no.hiof.oleedvao.lecture11.models;

public class Person {

    // En statisk variabel kan tenkes å tilhøre klassen selv og inneholder alltid den samme verdien for alle objekter.
    // Altså skiller statiske variabler seg fra instansvariabler, hvor verdiene i motsetning er unike per objekt.
    // Med andre ord, hvis vi eventuelt endrer på verdien for en statisk variabel gjennom et objekt, vil verdien
    // samtidig endre seg for alle andre objekter. Igjen, den statiske variabelen er tilhørende klassen som en helhet.
    // Under er det definert opp en statisk variabel som skal kunne holde på en oversikt over hvor mange objekter
    // av klassen som er blitt opprettet i programmet, og skal oppdateres hver gang ett objekt opprettes.
    private static int numPersons = 0;

    protected String firstName;
    protected String lastName;
    protected int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        // Her oppdateres den statiske variabelen slik at den itereres oppover med 1 hver gang et objekt opprettes.
        numPersons++;
    }

    // Når vi ønsker å hente ut verdier av statiske variabler bør vi opprette egne getter-metoder for dette som også er
    // statiske, og som dermed også tilhører klassen og ikke individuelle objekter. Hadde vi her ønsket å skulle endre
    // på verdien for den statiske variabelen på utsiden burde vi på lik linje opprettet en statisk setter,
    // altså med syntaksen  public static void setNumPersons() { ... }
    public static int getNumPersons() {
        return numPersons;
    }

    public void compareAgeWith(Person person) {
        if (this.age > person.age) {
            System.out.println(this.firstName + " " + this.lastName + " is older.");
        }
        else if (this.age < person.age) {
            System.out.println(person.firstName + " " + person.lastName + " is older.");
        }
        else {
            System.out.println("The persons are the same age.");
        }
    }


    @Override
    public String toString() {
        return "My name is " + firstName + " " +
                lastName + " and I am " + age + " years old.";
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
