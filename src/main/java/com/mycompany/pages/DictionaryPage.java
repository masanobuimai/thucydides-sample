package com.mycompany.pages;

import ch.lambdaj.function.convert.*;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

import static ch.lambdaj.Lambda.*;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary:Main_Page")
public class DictionaryPage extends PageObject {

    @FindBy(name = "search")
    private WebElement searchTerms;

    @FindBy(name = "go")
    private WebElement lookupButton;

    public DictionaryPage(WebDriver driver) {
        super(driver);
    }

    public void enter_keywords(String keyword) {
        element(searchTerms).type(keyword);
    }

    public void lookup_terms() {
        element(lookupButton).click();
    }

    public List<String> getDefinitions() {
        WebElement definitionList = getDriver().findElement(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}


