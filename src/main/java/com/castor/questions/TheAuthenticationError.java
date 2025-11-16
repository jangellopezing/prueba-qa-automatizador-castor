package com.castor.questions;

import com.castor.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class TheAuthenticationError implements Question<Boolean> {
    public static Question<Boolean> isDisplayed() {
        return new TheAuthenticationError();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LoginPage.ERROR_MESSAGE_CONTAINER).answeredBy(actor);
    }
}
