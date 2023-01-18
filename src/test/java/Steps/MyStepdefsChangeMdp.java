package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsChangeMdp extends Hooks {

    //Saisir mot de passe Actuel
    @And("je saisi un MDP actuel {string}")
    public void jeSaisiUnMDPActuel(String mdpactuel) {
        WebElement currentPassword = driver.findElement(By.xpath("//input[@name=\"password_current\"]"));
        currentPassword.sendKeys(mdpactuel);
    }
    //Saisir un nouveau de passe
    @And("je saisi un nouveau MDP {string}")
    public void jeSaisiUnNouveauMDP(String mdp1) {
        WebElement newPassWord = driver.findElement(By.xpath("//input[@name=\"password_1\"]"));
        newPassWord.sendKeys(mdp1);
    }
    //Confirmer nouveau de passe
    @And("je saisi la confirmations de mot de passe {string}")
    public void jeSaisiLaConfirmationsDeMotDePasse(String mdp2) {
        WebElement confirmNewPassWord = driver.findElement(By.xpath("//input[@name=\"password_2\"]"));
        confirmNewPassWord.sendKeys(mdp2);
    }
    //Valider Modification
    @And("je valide modification de MDP")
    public void jeValideModificationDeMDP() {
        WebElement validChange = driver.findElement(By.xpath("//input[@name='save_account_details']"));
        validChange.click();
    }
    // Affichage Message d'information pour la modification
    @Then("un message s affiche {string}")
    public void unMessageSAffiche(String message) {
        //WebElement msgModifMdp = driver.findElement(By.xpath("//ul[@class='woocommerce-error']/li"));
        WebElement msgModifMdp = driver.findElement(By.xpath("//div[@class='woocommerce']"));
        msgModifMdp.getText().contains(message);
        System.out.println(message);
    }



}
