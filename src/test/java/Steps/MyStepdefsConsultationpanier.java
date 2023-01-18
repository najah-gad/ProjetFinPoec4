package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsConsultationpanier extends Hooks {
    @And("je clique sur le lien ADD TO BASKET")
    public void jeCliqueSurLeLienADDTOBASKET() {
        WebElement ADDBASKET = driver.findElement(By.xpath("//a[@href=\"/shop/?add-to-cart=182\"]"));
        ADDBASKET.click();


    }

    @And("je clique sur le bouton panier")
    public void jeCliqueSurLeBoutonPanier() {
        WebElement Panier = driver.findElement(By.xpath("//a[@class=\"wpmenucart-contents\"]"));
        Panier.click();


    }

    @Then("l affichage de page panier")
    public void lAffichageDePagePanier() {
        WebElement pagepanier = driver.findElement(By.xpath("//div[@class=\"woocommerce\"]"));
        Assert.assertTrue(pagepanier.isDisplayed());

    }

    @And("je verifie l affichage des articles ajouteée")
    public void jeVerifieLAffichageDesArticlesAjouteée() {
        WebElement articleajouté = driver.findElement(By.xpath("//td[@class=\"product-remove\"]"));
        Assert.assertTrue(articleajouté.isDisplayed());

    }

    @And("je verfie  la quantité")
    public void jeVerfieLaQuantité() {
        WebElement quantité = driver.findElement(By.xpath("//div[@class=\"quantity\"]"));
        Assert.assertTrue(quantité.isDisplayed());

    }

    @And("je verifiele prix unitaire")
    public void jeVerifielePrixUnitaire() {
        WebElement prixunitaire = driver.findElement(By.xpath("//span[@class=\"woocommerce-Price-amount amount\"]"));
        Assert.assertTrue(prixunitaire.isDisplayed());

    }

    @And("je verifie le prix total")
    public void jeVerifieLePrixTotal() {
        WebElement prixtotal = driver.findElement(By.xpath("//span[@class=\"woocommerce-Price-amount amount\"]"));
        Assert.assertTrue(prixtotal.isDisplayed());
    }
}
