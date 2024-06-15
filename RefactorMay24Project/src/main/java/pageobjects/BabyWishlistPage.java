package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ReadExcelData;

import java.io.IOException;

public class BabyWishlistPage {

    WebDriver driver;

    public BabyWishlistPage(WebDriver driver){

        this.driver = driver;

    }
    public String getPageTitle(){

        return driver.getTitle();

    }

}
