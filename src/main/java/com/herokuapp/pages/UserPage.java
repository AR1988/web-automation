package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage extends BasePage {

    public static final By PAGE_TITLE = By.tagName("h1");

    public UserPage(WebDriver driver) {
        super(driver);
    }

    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
