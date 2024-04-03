package no.hiof.oleedvao.lecture21;

import io.javalin.Javalin;
import io.javalin.vue.VueComponent;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.enableWebjars();
            config.vue.vueInstanceNameInJs = "app";
        }).start();

        app.get("/", new VueComponent("front-page"));



    }
}
