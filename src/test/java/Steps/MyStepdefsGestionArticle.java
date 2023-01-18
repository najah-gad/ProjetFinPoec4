package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsGestionArticle extends Hooks {
    String xpathArticle="//div[@class='list-post']//descendant::h1";
    String xpathBtnAddBasket ="//button[@class=\"single_add_to_cart_button button alt\"]";
    String xpathImage ="//div[@class=\"images\"]/a[@class=\"woocommerce-main-image zoom\"]";
    //cliquer sur le lien Shop
    @And("je clique sur le lien SHOP")
    public void jeCliqueSurLeLienSHOP() {
        WebElement shopElt = driver.findElement(By.xpath("//ul[@id=\"main-nav\"]/li[1]"));
        shopElt.click();

    }
    //Choisir un article
     @When("je clique sur un article {string}")
    public void jeCliqueSurUnArticle(String nonArticle){

        WebElement choixArticle = driver.findElement(By.xpath("//*[text()[contains(.,'"+nonArticle+"')]]"));
        choixArticle.click();
    }
    //Affichage de la page Detail Article selectionne
   @Then("la page detail article s'affiche {string}")
    public void laPageDetailArticleSAffiche(String nonArticle){
        WebElement  pageDetailArticle = driver.findElement(By.xpath(xpathArticle+"[contains(text(),'"+nonArticle+"')]"));
        Assert.assertTrue(pageDetailArticle.isDisplayed());
    }
    //Vérification de bon Affichage
    @And("je verifie le bon affichage des details articles")
    public void jeVerifieLeBonAffichageDesDetailsArticles() {
        WebElement imgArticle = driver.findElement(By.xpath(xpathImage));
        Assert.assertTrue(imgArticle.isDisplayed());
        WebElement desrptionArticle = driver.findElement(By.xpath("//div[@itemprop='description']"));
        Assert.assertTrue(desrptionArticle.isDisplayed());
        WebElement prixArticle = driver.findElement(By.xpath("//p[@class='price']"));
        Assert.assertTrue(prixArticle.isDisplayed());
        WebElement nbExemplaireArticle = driver.findElement(By.xpath("//p[@class=\"stock in-stock\"]"));
        Assert.assertTrue(nbExemplaireArticle.isDisplayed());

    }
    //Verification de la zone de nb exemplaire
    @And("je verifie un champ permet d indiquer le nombre exemplaire voulu")
    public void jeVerifieUnChampPermetDIndiquerLeNombreExemplaireVoulu() {
        WebElement nbExemplaireArticle = driver.findElement(By.xpath("//div[@class='quantity']"));
        Assert.assertTrue("NO STOCK",nbExemplaireArticle.isDisplayed());
    }
    //Vérification de bouton Add to Basket
    @And("je verifie l affichage le bouton ADD TO BASKET")
    public void jeVerifieLAffichageLeBoutonADDTOBASKET() {
        WebElement btnAddArticle = driver.findElement(By.xpath(xpathBtnAddBasket));
        Assert.assertTrue("No Ok",btnAddArticle.isDisplayed());
    }


    @And("jesaisi le nombre exemplaire voulu {string}")
    public void jesaisiLeNombreExemplaireVoulu(String nbrexp) {
        WebElement nbrExemplaire = driver.findElement(By.xpath("//input[@class=\"input-text qty text\"]"));
       nbrExemplaire.clear();
       nbrExemplaire.sendKeys(nbrexp);

    }
    @And("je clique le bouton ADD TO BASKET")
    public void jeCliqueLeBoutonADDTOBASKET() {
        WebElement btnAddArticle = driver.findElement(By.xpath(xpathBtnAddBasket));
        btnAddArticle.click();
        
    }
    @And("je verifie l affichage du message {string} {string} {string}")
    public void jeVerifieLAffichageDuMessage(String msg, String nbr, String nomArticle) {
        WebElement AffichMsg =driver.findElement(By.xpath("//div[@class=\"woocommerce-message\"]"));
        AffichMsg.getText().contains(msg + nbr + nomArticle);
    }

    @And("je clique sur le bouton view Basket")
    public void jeCliqueSurLeBoutonViewBasket() {
        WebElement btnViewBAsket =driver.findElement(By.xpath("//a[@class=\"button wc-forward\"]"));
        btnViewBAsket.click();
    }
    @Then("L article out of stock dans le panier {string}")
    public void lArticleOutOfStockDansLePanier(String nonArticle) {
        WebElement  ArticleOutStock = driver.findElement(By.xpath(xpathArticle+"[contains(text(),'"+nonArticle+"')]"));
        Assert.assertTrue(ArticleOutStock.isDisplayed());
        WebElement msgOutStock = driver.findElement(By.xpath("//p[@class=\"stock out-of-stock\"]"));
        msgOutStock.getText().contains("Out of stock");
    }



}

