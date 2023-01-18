package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyStepdefsShop extends Hooks {
    String xpatherContainPanier = "//div[@class='type-page']//descendant::a";
    String xpatherOutStock = "//a[@href='https://practice.automationtesting.in/product/functional-programming-in-js/']";

    // Vérification d'ajout au panier a partir de la page shop
    @And("Je clique sur ADD TO BASKET pour cet article")
    public void jeCliqueSurADDTOBASKETPourCetArticle() {
        WebElement btnAddToBasket = driver.findElement(By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']"));
        btnAddToBasket.click();

    }

    //Vérification View Basket a partir de la page shop
    @Then("je vérifie Un lien VIEW BASKET apparait en dessous de l article")
    public void jeVérifieUnLienVIEWBASKETApparaitEnDessousDeLArticle() {
        WebElement viewBasket = driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward']"));
        Assert.assertTrue(viewBasket.isDisplayed());
        viewBasket.click();

    }

    //Vérificationn l'affichage de panier
    @And("L article s affiche dans le panier {string}")
    public void lArticleSAfficheDansLePanier(String nonArticle) {
        WebElement viewAricleBasKet = driver.findElement(By.xpath(xpatherContainPanier + "[contains(text(),'" + nonArticle + "')]"));
        Assert.assertTrue(viewAricleBasKet.isDisplayed());

    }

    // Verification bouton READ MORE
    @And("Je sélectionne un article indisponible READ MORE")
    public void jeSélectionneUnArticleIndisponibleREADMORE() {
        WebElement btnReadMore = driver.findElement(By.xpath(xpatherOutStock));
        btnReadMore.click();

    }

    @Then("je verifie le bon Affichage des articles sur la page shop")
    public void jeVerifieLeBonAffichageDesArticlesSurLaPageShop() {
        List<WebElement> listArticles = driver.findElements(By.xpath("//ul[@class=\"products masonry-done\"]/li"));
         for (WebElement article : listArticles) {
            Assert.assertTrue("Absence titre", article.findElement(By.tagName("h3")).isDisplayed());
            Assert.assertTrue("Absence prix", article.findElement(By.className("price")).isDisplayed());
        }
    }
    //Verification Filtre theme
    @And("Je vérifie  la présence du filtre thème")
    public void jeVérifieLaPrésenceDuFiltreThème() {
        WebElement filtreTheme = driver.findElement(By.xpath("//div[@id=\"woocommerce_product_categories-2\"]"));
        filtreTheme.getText().contains("Product Categories");


    }

    //Verification Filtre Prix
    @And("je vérifie  la présence du filtre prix")
    public void jeVérifieLaPrésenceDuFiltrePrix() {
        WebElement filtrePrix = driver.findElement(By.xpath("//div[@id=\"woocommerce_price_filter-2\"]"));
        filtrePrix.getText().contains("Filter by price");

    }
}



