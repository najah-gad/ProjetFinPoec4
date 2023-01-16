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
    @Given("j ouvre l application practice.automationtesting")
    public void jOuvreLApplicationPracticeAutomationtesting() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }

    @When("j accède la page My Account")
    public void jAccèdeLaPageMyAccount() {
        WebElement btnMyAccounts = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/']"));
        btnMyAccounts.click();
    }

    @And("je saisis un login {string}")
    public void jeSaisisUnLogin(String login) {
        WebElement loginElt = driver.findElement(By.id("username"));
        loginElt.sendKeys(login);
    }

    @And("je saisis un mot de passe {string}")
    public void jeSaisisUnMotDePasse(String mdp) {
        WebElement mdpElt = driver.findElement(By.id("password"));
        mdpElt.sendKeys(mdp);
    }

    @And("je clique sur LOGIN")
    public void jeCliqueSurLOGIN() {
        WebElement btnLogin = driver.findElement(By.xpath("//input[@class='woocommerce-Button button']"));
        btnLogin.click();
    }

    @Then("la page Dashbord saffiche")
    public void laPageDashbordSaffiche() {
        WebElement msgdashbord = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/orders/']"));
        Assert.assertTrue(msgdashbord.isDisplayed());
    }



    @Then("un message d'erreur s affiche {string}")
    public void unMessageDErreurSAffiche(String Msg) {
        System.out.println(Msg);
    }

    @And("je coche l'option remember me")
    public void jeCocheLOptionRememberMe() {
        WebElement rememberCase = driver.findElement(By.xpath("//input[@id='rememberme']"));
        rememberCase.click();
        boolean status = rememberCase.isSelected();
        System.out.println(status);
    }

    @And("je verifie le champ login prerempli")
    public void jeVerifieLeChampLoginPrerempli() {
        WebElement logout = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/customer-logout/']"));
        logout.click();
        WebElement loginElt = driver.findElement(By.id("username"));
        loginElt.click();
        System.out.println("OK");
    }
}
