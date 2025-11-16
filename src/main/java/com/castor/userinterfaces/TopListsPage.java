package com.castor.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TopListsPage {

    public static final Target TOP_LISTS_BUTTON = Target.the("Top lists button")
            .located(By.xpath("//span[@title='Listas de éxitos']"));

    public static Target playlistByName(String playlistName) {
        return Target.the("playlist '" + playlistName + "'")
                .located(By.xpath("//span[translate(text(), ' ', ' ') = '" + playlistName + "']"));
    }
}
