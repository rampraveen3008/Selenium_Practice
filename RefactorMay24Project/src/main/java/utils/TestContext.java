package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {

    public WebDriverManager webDriverManager;
    public PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
        // call constructor
        webDriverManager = new WebDriverManager();//instantiate class variables and methods
        pageObjectManager = new PageObjectManager(webDriverManager.getDriverDetails());
    }
}
