package no.hiof.oleedvao.lecture8.models;

// Klassen Person er i seg selv definert likt som vi har gjort i tidligere forelesninger, med private instansvariabler,
// gettere og settere og en konstruktør.
public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printDescription() {
        System.out.println("My name is " + firstName + " " +
                lastName + " and I am " + age + " years old.");
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
