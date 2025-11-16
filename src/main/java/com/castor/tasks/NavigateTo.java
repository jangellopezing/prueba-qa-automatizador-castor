package com.castor.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Task {

    private static final String LOGIN_URL = "https://accounts.spotify.com/es/v2/login";
    private static final String HOME_URL = "https://open.spotify.com/";

    private final String url;

    public NavigateTo(String url) {
        this.url = url;
    }

    public static NavigateTo theLoginPage() {
        return Tasks.instrumented(NavigateTo.class, LOGIN_URL);
    }

    public static NavigateTo theHomePage() {
        return Tasks.instrumented(NavigateTo.class, HOME_URL);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }
}
