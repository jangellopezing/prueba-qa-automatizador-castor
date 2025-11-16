package com.castor.stepdefinitions;

import com.castor.questions.TheAuthenticationError;
import com.castor.tasks.Login;
import com.castor.tasks.NavigateTo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthenticationStepDefinitions {
    @Dado("que {actor} está en la página de login")
    public void queEstaEnLaPaginaDeLogin(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theLoginPage()
        );
    }

    @Dado("que {actor} tiene una sesión activa en Spotify")
    public void queTieneUnaSesionActivaEnSpotify(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theHomePage()
        );
    }

    @Cuando("intenta iniciar sesión con credenciales inválidas")
    public void intentaIniciarSesionConCredencialesInvalidas(DataTable dataTable) {
        Map<String, String> credentials = dataTable.asMaps().get(0);

        theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(credentials.get("email"), credentials.get("password"))
        );
    }

    @Entonces("debería ver un mensaje de error de autenticación")
    public void deberiaVerUnMensajeDeErrorDeAutenticacion() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(TheAuthenticationError.isDisplayed()).isTrue()
        );
    }
}
