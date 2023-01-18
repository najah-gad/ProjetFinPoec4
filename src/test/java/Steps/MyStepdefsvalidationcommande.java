package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsvalidationcommande extends Hooks {
    @And("je verifie l affichage de pavé Basket Totals")
    public void jeVerifieLAffichageDePavéBasketTotals() {
        WebElement Affichagedepavé = driver.findElement(By.xpath("//table[@class=\"shop_table shop_table_responsive\"]"));
        Assert.assertTrue(Affichagedepavé.isDisplayed());

    }

    @And("je verifie la présence de prix total")
    public void jeVerifieLaPrésenceDePrixTotal() {
        WebElement Presenceprixtotal = driver.findElement(By.xpath("//tr[@class=\"order-total\"]"));
        Assert.assertTrue(Presenceprixtotal.isDisplayed());

    }

    @And("je verifie la présence de taxe associée")
    public void jeVerifieLaPrésenceDeTaxeAssociée() {
        WebElement tax = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[2]"));
        Assert.assertTrue(tax.isDisplayed());

    }

    @And("je clique sur la bouton Proceed to Checkout")
    public void jeCliqueSurLaBoutonProceedToCheckout() {
        WebElement btnProceedToCHEKOUT = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/checkout/']"));
        btnProceedToCHEKOUT.click();


    }

    @Then("la commande est validée et passer au paiement")
    public void laCommandeEstValidéeEtPasserAuPaiement() {
        WebElement Affichagepagepaiement = driver.findElement(By.xpath("//div[@class=\"woocommerce\"]"));
        Assert.assertTrue(Affichagepagepaiement.isDisplayed());
    }
}
