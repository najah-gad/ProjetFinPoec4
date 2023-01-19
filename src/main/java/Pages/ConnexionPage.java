package Pages;

import Commun.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConnexionPage extends Hooks {
    String xpathDashbord = "//a[@href='https://practice.automationtesting.in/my-account/orders/']";
    String xpathMyaccount = "//a[@href='https://practice.automationtesting.in/my-account/']";
    String xpathbtnLogin = "//input[@class='woocommerce-Button button']";

    //Saisir Login
    public void saisirLogin(String login) {
        WebElement loginElt = driver.findElement(By.id("username"));
        loginElt.sendKeys(login);
    }

    //Saisir un mot de passe
    public void saisirMotDePasse(String mdp) {
        WebElement mdpElt = driver.findElement(By.id("password"));
        mdpElt.sendKeys(mdp);
    }

    //cliquer sur bouton Login
    public void clickBtnLogin() {
        WebElement btnLogin = driver.findElement(By.xpath("//input[@class='woocommerce-Button button']"));
        btnLogin.click();
    }

    // Affichage msg erreur en cas d'une connexion echoue
    public void msgErreur(String Msg, String login) {
        WebElement msgErreur = driver.findElement(By.xpath("//ul[@class='woocommerce-error']"));
        msgErreur.getText().contains(Msg + login);
    }


    // connexion avec login et mot de passe
    public void seConnecte(String login, String MDP) {
        WebElement btnMyAccounts = driver.findElement(By.xpath(xpathMyaccount));
        btnMyAccounts.click();
        WebElement loginElt = driver.findElement(By.id("username"));
        loginElt.sendKeys(login);
        WebElement mdpElt = driver.findElement(By.id("password"));
        mdpElt.sendKeys(MDP);
        WebElement btnLogin = driver.findElement(By.xpath(xpathbtnLogin));
        btnLogin.click();
    }

    public void affichdasbord() {
        WebElement msgconnexion = driver.findElement(By.xpath(xpathDashbord));
        Assert.assertTrue(msgconnexion.isDisplayed());
    }
}
