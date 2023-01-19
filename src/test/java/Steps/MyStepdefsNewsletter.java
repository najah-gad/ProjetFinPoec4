package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsNewsletter extends Hooks {




    @When("Je clique sur My account")
    public void jeCliqueSurMyAccount() {
        WebElement btnMyAccounts = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/']"));
        btnMyAccounts.click();
    }
    //Verification presence du champ newsletter
    @Then("La fonctionnalité newsletter est présente")
    public void laFonctionnalitéNewsletterEstPrésente() {
        WebElement mailSubscribe = driver.findElement(By.id("mc4wp_form_widget-2"));
        Assert.assertTrue(mailSubscribe.isDisplayed());
    }
}
