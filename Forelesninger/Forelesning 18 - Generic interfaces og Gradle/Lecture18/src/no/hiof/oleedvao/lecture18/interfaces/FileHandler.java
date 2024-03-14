package no.hiof.oleedvao.lecture18.interfaces;

// Dette er et generic interface. Dette betyr at interfacet er definert på en slik måte at det kan bli benyttet
// for å håndtere mange forskjellige datatyper. Vi oppnår dette ved å legge på <T> etter interfacets navn. T blir
// da i praksis en placeholder for en datatype som blir unikt spesifisert når interfacet blir implementert i
// forskjellige klasser (Se StringFileHandler). Vi spesifisere T som både parametere og/eller return-type i interfacets
// abstrakte metoder. I dette tilfellet har vi definert et interface for filhåndteringsfunksjonalitet. Slik
// funksjonalitet kan være relevant for mange datatyper (String, typer objekter, osv) og der dermed fordelaktig å
// definere interfacet som generic.
public interface FileHandler<T> {

    // Her ser vi et eksempel hvor T blir benyttet som en parameter. Dette betyr at parameterens datatype vil være
    // dynamisk i henhold til hvilken datatype som blir satt for T ved klasse-implementasjon
    void writeToFile(String fileName, T t);

    // Her blir den abstrakte metodens datatype satt til T og betyr at hva som returneres av metoden er dynamisk i
    // henhold til hvilken datatype som blir satt for T ved klasse-implementasjon.
    T readFromFile(String fileName);

}
