// Mange klasser kan tenkes på som en egendefinert dataype som modellerer noe i programmet vårt.
// Klassen under modellerer studenter i genrell forstand. Altså er det under ikke en definisjon av én student, men
// en definisjon av hva som vil være felles for alle mulige studenter. Altså kan en klasse anses som en generell
// beskrivelse eller oppskrift på noe spesifikt.
public class Student {

    // Vi kan deklarere variabler i klassen for å definere hvilke typer vardier ("egenskaper") objekter av klassen
    // skal ha. Merk at disse bare er deklarasjoner og ikke får spesifikke tilegnede verdier. Spesifikke verdier
    // blir satt unikt for opprettede objekter. Slike variabler kalles "instansvariabler".
    public String firstName;
    public String lastName;
    public int age;
    public String studentId;


    // Metoden under vil kunne benyttes til å skrive ut en beskrivelse av et hvilket som helst objekt.
    // Ettersom det refereres til instansvariablene vil verdiene som blir skrevet ut her være avhengig av hvilket
    // objekt som kaller metoden.
    public void printDescription() {
        System.out.println("Hi! I am a " + age + " year old student. My name is " + firstName + " " + lastName + ".");
    }

}
