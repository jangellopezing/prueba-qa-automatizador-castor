package com.castor.stepdefinitions;

import com.castor.questions.ThePlaylist;
import com.castor.tasks.BrowseTopListsSection;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PlaylistsStepDefinitions {
    @Cuando("navega a la sección de Top Listas")
    public void navegaALaSeccionDeTopListas() {
        theActorInTheSpotlight().attemptsTo(
                BrowseTopListsSection.fromHomePage()
        );
    }

    @Entonces("debería visualizar playlists públicas como {string}")
    public void deberiaVisualizarPlaylistsPublicasComo(String playlistName) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(ThePlaylist.named(playlistName)).isTrue()
        );
    }
}
