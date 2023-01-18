package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefssuppressiondesarticles extends Hooks {
    @And("je clique sur le bouton suprrimer")
    public void jeCliqueSurLeBoutonSuprrimer() {
        WebElement btsupp = driver.findElement(By.xpath("//a[@class=\"remove\"]"));
        btsupp.click();


    }

    @Then("l article est suprrimé")
    public void lArticleEstSuprrimé() {
        WebElement Affichagemsg = driver.findElement(By.xpath("//div[@class=\"woocommerce-message\"]"));
        Assert.assertTrue(Affichagemsg.isDisplayed());


    }
}
