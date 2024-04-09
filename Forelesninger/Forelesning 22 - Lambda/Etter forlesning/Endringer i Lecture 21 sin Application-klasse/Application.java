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

        app.get("/zoo/{zooName}", new VueComponent("zoo-detail"));


        ZooDataRepository zooDataRepository = new ZooDataRepository();
        ZooController zooController = new ZooController(zooDataRepository);



        /* 1:
        app.get("api/zoo/{zooName}", new Handler() {
            @Override
            public void handle(@NotNull Context context) throws Exception {
                zooController.getZooAnimals(context);
            }
        });

        2:
        app.get("/api/zoo/{zooName}", context -> zooController.getZooAnimals(context));
         */

        // Her kan vi også forenkle koden i kommentarblokken over (1) til å benytte et lambdauttrykk (2), og et steg
        // videre benytte metodereferanse for å enkelt si at vi skal benytte zooController sin metode getZooAnimals().
        // Og som en liten kommentar til et spørsmål stilt i forelesningen: Jeg tok feil angående public/private. Det
        // er under et krav om at getZooAnimals() er public for å kunne benytte en metodereferanse.
        app.get("/api/zoo/{zooName}", zooController::getZooAnimals);

    }
}
