package com.castor.tasks;

import com.castor.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Search implements Task {

    private final String searchTerm;

    public Search(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public static Search theTerm(String searchTerm) {
        return Tasks.instrumented(Search.class, searchTerm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.SEARCH_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(searchTerm).into(HomePage.SEARCH_INPUT).thenHit(Keys.ENTER)
        );
    }
}
