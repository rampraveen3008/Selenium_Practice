package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class AmazonHomePageSteps {

    TestContext context;
    public AmazonHomePageSteps(TestContext context){
        //constructor call
        this.context = context;
    }

    @Given("user clicks the baby wishlist from Accounts & Lists")
    public void clickBabyWishlist(){
        context.pageObjectManager.getHomePage().enterProductName("iphone");
        context.pageObjectManager.getHomePage().clickBabyWishlist();

    }


    @Then("user verify the navigation")
    public void userVerifyTheNavigation() {
        String actualTitle = context.pageObjectManager.getBabyWishlistPage().getPageTitle();
        Assert.assertEquals("abc",actualTitle);
    }
}
