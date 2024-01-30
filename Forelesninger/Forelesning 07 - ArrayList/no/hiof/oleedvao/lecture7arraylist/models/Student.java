package no.hiof.oleedvao.lecture7arraylist.models;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;
    private String birthNumber = "12345678910";
    private Course favoriteCourse;
    // Instansvariabel som holder på en liste med Course-objekter.
    // Her kan de også være fornuftig å initialisere listen samtidig som vi deklarerer den.
    // Dette vil medfølge at alle Student-objekter får en tom liste som utgangspunkt, men vil ellers være unik for
    // hvert objekt.
    private ArrayList<Course> courses = new ArrayList<>();


    public Student() {

    }

    public Student(String firstName, String lastName, int age,
                   String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }

    // Her har vi definert en egen dedikert metode for å legge til kurs i stedet for å ha gettere og settere for
    // instansvariabelen courses.
    public void addCourse(Course courseObject) {
        courses.add(courseObject);
    }

    // Her har vi definert en egen dedikert metode for å returnere antall kurs i stedet for å ha gettere og settere for
    // instansvariabelen courses.
    public int getNumCourses() {
        return courses.size();
    }

    // Her har vi definert en egen dedikert metode for å printe Student-objektet sine kurs i stedet for å ha gettere
    // og settere for instansvariabelen courses.
    public void printCourses() {
        for (Course courseX : courses) {
            System.out.println(courseX.getCourseName());
        }
    }

    // Her har vi definert en egen dedikert metode for å fjerne et kurs i stedet for å ha gettere
    // og settere for instansvariabelen courses.
    public void removeCourse(Course courseObject) {
        courses.remove(courseObject);
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

    public Course getFavoriteCourse() {
        return favoriteCourse;
    }

    public void setFavoriteCourse(Course favoriteCourse) {
        this.favoriteCourse = favoriteCourse;
    }


    // Det kan være lurt å vurdere å fjerne gettere og settere for instansvariabler med lister ettersom dette vil
    // fjøre til full kontroll over listen fra utsiden av klassen gjennom get-metoden, mens set-metoden bare vil
    // bli brukt til å opprette en helt ny liste, som vi veldig skjeldent ønsker.
    /*
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }

     */

    public void printDescription() {
        System.out.println("Hi! I am a " + age + " year old student. My name is " + firstName + " " + lastName + ".");
    }
}
