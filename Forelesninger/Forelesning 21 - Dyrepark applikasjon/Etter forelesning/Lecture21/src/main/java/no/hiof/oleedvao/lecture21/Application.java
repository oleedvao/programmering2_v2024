package no.hiof.oleedvao.lecture21;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.vue.VueComponent;
import no.hiof.oleedvao.lecture21.controllers.ZooController;
import no.hiof.oleedvao.lecture21.models.Chimp;
import no.hiof.oleedvao.lecture21.models.HoneyBadger;
import no.hiof.oleedvao.lecture21.models.Panda;
import no.hiof.oleedvao.lecture21.models.Zoo;
import no.hiof.oleedvao.lecture21.repositories.ZooDataRepository;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.vue.vueInstanceNameInJs = "app";
        }).start();

        app.get("/", new VueComponent("front-page"));

        // Setter opp en vue-component som viser frem en zoo.
        // Denne komponenten kaller "/api/zoo/{zooName}" internt for å laste inn dataene (Se api-pathen under.)
        app.get("/zoo/{zooName}", new VueComponent("zoo-detail"));


        // Oppretter et repository-objekt for å laste dataene (her gjøres dette via hardkoden, men vanligvis ville
        // denne lastet disse fra for eksempel en database). Dette er en abstraksjonsteknikk som er nyttig for å
        // gjøre koden mer opprettholdbar som applikasjonen blir større.
        ZooDataRepository zooDataRepository = new ZooDataRepository();
        // Oppretter en Controller som er ansvarlig for å håndtere logikken mellom frontend-sidene (Views) og
        // dataklassene (Models). Denne benytter internt repositoriet for håndtering av logikk. Dette er enda en
        // abstraksjonsteknikk for å definere Modeller, Views og kodelogikken mellom dem (Controller) for seg selv.
        // Dette er igjen for at dette er mer opprettholdbart som aplikasjonen blir større.
        ZooController zooController = new ZooController(zooDataRepository);

        // Api-path som benyttes av zoo-detail for å hente et en spesifikk Zoo sine Animal-objekter.
        // Kan også benyttes for seg selv.
        app.get("/api/zoo/{zooName}", new Handler() {
            @Override
            public void handle(@NotNull Context context) throws Exception {
                // Kodelogikken er abstrahert til metoden .getZooAnimals(). Merk at vi videresender Context-objektet til
                // denne.
                zooController.getZooAnimals(context);
            }
        });

    }
}
