public class ClassesAndObjects {

    public static void main(String[] args) {

        // Opprettelse av et unikt Student-objekt. Merk at datatypen er satt til klassens navn. Vi benytter nøkkelordet
        // new for å opprette objekter, samt KlasseNavn().
        Student student1 = new Student();
        System.out.println(student1); // Gir bare en rar utskrift. Mer om denne senere i kurset.
        // student1 sin firstName har enda ingen verdi fordi den er tom som standard
        System.out.println(student1.firstName);


        // Det kommer flere kommentarer...

        student1.firstName = "Ole-Edvard";
        student1.lastName = "Ørebæk";
        student1.age = 26;
        student1.studentId = "123456";

        System.out.println();
        System.out.println(student1.firstName);
        System.out.println(student1.lastName);
        System.out.println(student1.age);
        System.out.println(student1.studentId);


        System.out.println();
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


        Course course = new Course();
        course.courseName = "Programmering 2";
        System.out.println(course.courseName);

        System.out.println();
        System.out.println("-----------");
        student1.printDescription();
        student2.printDescription();

    }

}
