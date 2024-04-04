package no.hiof.oleedvao.lecture21.repositories;

import no.hiof.oleedvao.lecture21.models.Chimp;
import no.hiof.oleedvao.lecture21.models.HoneyBadger;
import no.hiof.oleedvao.lecture21.models.Panda;
import no.hiof.oleedvao.lecture21.models.Zoo;

import java.util.ArrayList;

// Dette er en spesifikk implementasjon av et ZooRepository. Her vil repositoriet bare jobbe med hardkodede data.
// I praksis er der mer vanlig å definere repositories som benytter en annen form for persistent lagring (database,
// fillagring osv.)
public class ZooDataRepository implements ZooRepository {

    //Oppretter en liste for å holde på objektene.
    private ArrayList<Zoo> zoos = new ArrayList<>();

    // Dataene initialiseres via konstruktøren. Her er disse hardkodede, men kunne vært hentet fra en ekstern kilde.
    public ZooDataRepository() {
        Zoo kristiansand = new Zoo("Kristiansand");
        kristiansand.addAnimal(new Chimp("Julius", 90));
        kristiansand.addAnimal(new HoneyBadger("Nils"));
        kristiansand.addAnimal(new Panda("Po", "Black"));
        zoos.add(kristiansand);

        Zoo dummy = new Zoo("Dummy");
        dummy.addAnimal(new Chimp("Monke", 50));
        zoos.add(dummy);
    }

    // En implementasjon av getZoo hvor listen med Zoo-objekter gjennomgås og hvor det returneres objektet som matcher
    // med navnet mottatt som parameter.
    @Override
    public Zoo getZoo(String zooName) {
        for (Zoo zooX : zoos) {
            if (zooX.getName().equalsIgnoreCase(zooName)) {
                return zooX;
            }
        }

        return null;
    }
}
