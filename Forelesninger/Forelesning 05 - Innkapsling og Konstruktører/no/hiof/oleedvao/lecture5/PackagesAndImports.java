// Når vi benytter en pakkestruktur må hver java-fil ha en package-statement som spesifiserer hvor den gjeldene filen
// er lokalisert i prosjektet.
package no.hiof.oleedvao.lecture5;

// Linjene under demonstrerer hvordan vi kan importere individuell klasser som ligger i en undermappe (en annen pakke).
import no.hiof.oleedvao.lecture5.models.Student;
import no.hiof.oleedvao.lecture5.models.Course;

// Alternativt kan vi importere alle klassene som ligger i en gitt pakke (her models) ved å benytte *;
//import no.hiof.oleedvao.lecture5.models.*;

public class PackagesAndImports {
    public static void main(String[] args) {

        // Når vi benytter en pakkestruktur må vi også importere klassene vi skal benytte, som vist over.
        Student student1 = new Student();
        Course course = new Course();
    }

}
