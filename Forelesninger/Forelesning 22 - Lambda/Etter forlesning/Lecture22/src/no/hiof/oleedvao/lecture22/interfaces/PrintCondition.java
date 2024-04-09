package no.hiof.oleedvao.lecture22.interfaces;

import no.hiof.oleedvao.lecture22.models.Album;

// Funksjonelt interface som representerer en utskriftsbetingelse for Album.
public interface PrintCondition {
    boolean met(Album album);
}
