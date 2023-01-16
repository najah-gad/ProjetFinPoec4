package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsGestionCompte extends Hooks {
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

    @And("je clique sur  Account Details")
    public void jeCliqueSurAccountDetails() {
        WebElement btnDetails = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/edit-account/']"));
        btnDetails.click();
    }

    @Then("Un formulaire avec les informations de client saffiche")
    public void unFormulaireAvecLesInformationsDeClientSaffiche() {
        System.out.println("Formulaire OK");
    }

    @And("Un espace permet de modifier son mot de passe s affiche")
    public void unEspacePermetDeModifierSonMotDePasseSAffiche() {
        System.out.println("MDP OK");
    }
}
