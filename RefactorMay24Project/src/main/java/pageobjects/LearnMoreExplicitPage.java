package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnMoreExplicitPage {

    WebDriver driver;

    public LearnMoreExplicitPage(WebDriver driver){

        this.driver = driver;

    }

    public void clickChangeTextButton(){

        driver.findElement(By.cssSelector("#quote")).click();
    }

    public String getChangeText(){

        String textValue;
        try{
            textValue = driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
        }
        catch (NoSuchElementException e){
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            driverWait.pollingEvery(Duration.ofSeconds(5));
            driverWait.ignoring(NoSuchElementException.class);
            driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Hello, Learn More Aspirants']")));
            textValue = driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
        }

        return textValue;

    }
}
