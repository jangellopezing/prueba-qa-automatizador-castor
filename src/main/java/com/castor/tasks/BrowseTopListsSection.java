package com.castor.tasks;

import com.castor.userinterfaces.TopListsPage;
import com.castor.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class BrowseTopListsSection implements Task {

    public static BrowseTopListsSection fromHomePage() {
        return Tasks.instrumented(BrowseTopListsSection.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.EXPLORE_BUTTON, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(HomePage.EXPLORE_BUTTON),

                WaitUntil.the(TopListsPage.TOP_LISTS_BUTTON, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(TopListsPage.TOP_LISTS_BUTTON)
        );
    }
}
