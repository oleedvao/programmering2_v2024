package no.hiof.oleedvao.lecture21.repositories;

import no.hiof.oleedvao.lecture21.models.Zoo;

// Dette er et interface som definerer de metodene som et gitt "ZooRepository" skal ha. Altså metoder for å hente ut
// data. Grunnen til at dette defineres via et interface er at det kan finnes mange repository-implementasjoner:
// Ett som benytter hardkodede data, ett som benytter databaser osv.
public interface ZooRepository {

    // Abstrakt metode for å hente ut en Zoo basert på navn.
    Zoo getZoo(String zooName);

}
