package Steps;

import Commun.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsHome extends Hooks {
    //Ouverture Application
    @Given("j ouvre l application practice.automationtesting")

    public void jOuvreLApplicationPracticeAutomationtesting() {
        super.initDriver();
        WebElement pageAccueil = driver.findElement(By.xpath("//div[@class='col4-2 sub_column sub_column_1-0-1-1 sub_column_post_22']"));
        Assert.assertTrue(pageAccueil.isDisplayed());
        System.out.println("Ouverture Application");
    }
    // cliquer sutl le menu My Account
    @When("j accède la page My Account")
    public void jAccèdeLaPageMyAccount() {
        WebElement btnMyAccounts = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/']"));
        btnMyAccounts.click();
    }
}
