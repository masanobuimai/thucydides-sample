package com.mycompany.steps;

import com.mycompany.pages.*;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.*;
import net.thucydides.core.steps.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class EndUserSteps extends ScenarioSteps {

    public EndUserSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void enters(String keyword) {
        onDictionaryPage().enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        onDictionaryPage().lookup_terms();
    }

    private DictionaryPage onDictionaryPage() {
        return getPages().currentPageAt(DictionaryPage.class);
    }

    private DictionaryPage DictionaryPage() {
        return getPages().currentPageAt(DictionaryPage.class);
    }

    @Step
    public void should_see_definition_containing_words(String terms) {
        assertThat(DictionaryPage().getDefinitions(), hasItem(containsString(terms)));
    }

    @Step
    public void is_the_home_page() {
        onDictionaryPage().open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}
