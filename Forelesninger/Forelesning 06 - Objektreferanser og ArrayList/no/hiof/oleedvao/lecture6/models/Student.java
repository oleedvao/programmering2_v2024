package no.hiof.oleedvao.lecture6.models;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;
    private String birthNumber = "12345678910";
    // Instansvariabelen under har klassen Course som datatype og er dermed ment til å ha et Course-objekt som verdi.
    private Course favoriteCourse;


    public Student() {

    }

    public Student(String firstName, String lastName, int age,
                   String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
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

    public String getBirthNumber() {
        return birthNumber;
    }

    // Dette er en get-metode for en Course-instansvariabel. Merk at return-typen må også være Course, altså et
    // Course-objekt.
    public Course getFavoriteCourse() {
        return favoriteCourse;
    }

    // Dette er en set-metode for en Course-instansvariabel. Merk at parameteren må ha datatypen Course, altså at den
    // må være et Course-objekt.
    public void setFavoriteCourse(Course favoriteCourse) {
        this.favoriteCourse = favoriteCourse;
    }

    public void printDescription() {
        System.out.println("Hi! I am a " + age + " year old student. My name is " + firstName + " " + lastName + ".");
    }
}
