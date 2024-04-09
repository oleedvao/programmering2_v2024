package no.hiof.oleedvao.lecture22;

import no.hiof.oleedvao.lecture22.interfaces.Action;
import no.hiof.oleedvao.lecture22.interfaces.PrintCondition;
import no.hiof.oleedvao.lecture22.models.Album;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("In Rainbows", "Radiohead", 2007));
        albums.add(new Album("Souvlaki", "Slowdive", 1994));
        albums.add(new Album("SILENT HILL2", "Akira Yamaoka", 2001));
        albums.add(new Album("Pet Sounds", "The Beach Boys", 1966));
        albums.add(new Album("98.12.28", "Fishmans", 1999));
        albums.add(new Album("Blue Rev", "Alvvays", 2022));
        albums.add(new Album("Mercurial World", "Magdalena Bay", 2021));
        albums.add(new Album("The Mollusk", "Ween", 1997));
        albums.add(new Album("In The Court Of The Crimson King", "King Crimson", 1969));
        albums.add(new Album("Knocknarea", "Maruja", 2023));
        albums.add(new Album("The Downward Spiral", "Nine Inch Nails", 1994));
        albums.add(new Album("Emotion", "Carly Rae Jepsen", 2015));
        albums.add(new Album("You Will Never Know Why", "Sweet Trip", 2009));
        albums.add(new Album("Violator", "Depeche Mode", 1990));
        albums.add(new Album("Ants From Up There", "Black Country, New Road", 2022));

        System.out.println("-----------Unsorted Albums-----------");
        printAlbums(albums);

        System.out.println();
        System.out.println("-----------Standard, name sorted albums----------");
        Collections.sort(albums); // Sorteringen tar her utgangpunkt i Album-klassen sin Comparable-implementasjon
        printAlbums(albums);

        System.out.println();
        System.out.println("----------Albums sorted by year (ascending)--------");

        //Collections.sort() tillater også at vi definerer sorteringslogikken som en parameter. Spesifikt forventer den
        // et objekt basert på det funksjonelle interfacet Comparator. At interfacet er funksjonelt betyr at det bare
        // har én abstrakt metode. Vi kan definere denne sorteringslogikken på noen forskjellige måter. Vi kan
        // opprette en anonym klasse (Se 1 i kommentarblokken under) eller så kan vi benytte lambda. Fordelen med å
        // benytte lambda er at vi da unngår mye unødvendig kode og kan fokusere fult og helt på selve logikken.
        // Lambda gjør altså det samme som en anonym klasse, men kan uttrykkes med betydelig færre kodelinjer.
        // Det eneste kravet for å benytte lambda er at interfacet må være funksjonelt (bare én metode).
        // lambda defineres slik: parameter(e) -> { kode...} Det som defineres i koden er tilsvarende i den overridede
        // metoden når vi lager en anonym klasse. Merk at alt angående interface-navn, metode-navn, -return-type og
        // tilgangsmodifikator er utelatt, samt parameterenes datatyper. Dette er fordi interfacet er funksjonelt
        // og det er ingen flertydigheter for Java. Den forventer et objekt som tilsvarer interfacet og det finnes bare
        // én metode, så den trenger ikke spesifisere noe for å skille på denne og andre metoder.
        // Kodelinjen under spesifiserer altså at vi skal sammenligne to album basert på år når vi sorterer.
        // Merk at vi her gjør dette med en enkelt linje, men kunne også vært skilt i flere kodelinjer (Se 2 i
        // kodeblokken under). Vi kunne også lagret lambda-uttrykket (egentlig et objekt) som en variabel (Se 3 i
        // kodeblokken under).
        Collections.sort(albums, (album1, album2) -> Integer.compare(album1.getYear(), album2.getYear()));
        /* 1:
        Collections.sort(albums, new Comparator<Album>() {
            @Override
            public int compare(Album album1, Album album2) {
                return Integer.compare(album1.getYear(), album2.getYear());
            }
        });

        2:
        Collections.sort(albums, (album1, album2) -> {
                int compared = Integer.compare(album1.getYear(), album2.getYear());
                return compared;
            }
        );

        3:
        Comparator<Album> yearSortingAsc = (album1, album2) -> Integer.compare(album1.getYear(), album2.getYear());
        Collections.sort(albums, yearSortingAsc);
         */
        printAlbums(albums);


        System.out.println();
        System.out.println("--------Albums starting with T---------");
        // Her benytter vi en annen metode for å "filtrere" album. Spesifikt tar en en parameter for det selvlagde
        // funksjonelle interfacet PrintCondition. Her kan vi altså benytte lambda for å definere betingelsen for at
        // et gitt Album skal skrives ut. I linjen under er betingelsen at albumets tittel starter med T.
        printAlbumsConditionally(albums, a -> a.getTitle().startsWith("T"));

        System.out.println();
        System.out.println("-------Albums after the year 2000------");
        // Labda er generelt noe som gjør metoder mer fleksible ved at vi kan spesifisere biter av kodelogikken som
        // parametere. Her benytter vi samme metoden som forrige filtrering, men med en unik betingelse (album sluppet
        // etter år 2000).
        printAlbumsConditionally(albums, album -> album.getYear() > 2000);

        System.out.println();
        System.out.println("------Print old albums-----------------");
        // For å ytterligere demonstrere fleksibiliteten av lambda benytter vi enda en metode som her både tar
        // en PrintCondition og en Action (et annet selvlagt funksjonelt interface). Her benyttes disse til å både
        // spesifisere betingelse og hva som skal gjøres med hvert album (utskrift, endre, hva vi enn ønsker).
        doWithAlbumsConditionally(albums,
                album -> album.getYear() < 1970,
                album -> System.out.println(album.getTitle() + " is old but gold!"));

        System.out.println();
        System.out.println("------Print all albums-----------------");
        // Under er den tilsvarende logikken for å skrive ut alle album. Merk at vi her kan benytte en metodereferanse
        // i stedet for album -> System.out.println(album). Dette er fordi denne metoden har tilsvarende input og
        // returntype, og vi kan dermed spesifisere at vi ønsker å gjenbruke dette. Se også Application.java for
        // noe tilsvarende i Lecture21-prosjektet.
        doWithAlbumsConditionally(albums,
                album -> true,
                System.out::println);


    }

    // Metode som tar de selvlagde interfacene PrintCondition og Action som parametere. Mer hvor i kodekroppen disse
    // benyttes. Vi kan tenke på det som at det som sendes med i disse parametere er kode som settes inn på de
    // designerte plassene i kodekroppen (if test og handling hvis if-testen er oppfylt).
    public static void doWithAlbumsConditionally(ArrayList<Album> albums, PrintCondition printCondition,
                                                 Action action) {
        for (Album album : albums) {
            if (printCondition.met(album)) {
                action.perform(album);
            }
        }
    }

    // Metode som tar de selvlagde interfacene PrintCondition. Mer hvor i kodekroppen denne
    // benyttes. Vi kan tenke på det som at det som sendes med denne parameteren er kode som settes inn på den
    // designerte plassen i kodekroppen (if testen).
    public static void printAlbumsConditionally(ArrayList<Album> albums, PrintCondition printCondition) {
        for (Album album : albums) {
            if (printCondition.met(album)) {
                System.out.println(album);
            }
        }
    }

    // Metode for å skrive ut alle album.
    public static void printAlbums(ArrayList<Album> albums) {
        for (Album album : albums) {
            System.out.println(album);
        }
    }
}
