package Pages;

import Commun.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticlePage extends Hooks {
    String xpathArticle="//div[@class='list-post']//descendant::h1";
    String xpathBtnAddBasket ="//button[@class=\"single_add_to_cart_button button alt\"]";
    String xpathImage ="//div[@class=\"images\"]/a[@class=\"woocommerce-main-image zoom\"]";

    //Choisir un article
    public void selectionArticle(String nonArticle){

        WebElement choixArticle = driver.findElement(By.xpath("//*[text()[contains(.,'"+nonArticle+"')]]"));
        choixArticle.click();
    }
    //Affichage de la page Detail Article selectionne
    public void affichTitreArticle(String nonArticle){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathArticle+"[contains(text(),'"+nonArticle+"')]")));
    }
    //Vérification de bon Affichage
    public void affichageDesDetailsArticles() {
        WebElement imgArticle = driver.findElement(By.xpath(xpathImage));
        Assert.assertTrue(imgArticle.isDisplayed());
        WebElement desrptionArticle = driver.findElement(By.xpath("//div[@itemprop='description']"));
        Assert.assertTrue(desrptionArticle.isDisplayed());
        WebElement prixArticle = driver.findElement(By.xpath("//p[@class='price']"));
        Assert.assertTrue(prixArticle.isDisplayed());
        WebElement nbExemplaireArticle = driver.findElement(By.xpath("//p[@class=\"stock in-stock\"]"));
        Assert.assertTrue(nbExemplaireArticle.isDisplayed());
    }
    //Verification de la zone de nb exemplaire d'un article
    public void nombreExemplaireVoulu() {
        WebElement nbExemplaireArticle = driver.findElement(By.xpath("//div[@class='quantity']"));
        Assert.assertTrue("NO STOCK",nbExemplaireArticle.isDisplayed());
    }
    //Saisir le nombre des articles souhaités
    public void saisiLeNbExemplaireVoulu(String nbrexp) {
        WebElement nbrExemplaire = driver.findElement(By.xpath("//input[@class=\"input-text qty text\"]"));
        nbrExemplaire.clear();
        nbrExemplaire.sendKeys(nbrexp);
    }
    //Vérification de bouton Add to Basket dans la page de détail Article
    public void verifBoutonADDTOBASKET() {
        WebElement btnAddArticle = driver.findElement(By.xpath(xpathBtnAddBasket));
        Assert.assertTrue("No Ok",btnAddArticle.isDisplayed());
    }
    // Cliquer sur le bouton ADD BASKET
    public void clicBtnADDTOBASKET() {
        WebElement btnAddArticle = driver.findElement(By.xpath(xpathBtnAddBasket));
        btnAddArticle.click();
    }
    //Verification d'un message d''ajout de bon article
    public void verifiMessageAjout(String msg, String nbr, String nomArticle) {
        WebElement AffichMsg =driver.findElement(By.xpath("//div[@class=\"woocommerce-message\"]"));
        AffichMsg.getText().contains(msg + nbr + nomArticle);
    }
    // Cliquer sur View Basket
    public void clicBoutonViewBasket() {
        WebElement btnViewBAsket =driver.findElement(By.xpath("//a[@class=\"button wc-forward\"]"));
        btnViewBAsket.click();
    }
}
