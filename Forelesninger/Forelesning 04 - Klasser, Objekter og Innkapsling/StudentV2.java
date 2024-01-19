public class StudentV2 {


    public String firstName;
    public String lastName;
    public int age;
    // Instansvariabelen studentId er satt til private. Dette betyr at variabelen bare kan leses og endres på innsiden
    // av klassen den er definert, altså StudentV2 i dette tilfellet. Vi kan dermed ikke sette verdien for denne
    // som ble gjort for Student-objektene i den kjørbare klassen ClassesAndObjects.
    private String studentId;


    public void printDescription() {
        System.out.println("Hi! I am a " + age + " year old student." +
                " My name is " + firstName + " " + lastName + ".");
    }

}
