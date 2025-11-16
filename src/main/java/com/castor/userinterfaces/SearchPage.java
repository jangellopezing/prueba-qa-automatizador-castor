package com.castor.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage {

    public static final Target SONG_RESULTS = Target.the("Song results")
            .located(By.cssSelector("[data-testid='tracklist-row']"));

    public static final Target ARTIST_RESULTS = Target.the("Artist results")
            .located(By.cssSelector("[aria-label='Artistas'] [data-encore-id='cardTitle']"));
}
