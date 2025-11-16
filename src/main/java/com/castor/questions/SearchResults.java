package com.castor.questions;

import com.castor.userinterfaces.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Collection;

public class SearchResults implements Question<Boolean> {

    private final String searchTerm;
    private final Target target;

    private SearchResults(String searchTerm, Target target) {
        this.searchTerm = searchTerm;
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Collection<String> results = Text.ofEach(target).answeredBy(actor);
        return results.stream().anyMatch(result -> result.toLowerCase().contains(searchTerm.toLowerCase()));
    }

    public static SearchResults songs(String searchTerm) {
        return new SearchResults(searchTerm, SearchPage.SONG_RESULTS);
    }

    public static SearchResults artists(String searchTerm) {
        return new SearchResults(searchTerm, SearchPage.ARTIST_RESULTS);
    }
}