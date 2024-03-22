package no.hiof.oleedvao.lecture20;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.vue.VueComponent;
import no.hiof.oleedvao.lecture20.models.SuperHero;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        // Hvis vi ønsker å benytte Vue for å lage sider i applikasjonen, må vi tillate Javalin å benytte web-jars.
        // Vi gjør dette ved å legge til følgende kode (Det i .create() sin parameter).
        Javalin app = Javalin.create(javalinConfig -> {
            javalinConfig.staticFiles.enableWebjars();
            javalinConfig.vue.vueInstanceNameInJs = "app";
        }).start();


        // Her sier vi at defalt pathen "/" skal gi en Vue-komponent som resultat. Altså at siden laget med Vue
        // skal vises. I dette tilfellet er det komponenten "hello-world", som er definert i hello-world.vue under
        // resources/vue/views som gjelder.
        // Utenom dette er det ikke en forventning om at dere skal forstå/skrive vue-kode selv, så innholdet av denne
        // filen vil ikke bli forklart her.
        app.get("/", new VueComponent("hello-world"));

        /*
        app.get("/", new Handler() {
            @Override
            public void handle(@NotNull Context context) throws Exception {
                context.result("Hello Javalin!");
            }
        });
         */

        app.get("/other-page", new Handler() {
            @Override
            public void handle(@NotNull Context context) throws Exception {
                context.result("Hello from the other page!");
            }
        });

        // Her har vi laget en hardkodet liste med SuperHero-objekter som tiltenkt kunne vært noe hentet fra f.eks.
        // en database. Hardkodet data er forøvrig ikke fornuftig i en ferdig applikasjon ettersom det ikke medfører
        // noen persistent lagring, men funker bra for å enkelt teste applikasjonen under utviklingen.
        ArrayList<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(new SuperHero("Batman", "Bruce Wayne"));
        superHeroes.add(new SuperHero("Spiderman", "Peter Parker"));
        superHeroes.add(new SuperHero("Wonder Woman", "Diana Prince"));

        // Path-håndteringene under kan anses som API-funksjonalitet, som typisk blir benyttet for å hente ut og sette
        // inn data i Applikasjonen. Det er her vanlig å returnere data i slikt som JSON eller XML slik at frontenden
        // kan ta imot disse og presentere de på en fornuftig måte. De fleste moderne applikasjoner har ett eller flere
        // API-er som fungerer som ett "mellomlegg" mellom frondtend og backend, og standardiserer kommunikasjonen
        // mellom disse.

        // Det følgende er en api-path hvor alle SuperHero-objektene (hele lista) blir returnert i JSON format.
        app.get("/api/superheroes", new Handler() {
            @Override
            public void handle(@NotNull Context context) throws Exception {
                // Vi kan benytte Context sin .json()-metode for å konvertere og returnere et objekt i JSON-format.
                context.json(superHeroes);
            }
        });

        // Det følgende er en api-path som kan benyttes for å hente ut en spesifikk SuperHero i JSON-format.
        // Vi benytter her en path parameter {name} for hente den ønskede SuperHero-en sitt navn og søker etter
        // det tilsvarende objektet i listen med alle SuperHero-objektene.
        app.get("/api/superheroes/{name}", new Handler() {
            @Override
            public void handle(@NotNull Context context) throws Exception {
                // Vi kan benytte Context sin .pathParam()-metode for å hente ut verdien i en path parameter.
                // Her henter vi spesifikt ut veriden for path parameteren "name". Vi kunne også laget flere
                // parametere med unike navn.
                String specifiedName = context.pathParam("name");

                // Vi sammenligner navnet hentet ut fra path paramter med samtlige SuperHero-objekter og gir tilbake
                // den hvor navnet matcher i JSON-format.
                for (SuperHero superHeroX : superHeroes) {
                    String superHeroXName = superHeroX.getName();

                    if (superHeroXName.equalsIgnoreCase(specifiedName)) {
                        context.json(superHeroX);
                        return; // Avslutter søkingen hvis objektet har blitt funnet.
                    }
                }
                // Hvis vi ikke finner SuperHero-en med det spesifiserte navnet, gir vi en passende melding tilbake.
                // I API-er er det også fornuftig å benytte satus-koder, som hjelper slikt som frontend å identifisere
                // hva som eventuelt er feil. Vi kan benytte metoden .status() for dette. Her er den relevante status-
                // koden 404 for "Not Found"
                context.status(404).result("Could not find super hero with the name " + specifiedName);
            }
        });

        // Det følgende er en api-path for å legge til et nytt SuperHero-objekt i applikasjonen.
        // En liten disclaimer: Hvis vi skal gjøre endringer i backenden via et API-kall burde dette egentlig gjøres
        // via et POST-kall hvor dataene sendes i en egen pakke og ikke direkte i URL, men vi benytter her GET for å
        // gjøre det enkelt.
        app.get("/api/superheroes/add/{name},{secretIdentity}", new Handler() {
            @Override
            public void handle(@NotNull Context context) throws Exception {
                // Vi benytter path-parametere for å ta imot SuperHero-dataene.
                String name = context.pathParam("name");
                String secretIdentity = context.pathParam("secretIdentity");

                // Med de hentede dataene kan vi opprette ett nytt SuperHero-objekt og legge det til i listen.
                // Merk at dette ikke er en persistent form for lagring. Hvis vi benytter denne api-pathen vil
                // de tillagte objektene glemmes av applikasjonen når den restartes. Igjen hadde det vært mer fornuftig
                // ha en form for databaselagring.
                SuperHero createdSuperHero = new SuperHero(name, secretIdentity);
                superHeroes.add(createdSuperHero);

                // Hvis opprettelsen går som forventet gir vi tilbake en beskjed om dette med statuskoden 201 for
                // "Created".
                context.status(201).result("The super hero " + name + " has been created.");
            }
        });

    }
}
