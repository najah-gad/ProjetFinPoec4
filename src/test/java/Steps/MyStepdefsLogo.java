package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsLogo extends Hooks {
    @When("je verifie l affichage logo AT")
    public void jeVerifieLAffichageLogoAT() {
        WebElement AffichageLogo = driver.findElement(By.xpath("//*[@id=\"site-logo\"]/a/img"));
        Assert.assertTrue(AffichageLogo.isDisplayed());

    }

    @And("je clique sur la page shop")
    public void jeCliqueSurLaPageShop() {
        WebElement PageShop = driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a"));
        PageShop.click();

    }

    @And("je clique sur le logo AT")
    public void jeCliqueSurLeLogoAT() {
        WebElement Logo = driver.findElement(By.xpath("//*[@id=\"site-logo\"]/a/img"));
        Logo.click();

    }

    @Then("le logo rederige vers la page d acceuil via un lien")
    public void leLogoRederigeVersLaPageDAcceuilViaUnLien() {
        WebElement pageacceuil = driver.findElement(By.xpath("//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[1]/div[1]/img"));
        Assert.assertTrue(pageacceuil.isDisplayed());



    }

    @And("je clique sur la page My Account")
    public void jeCliqueSurLaPageMyAccount() {
        WebElement Logo = driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a"));
        Logo.click();

    }

    @And("je clique sur la page Test case")
    public void jeCliqueSurLaPageTestCase() {
        WebElement TestCase = driver.findElement(By.xpath("//*[@id=\"menu-item-224\"]/a"));
        TestCase.click();
    }

    @And("je clique sur la page panier")
    public void jeCliqueSurLaPagePanier() {
        WebElement pagepanier = driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]"));
        pagepanier.click();
    }
}
