package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsChangeMdp extends Hooks {
    @And("je saisi un MDP actuel {string}")
    public void jeSaisiUnMDPActuel(String mdpactuel) {
        WebElement currentPassword = driver.findElement(By.xpath("//input[@name=\"password_current\"]"));
        currentPassword.sendKeys(mdpactuel);
    }
    @And("je saisi un nouveau MDP {string}")
    public void jeSaisiUnNouveauMDP(String mdp1) {
        WebElement newPassWord = driver.findElement(By.xpath("//input[@name=\"password_1\"]"));
        newPassWord.sendKeys(mdp1);
    }

    @And("je saisi la confirmations de mot de passe {string}")
    public void jeSaisiLaConfirmationsDeMotDePasse(String mdp2) {
        WebElement confirmNewPassWord = driver.findElement(By.xpath("//input[@name=\"password_2\"]"));
        confirmNewPassWord.sendKeys(mdp2);
    }

    @And("je valide modification de MDP")
    public void jeValideModificationDeMDP() {
        WebElement validChange = driver.findElement(By.xpath("//input[@name='save_account_details']"));
        validChange.click();
    }

    @Then("un message s affiche {string}")
    public void unMessageSAffiche(String message) {
        System.out.println(message);
    }



}
