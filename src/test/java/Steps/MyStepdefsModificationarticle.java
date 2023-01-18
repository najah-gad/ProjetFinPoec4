package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsModificationarticle extends Hooks {
    @And("je modifie la quantité d un article par le champs quantité {string}")
    public void jeModifieLaQuantitéDUnArticleParLeChampsQuantité(String nb) {
        WebElement quantit = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input"));
        quantit.clear();
        quantit.sendKeys(nb);
    }


    @And("And je clique sur le bouton Update Basket")
    public void andJeCliqueSurLeBoutonUpdateBasket() {
        WebElement updateBasket = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td/input[1]"));
        updateBasket.click();

    }


    @Then("la quantité de l'article est modifié")
    public void laQuantitéDeLArticleEstModifié() {
        WebElement Affichagequantite = driver.findElement(By.xpath("//div[@class=\"quantity\"]"));
        Assert.assertTrue(Affichagequantite.isDisplayed());
    }
}
