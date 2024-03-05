package no.hiof.oleedvao.lecture15.interfaces;

// Det følgende er et interface. Et interface kan konseptuelt tenkes på som en "kontrakt" for klassers funksjonalitet
// og består typisk av kun abstrakte metoder. Hva dette betyr er at klasser som "implementerer" dette interfacet
// vil bli påkrevd av Java å implementere disse abstrakte metodene ved å override dem og definere kodekropper.
// Dette spesifikke interfacet er ment til å spesifisere hva for slags funksjonalitet som må implementeres for at en
// klasse skal være Drawable (tegnbar). Det er fordelaktig å lage dette som et interface ettersom denne typen
// funksjonalitet kan være relevant for mange forksjellige klasser og uavhengig av arvhierarkier. Dette er i motsetning
// til å benytte slikt som abstrakte-klasser, som er direkte avhengig av arv.
public interface Drawable {

    // Dette er en abstract metode og må implementeres for alle klasser som implementerer interfacet.
    // Merk også at nøkkelordene public og abstract ikke er nødvendige her ettersom interfaces underforstått forventer
    // at disse er gjeldende for alle metoder som er inneholdt.
    String getDrawing();

}
