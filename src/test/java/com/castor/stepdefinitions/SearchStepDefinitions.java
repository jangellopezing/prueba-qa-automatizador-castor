package com.castor.stepdefinitions;

import com.castor.questions.SearchResults;
import com.castor.tasks.NavigateTo;
import com.castor.tasks.Search;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchStepDefinitions {
    @Dado("que {actor} está en la página principal de Spotify Web")
    public void queEstaEnLaPaginaPrincipalDeSpotifyWeb(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theHomePage()
        );
    }

    @Cuando("busca el término {string}")
    public void buscaLaCancion(String searchTerm) {
        theActorInTheSpotlight().attemptsTo(
                Search.theTerm(searchTerm)
        );
    }

    @Entonces("debería visualizar resultados relacionados con {string}")
    public void deberiaVisualizarResultadosRelacionadosCon(String searchTerm) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(SearchResults.songs(searchTerm)).isTrue(),
                Ensure.that(SearchResults.artists(searchTerm)).isTrue()
        );
    }
}
