package no.hiof.oleedvao.lecture8.models;

// For denne klassen velger vi å arve fra klassen Person ved bruk av nøkkelordet extends i klassedefinisjonen.
// Altså vil Carpenter arve Person sine variabler og metoder, i dette tilfellet instansvariablene firstName, lastName
// og age, samt metoder relatert til dette. Merk likevel at det som er definert som private ikke vil være direkte
// tilgjengelig i barneklasser, som denne.
public class Carpenter extends Person {

    // Dette er en private instansvariabel som er unik for Carpenter og representerer hvor mange hus en "snekker" har
    // bygd.
    private int numHousesBuilt;

    // Merk at vi ikke trenger å definere instansvariabler for firstName, lastName og age ettersom disse blir arvet
    // fra Person.

    // En barneklasse sin konstruktør må, ganske strengt, samsvare med foreldreklassen sin konstruktør.
    // Dette innebærer at konstruktøren må ha minst samme parametere som foreldreklassen sin, men kan ha flere egne.
    // Under ser vi at de tre første parameterene er de samme som Person-konstruktøren tar, mens den fjerde er ny/unik
    // for Carpenter-klassen.
    public Carpenter(String firstName, String lastName, int age,
                     int numHousesBuilt){
        // For arvede instansvariabler, som altså kommer fra foreldreklassen, vil vi sende disse opp til foreldreklassen
        // via super(). super() er essensielt som ett kall til foreledreklassens konstruktør. Altså må vi sende
        // parametere i samme rekkefølge som foreldreklassens konstruktør vil ha de og foreldreklassens konstruktør
        // vil kjøre. I dette tilfellet vil den sette verdiene vi sender med i super for instansvariablene.
        super(firstName, lastName, age);

        // Vi setter Carpenter sin unike instansvariabel som vanlig.
        this.numHousesBuilt = numHousesBuilt;
    }

    // Vi oppretter gettere og settere for instansvariabelen, som vanlig
    public int getNumHousesBuilt() {
        return numHousesBuilt;
    }

    public void setNumHousesBuilt(int numHousesBuilt) {
        this.numHousesBuilt = numHousesBuilt;
    }
}
