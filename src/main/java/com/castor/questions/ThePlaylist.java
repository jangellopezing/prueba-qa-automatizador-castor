package com.castor.questions;

import com.castor.userinterfaces.TopListsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ThePlaylist implements Question<Boolean> {
    private final String playlistName;

    private ThePlaylist(String playlistName) {
        this.playlistName = playlistName;
    }

    public static Question<Boolean> named(String playlistName) {
        return new ThePlaylist(playlistName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(TopListsPage.playlistByName(playlistName)).answeredBy(actor);
    }
}
