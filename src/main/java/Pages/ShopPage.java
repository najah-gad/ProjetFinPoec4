package Pages;

import Commun.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopPage extends Hooks {
    String xpathArticle="//div[@class='list-post']//descendant::h1";
    String xpatherContainPanier = "//div[@class='type-page']//descendant::a";
    String xpatherOutStock = "//a[@href='https://practice.automationtesting.in/product/functional-programming-in-js/']";

    public void clickLeLienSHOP() {
        WebElement shopElt = driver.findElement(By.xpath("//ul[@id=\"main-nav\"]/li[1]"));
        shopElt.click();
    }

    //La page "Shop" contient les articles en vente
    public void VerifAriclePageShop() {
        List<WebElement> listArticles = driver.findElements(By.xpath("//ul[@class=\"products masonry-done\"]/li"));
        for (WebElement article : listArticles) {
            Assert.assertTrue("La photo indispnible", article.findElement(By.className("wp-post-image")).isDisplayed());
            Assert.assertTrue("Absence titre", article.findElement(By.tagName("h3")).isDisplayed());
            Assert.assertTrue("Absence prix", article.findElement(By.className("price")).isDisplayed());
        }
    }
    //Verification filtre prix
    public void FiltrePrix() {
        WebElement filtrePrix = driver.findElement(By.xpath("//div[@id=\"woocommerce_price_filter-2\"]"));
        filtrePrix.getText().contains("Filter by price");

    }
    //verification Filtre theme
    public void FiltreThème() {
        WebElement filtreTheme = driver.findElement(By.xpath("//div[@id=\"woocommerce_product_categories-2\"]"));
        filtreTheme.getText().contains("Product Categories");
        WebElement btClickTheme = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/product-category/html/']"));
        System.out.println(btClickTheme.getText());
        btClickTheme.click();
        List<WebElement> listProduct = driver.findElements(By.xpath("//ul[@class='products masonry-done']/li"));
        Assert.assertEquals(listProduct.size(),3);
    }
    // Affichage bouton Read More
    public void VerifBoutonREADMORE() {
        WebElement btnReadMore = driver.findElement(By.xpath(xpatherOutStock));
        btnReadMore.click();
    }
    //verifier article out of stock
    public void ajoutArticleOutOfStock(String nonArticle) {
        WebElement  ArticleOutStock = driver.findElement(By.xpath(xpathArticle+"[contains(text(),'"+nonArticle+"')]"));
        Assert.assertTrue(ArticleOutStock.isDisplayed());
        WebElement msgOutStock = driver.findElement(By.xpath("//p[@class=\"stock out-of-stock\"]"));
        msgOutStock.getText().contains("Out of stock");
    }
    // clic sur add Basket  article disponible
      public void clickAddBasket() {
        WebElement btnAddToBasket = driver.findElement(By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']"));
        btnAddToBasket.click();
    }
    //clic view Basket
    public void clicViewBasket() {
        WebElement viewBasket = driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward']"));
        Assert.assertTrue(viewBasket.isDisplayed());
        viewBasket.click();
    }
    //verif contenue de panier
    public void veriArticlePanier(String nonArticle) {
        WebElement viewAricleBasKet = driver.findElement(By.xpath(xpatherContainPanier + "[contains(text(),'" + nonArticle + "')]"));
        Assert.assertTrue(viewAricleBasKet.isDisplayed());
    }
}
