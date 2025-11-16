package com.castor.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target SEARCH_INPUT = Target.the("Search input")
            .located(By.cssSelector("input[data-testid='search-input']"));

    public static final Target EXPLORE_BUTTON = Target.the("Explore button")
            .located(By.cssSelector("button[data-testid='browse-button']"));
}
