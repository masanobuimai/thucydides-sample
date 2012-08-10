package com.mycompany.pages;

import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

@DefaultUrl("http://build-shokunin.org/")
public class BuildShokuninPage extends PageObject {

    @FindBy(id = "searchbox")
    private WebElement searchBox;

    @FindBy(name = "s")
    private WebElement searchButton;

    public BuildShokuninPage(WebDriver driver) {
        super(driver);
    }

    public void enter_keywords(String keyword) {
        element(searchBox).type(keyword);
    }

    public void lookup_terms() {
        element(searchButton).click();
    }
}


