public class StudentV2 {

    // fornavn, etternavn, alder og studentid
    public String firstName;
    public String lastName;
    public int age;
    private String studentId;


    public void printDescription() {
        System.out.println("Hi! I am a " + age + " year old student." +
                " My name is " + firstName + " " + lastName + ".");
    }

}
