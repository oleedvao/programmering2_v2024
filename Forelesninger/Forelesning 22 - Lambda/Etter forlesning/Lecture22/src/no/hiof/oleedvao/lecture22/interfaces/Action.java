package no.hiof.oleedvao.lecture22.interfaces;

import no.hiof.oleedvao.lecture22.models.Album;

// Funksjonelt interface som representerer én handling for et Album.
public interface Action {
    void perform(Album album);
}
