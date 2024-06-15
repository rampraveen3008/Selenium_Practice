package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {

    public BabyWishlistPage babyWishlistPage;
    public HomePage homePage;
    public WebDriver driver; //null
    public LearnMoreAlertsPage learnMoreAlertsPage;
    public LearnMoreExplicitPage learnMoreExplicitPage;
    public WikiPage wikiPage;

    public PageObjectManager(WebDriver driver){

        this.driver = driver;//knowledge
    }

    public BabyWishlistPage getBabyWishlistPage(){

        babyWishlistPage = new BabyWishlistPage(driver);
        return babyWishlistPage;

    }

    public HomePage getHomePage(){

        homePage = new HomePage(driver);
        return homePage;

    }

    public LearnMoreAlertsPage getLearnMoreAlertPage(){

        learnMoreAlertsPage =new LearnMoreAlertsPage(driver);
        return learnMoreAlertsPage;

    }

    public LearnMoreExplicitPage getLearnMoreExplicitPage(){

        learnMoreExplicitPage = new LearnMoreExplicitPage(driver);
        return learnMoreExplicitPage;
    }

    public WikiPage getWikiPage(){
        wikiPage = new WikiPage(driver);
        return wikiPage;
    }


}
