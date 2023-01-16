package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsDescriptionArticle extends Hooks {
    @And("je clique sur le lien SHOP")
    public void jeCliqueSurLeLienSHOP() {
        WebElement shopElt = driver.findElement(By.xpath("//ul[@id=\"main-nav\"]/li[1]"));
        shopElt.click();
    }
    @When("je clique sur un article")
    public void jeCliqueSurUnArticle() {
        WebElement choixArticle = driver.findElement(By.xpath("//ul[@class=\"products masonry-done\"]/li[4]"));
        choixArticle.click();
    }

    @Then("la page detail article s'affiche")
    public void laPageDetailArticleSAffiche() {
        WebElement pageDetailArticle = driver.findElement(By.xpath("//nav[@class=\"woocommerce-breadcrumb\"]"));
        Assert.assertTrue(pageDetailArticle.isDisplayed());
    }
    @And("je verifie le bon affichage des details articles")
    public void jeVerifieLeBonAffichageDesDetailsArticles() {
        WebElement imgArticle = driver.findElement(By.xpath("//div[@class=\"images\"]/a[@class=\"woocommerce-main-image zoom\"]"));
        Assert.assertTrue(imgArticle.isDisplayed());
        WebElement desrptionArticle = driver.findElement(By.xpath("//div[@itemprop='description']"));
        Assert.assertTrue(desrptionArticle.isDisplayed());
        WebElement prixArticle = driver.findElement(By.xpath("//p[@class='price']"));
        Assert.assertEquals(prixArticle.getText(),"₹180.00");
        WebElement nbExemplaireArticle = driver.findElement(By.xpath("//p[@class=\"stock in-stock\"]"));
        Assert.assertEquals(nbExemplaireArticle.getText(),"8003 in stock");
    }

    @And("je verifie l affichage le bouton ADD TO BASKET")
    public void jeVerifieLAffichageLeBoutonADDTOBASKET() {
        WebElement nbExemplaireArticle = driver.findElement(By.xpath("//button[@class=\"single_add_to_cart_button button alt\"]"));
        Assert.assertTrue(nbExemplaireArticle.isDisplayed());
        System.out.println("ADD TO BASKET OK");
    }

    @And("je verifie un champ permet d indiquer le nombre exemplaire voulu")
    public void jeVerifieUnChampPermetDIndiquerLeNombreExemplaireVoulu() {
        WebElement nbExemplaireArticle = driver.findElement(By.xpath("//div[@class='quantity']"));
        Assert.assertTrue(nbExemplaireArticle.isDisplayed());
        System.out.println("nb ExemplaireOK");
    }
}
