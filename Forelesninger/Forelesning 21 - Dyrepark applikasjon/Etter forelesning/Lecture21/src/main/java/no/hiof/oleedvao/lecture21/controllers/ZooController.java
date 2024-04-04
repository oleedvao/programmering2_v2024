package no.hiof.oleedvao.lecture21.controllers;

import io.javalin.http.Context;
import no.hiof.oleedvao.lecture21.models.Animal;
import no.hiof.oleedvao.lecture21.repositories.ZooRepository;

import java.util.ArrayList;

// En Controller-klasse for å håndtere Zoo-logikk.
public class ZooController {

    // Denne klassen benytter internt et repository for å hente dataene. Merk at variabelen benytter polymorfi
    // for å kunne ta en gitt ZooRepository-implementasjon
    private ZooRepository zooRepository;

    // Det spesifikke ZooRepositoriet blir satt ved objekt-opprettelse i konstruktøren.
    public ZooController(ZooRepository zooRepository) {
        this.zooRepository = zooRepository;
    }

    // Denne metoden utfører koden for å returnere en liste med animals for en gitt Zoo i JSON-format.
    // Dette kunne i praksis vært limt rett inn i handleren for "/api/zoo/{zooName}", men abstraheres hit for
    // å skille logikken fra hverandre.
    public void getZooAnimals(Context context) {
        String zooNameParam = context.pathParam("zooName");

        ArrayList<Animal> zooAnimals = zooRepository.getZoo(zooNameParam).getAnimals();

        context.json(zooAnimals);
    }

}
