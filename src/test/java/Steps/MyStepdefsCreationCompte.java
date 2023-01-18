package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Commun.Hooks.driver;

public class MyStepdefsCreationCompte {


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
        WebElement boutonMyAccounts = driver.findElement(By.xpath("//input[@class='woocommerce-Button button']"));
        boutonMyAccounts.click();


    }

    @Then("J'accède à la page my account")
    public void jAccèdeÀLaPageMyAccount() {
        // WebElement pagedashbord = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/orders/']"));
       // WebElement pageAccount = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/']"));
       // Assert.assertTrue(pageAccount.isDisplayed());
        WebElement msgdashbord = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/orders/']"));
        Assert.assertTrue(msgdashbord.isDisplayed());

    }
}
