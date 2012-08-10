package com.mycompany.steps;

import com.mycompany.pages.BuildShokuninPage;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.*;
import net.thucydides.core.steps.*;

public class BuildShokuninSteps extends ScenarioSteps {
    public BuildShokuninSteps(Pages pages) {
        super(pages);
    }

    private BuildShokuninPage onBuildShokuninPage() {
        return getPages().currentPageAt(BuildShokuninPage.class);
    }

    @Step
    public void is_the_home_page() {
        onBuildShokuninPage().open();
    }

    @Step
    public void looks_for(String keyword) {
        onBuildShokuninPage().enter_keywords(keyword);
        onBuildShokuninPage().lookup_terms();
    }
}
