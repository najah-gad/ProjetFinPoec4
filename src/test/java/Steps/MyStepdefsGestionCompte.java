package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsGestionCompte extends Hooks {
    String lienAcountDeatils = "//a[@href='https://practice.automationtesting.in/my-account/edit-account/']";

    //clic sur Account Details
    @And("je clique sur  Account Details")
    public void jeCliqueSurAccountDetails() {
        WebElement btnDetails = driver.findElement(By.xpath(lienAcountDeatils));
        btnDetails.click();

    }

    //Affichage formulaire des informations clients
    @Then("Un formulaire avec les informations de client saffiche")
    public void unFormulaireAvecLesInformationsDeClientSaffiche() {
        WebElement champUserName = driver.findElement(By.xpath("//input[@name=\"account_first_name\"]"));
        Assert.assertTrue(champUserName.isDisplayed());
        WebElement champLastName = driver.findElement(By.xpath("//input[@name=\"account_last_name\"]"));
        Assert.assertTrue(champLastName.isDisplayed());
        WebElement champMail = driver.findElement(By.xpath("//input[@name=\"account_email\"]"));
        Assert.assertTrue(champMail.isDisplayed());

    }

    //Affichage zone de Saisie nouveau mot de passe
    @And("Un espace permet de modifier son mot de passe s affiche")
    public void unEspacePermetDeModifierSonMotDePasseSAffiche() {
        WebElement currentPassword = driver.findElement(By.xpath("//input[@name=\"password_current\"]"));
        Assert.assertTrue(currentPassword.isDisplayed());
        WebElement newPassWord = driver.findElement(By.xpath("//input[@name=\"password_1\"]"));
        Assert.assertTrue(newPassWord.isDisplayed());
        WebElement confirmNewPassWord = driver.findElement(By.xpath("//input[@name=\"password_2\"]"));
        Assert.assertTrue(confirmNewPassWord.isDisplayed());

    }

    @And("je saisis une adresse mail {string}")
    public void jeSaisisUneAdresseMail(String mail) {
        WebElement adressmail = driver.findElement(By.id("reg_email"));
        adressmail.sendKeys(mail);


    }
    @And("je saisis un password {string}")
    public void jeSaisisUnPassword(String PSW) {
        WebElement password = driver.findElement(By.id("reg_password"));
        password.sendKeys(PSW);
    }
    @And("Je valide avec le bouton REGISTER")
    public void jeValideAvecLeBoutonREGISTER() {
        WebElement boutonMyAccounts = driver.findElement(By.xpath("//input[@name=\"register\"]"));
        boutonMyAccounts.click();

    }


}
