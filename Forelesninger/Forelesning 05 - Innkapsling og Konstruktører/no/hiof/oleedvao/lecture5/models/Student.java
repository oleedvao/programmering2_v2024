package no.hiof.oleedvao.lecture5.models;

public class Student {
    // Alle instansvariablene har nå blitt satt til private som forhindrer dem i å bli direkte benyttet på utsiden av
    // klassen.
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;
    // Måten verdien under blir satt er ikke slik vi typisk bør gjøre det, men vi gjør det her enkelt og later her som
    // denne verdien har blitt hentet fra eksterne kilder.
    private String birthNumber = "12345678910";


    // Det følgende er den enkleste formen for en konstruktør vi kan opprette. Dette er også standard-konstruktøren
    // hvis vi ikke definerer den eksplisitt. En konstruktør definert som dette vil bare opprette et objekt av klassen
    // og ingenting mer. Før vi diskuterte dette temaet var det dette vi gjorde med Student(), som slik:
    //     Student student = new Student()
    public Student() {

    }

    // Vi kan også definere konstruktører med parametere og kodelogikk. Parameterene tas imot og kodelogikken vil i
    // så fall kjøre når vi oppretter et objekt ved bruk av denne konstruktøren (altså med tilsvarende parametere)
    // Det er typisk å benytte konstruktører for å ta imot og sette verdier for instansvariablene, slik at dette
    // kan smidig gjøres samtidig som man oppretter objekter og med én kodelinje. Se den kjørbare klassen Constructor.
    public Student(String firstName, String lastName, int age,
                   String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }


    // For å kunne aksessere private instansvariabler må vi i stedet opprette metoder for dette (gettere og settere)

    // Det følgende er en typisk definisjon av en getter, som enkelt returnerer verdien i instansvariabelen (firstName,
    // i dette tilfellet).
    public String getFirstName() {
        return firstName;
    }

    // Det følgende er en typisk definisjon av en setter, som oppdaterer instansvariabelen, angitt med this.firstName
    // her, og setter den lik verdien som blir sent med parameteren.
    public void setFirstName(String firstName) {
        // nøkkelordet this referer til det aktuelle objektet som kaller metoden. Altså vil verdien for
        // instansvariabelen bare endres for akkurat det objektet som kaller setFirstName(). this brukes her også for å
        // skille mellom instansvariabelen (her this.firstName) og parameteren (her firstName)
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

    // I denne setteren har vi lagt til en ekstra kontroll over hva som sendes inn for alder.
    // hvis verdien er mindre enn 0 vil instansvariabelen automatisk settes til 0
    // hvis verdien er over 120 blir instansvariabelen automatisk satt til å være 120
    // mens alle verdier mellom dette vil direkte bli benyttet som ny verdi for instansvariabelen
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else if (age > 120) {
            this.age = 120;
        }
        else {
            this.age = age;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Instansvariabelen birthNumber har bare en get-metode og kan derfor bare leses, og ikke overskrives fra utsiden
    // av klassen. Dette kan være fordelaktig i tilfeller hvor vi ønsker å begrense muligheter for lesing og endring.
    // Det motsatte, med bare en set-metode, er også en mulighet.
    public String getBirthNumber() {
        return birthNumber;
    }

    public void printDescription() {
        System.out.println("Hi! I am a " + age + " year old student. My name is " + firstName + " " + lastName + ".");
    }
}
