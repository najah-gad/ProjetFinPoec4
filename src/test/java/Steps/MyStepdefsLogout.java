package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsLogout extends Hooks {
    @And("je clique sur le lien logout")
    public void jeCliqueSurLeLienLogout() {
        WebElement LienLogout = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a"));
        LienLogout.click();

    }

    @Then("L affichage du page Account")
    public void lAffichageDuPageAccount() {
        WebElement Affichagemyaccount = driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a"));
        Assert.assertTrue(Affichagemyaccount.isDisplayed());

    }

    @And("L affichage des pavé de Login et de Registe")
    public void lAffichageDesPavéDeLoginEtDeRegiste() {
        WebElement AffichageLogin = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
        Assert.assertTrue(AffichageLogin.isDisplayed());
        WebElement AffichageRegiste = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
        Assert.assertTrue(AffichageRegiste.isDisplayed());
    }
}
