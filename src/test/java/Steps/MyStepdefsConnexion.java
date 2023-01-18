package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefsConnexion extends Hooks {

    //Ouverture Application
    @Given("j ouvre l application practice.automationtesting")
    public void jOuvreLApplicationPracticeAutomationtesting() {
        super.initDriver();
        WebElement pageAccueil = driver.findElement(By.xpath("//div[@class='col4-2 sub_column sub_column_1-0-1-1 sub_column_post_22']"));
        Assert.assertTrue(pageAccueil.isDisplayed());
        System.out.println("Ouverture Application");
    }


    // Se connecter  avec login et mot de passe
    @When("je me connecte {string} {string}")
    public void jeMeConnecte(String login, String MDP) {
        WebElement btnMyAccounts = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/']"));
        btnMyAccounts.click();
        WebElement loginElt = driver.findElement(By.id("username"));
        loginElt.sendKeys(login);
        WebElement mdpElt = driver.findElement(By.id("password"));
        mdpElt.sendKeys(MDP);
        WebElement btnLogin = driver.findElement(By.xpath("//input[@class='woocommerce-Button button']"));
        btnLogin.click();
    }

    //Saisir un login
    @And("je saisis un login {string}")
    public void jeSaisisUnLogin(String login) {
        WebElement loginElt = driver.findElement(By.id("username"));
        loginElt.sendKeys(login);
    }

    //Saisir mot de passe
    @And("je saisis un mot de passe {string}")
    public void jeSaisisUnMotDePasse(String mdp) {
        WebElement mdpElt = driver.findElement(By.id("password"));
        mdpElt.sendKeys(mdp);
    }

    // clic sur login
    @And("je clique sur LOGIN")
    public void jeCliqueSurLOGIN() {
        WebElement btnLogin = driver.findElement(By.xpath("//input[@class='woocommerce-Button button']"));
        btnLogin.click();
    }

    //Affichage Dashbord
    @Then("la page Dashbord saffiche")
    public void laPageDashbordSaffiche() {
        WebElement msgdashbord = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/orders/']"));
        Assert.assertTrue(msgdashbord.isDisplayed());
    }

    //Affichage msg d'erreur en cas de connexion echouée
    @Then("un message d'erreur s affiche {string} {string}")
    public void unMessageDErreurSAffiche(String Msg, String login) {
        WebElement msgErreur = driver.findElement(By.xpath("//ul[@class='woocommerce-error']"));
        msgErreur.getText().contains(Msg + login);
    }

    //coche l'option remember me
    @And("je coche l'option remember me")
    public void jeCocheLOptionRememberMe() {
        WebElement rememberCase = driver.findElement(By.xpath("//input[@id='rememberme']"));
        rememberCase.click();
        boolean status = rememberCase.isSelected();
        System.out.println(status);
    }

    //Verification champ Login Rempli
    @And("je verifie le champ login prerempli")
    public void jeVerifieLeChampLoginPrerempli() {
        WebElement logout = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/customer-logout/']"));
        logout.click();
       /* WebElement loginChamp = driver.findElement(By.id("woocommerce-login-nonce"));
        Assert.assertTrue(loginChamp.isDisplayed());
        //findElement(By.xpath("//input[@name='_wp_http_referer']"));
       // loginChamp.click();
       // loginElt.click();
        //loginElt.sendKeys(loginElt.getAttribute("value"));*/
    }


}
