public class ClassesAndObjects {

    public static void main(String[] args) {

        // Opprettelse av et unikt Student-objekt. Merk at datatypen er satt til klassens navn. Vi benytter nøkkelordet
        // new for å opprette objekter, samt KlasseNavn().
        Student student1 = new Student();
        System.out.println(student1); // Gir bare en rar utskrift. Mer om denne senere i kurset.
        // student1 sin firstName har enda ingen verdi fordi den er tom som standard
        System.out.println(student1.firstName);


        // Vi kan aksessere et objekt sine egenskaper/attributter ved å skrive . etter en objekt-variabel
        // (Gjelder bare egenskaper som er public)
        // Vi kan for eksempel benytte disse til å sette og endre instansvariabel-verdiene og konseptuelt gi
        // Student-objektet vårt et unikt navn, en alder og studentid.
        // (Merk likevel at denne måte å håndtere instansvariabler er problematisk over tid og er ikke hvordan vi vil
        // håndtere dette videre i kurset. Se Encapsulation og StudentV2.)
        student1.firstName = "Ole-Edvard";
        student1.lastName = "Ørebæk";
        student1.age = 26;
        student1.studentId = "123456";

        // Hvis vi skriver ut instansvariablene vil vi nå se at disse har fått verdiene vi satt over.
        System.out.println();
        System.out.println(student1.firstName);
        System.out.println(student1.lastName);
        System.out.println(student1.age);
        System.out.println(student1.studentId);


        System.out.println();

        // Vi kan opprette så mange objekter av en klasse som vi ønsker. Verdiene vi setter vil være unike for
        // hvert objekt. Altså vet java forskjellen på student1 og student1 her og husker hvilke verdier som tilhører
        // hvem. (Tiltenkt: "student1 heter Ole-Edvard, mens student1 heter John")
        Student student2 = new Student();
        System.out.println(student2.firstName);
        student2.firstName = "John";
        student2.lastName = "Doe";
        student2.age = 40;
        student2.studentId = "654321";

        System.out.println(student2.firstName);
        System.out.println(student2.lastName);
        System.out.println(student2.age);
        System.out.println(student2.studentId);


        // Vi kan også opprette objekter av andre klasser. Det er ingen begrensning for hvor mange klasser vi kan
        // definere eller hvor mange objekter vi kan opprette for hver av disse
        Course course = new Course();
        course.courseName = "Programmering 2";
        System.out.println(course.courseName);

        System.out.println();
        System.out.println("-----------");

        // I stedet for å skrive ut instansvariablene en og en som i eksempelene over er det en fordel å i stedet
        // benytte en metode for å gjøre dette mer automatisert og standardisert. Se Student-klassen for hvordan
        // den er definert.
        student1.printDescription();
        student2.printDescription();

    }

}
