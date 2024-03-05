package no.hiof.oleedvao.lecture15.models;

import no.hiof.oleedvao.lecture15.interfaces.Drawable;

// En av styrkene til et interface er at vi kan implementere et interface i alle klasser vi ønsker og uavhengig av
// arv. For eksempel kan det være nyttig å si at en gitt Person, som er uavhengig av Figur, også skal kunne få en
// visuell representasjon
public class Person implements Drawable {

    @Override
    public String getDrawing() {
        return " 0\n" +
                "/|\\\n" +
                "/ \\";
    }
}
