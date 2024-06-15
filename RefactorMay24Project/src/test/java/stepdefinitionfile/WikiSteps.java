package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.TestContext;

public class WikiSteps {

    TestContext context;

    public WikiSteps(TestContext context){
        this.context = context;

    }

    @Given("user extracts the column one value")
    public void columnOne(){

    }

    @When("user extracts the column two value")
    public void userExtractsTheColumnTwoValue() {

        boolean flag = false;
        for(String k:context.pageObjectManager.getWikiPage().getColumnOneValues()){
//            System.out.println(k);
            if (k.equals("Headquarters")){
//                Assert.assertTrue(true);
                flag = true;
                break;
            }
        }

        Assert.assertTrue(flag);
        
    }

    @Then("validates the mapping")
    public void validatesTheMapping() {

        Assert.assertEquals("Company type",context.pageObjectManager.getWikiPage().getColumnOneValues().get(2));
        Assert.assertEquals("Public",context.pageObjectManager.getWikiPage().getColumnTwoValues().get(2));
    }


    @Then("user validates the key and value pair relation of Share holder and Share holdings")
    public void userValidatesTheKeyAndValuePairRelationOfShareHolderAndShareHoldings() {

        System.out.println(context.pageObjectManager.getWikiPage().getShareholdingAndStakeholdersValues().get("Others"));
        Assert.assertEquals(" 0.32%",context.pageObjectManager.getWikiPage().getShareholdingAndStakeholdersValues().get("Others"));
    }
}
