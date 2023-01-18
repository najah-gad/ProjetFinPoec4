package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsMyAccount extends Hooks {
    String xpatherLienDashbord = "//a[@href='https://practice.automationtesting.in/my-account/']";
    String xpatherLienOrder = "//a[@href='https://practice.automationtesting.in/my-account/orders/']";
    String xpatherLienDowloads ="//a[@href='https://practice.automationtesting.in/my-account/downloads/']";
    String xpatherLienAdress = "//a[@href='https://practice.automationtesting.in/my-account/edit-address/']";
    String xpatherLienDEtails = "//a[@href='https://practice.automationtesting.in/my-account/edit-account/']";
    String xpatherLienLogout ="//a[@href='https://practice.automationtesting.in/my-account/customer-logout/']";
    String verifDashbord ="//div[@class='woocommerce-MyAccount-content']";
    String verifOrder ="//div[@class=\"woocommerce-MyAccount-content\"]";
    String verifDowlods ="//div[@class=\"woocommerce-Message woocommerce-Message--info woocommerce-info\"]";
    String verifAddress ="//div[@class='hfeed site']";
    String verifDetailAcounts ="//form[@class=\"woocommerce-EditAccountForm edit-account\"]";
    String verifLogout = "//div[@class=\"clearfix\"]";
    @When("j accède la page My Account")
    public void jAccèdeLaPageMyAccount() {
        WebElement btnMyAccounts = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/']"));
        btnMyAccounts.click();
    }
    @And("je verifie le bon fonctionnement menu")
    public void jeVerifieLeBonFonctionnementMenu() {

        //Verifier l'existence du bouton Dashbord et son bon fonctionnement
        WebElement dashbord = driver.findElement(By.xpath(xpatherLienDashbord));
        dashbord.click();
        WebElement msgdashbord = driver.findElement(By.xpath(verifDashbord));
        msgdashbord.getText().contains("From your account dashboard you can view your");
        driver.navigate().back();

        //Verifier l'existence du bouton Orders et son bon fonctionnement
        WebElement orders = driver.findElement(By.xpath(xpatherLienOrder));
        orders.click();
        WebElement ordersContenu = driver.findElement(By.xpath(verifOrder));
        Assert.assertTrue(ordersContenu.isDisplayed());
        driver.navigate().back();

        //Verifier l'existence du bouton downloads et son bon fonctionnement
        WebElement downloads = driver.findElement(By.xpath( xpatherLienDowloads));
        downloads.click();
        WebElement downloadContenu = driver.findElement(By.xpath(verifDowlods));
        Assert.assertTrue(downloadContenu.isDisplayed());
        driver.navigate().back();

        //Verifier l'existence du bouton Address et son bon fonctionnement
         WebElement address = driver.findElement(By.xpath(xpatherLienAdress));
        address.click();
        WebElement addressContenu = driver.findElement(By.xpath(verifAddress));
        Assert.assertTrue(addressContenu.isDisplayed());
        driver.navigate().back();

        //Verifier l'existence du bouton  Details Accounts  et son bon fonctionnement
        WebElement detailsAccounts = driver.findElement(By.xpath(xpatherLienDEtails));
        detailsAccounts.click();
        WebElement detailsContenu = driver.findElement(By.xpath(verifDetailAcounts));
        Assert.assertTrue(detailsContenu.isDisplayed());
        driver.navigate().back();

        //  Verifier l'existence du bouton Deconnexion et son bon fonctionnement
        WebElement logout = driver.findElement(By.xpath(xpatherLienLogout));
        logout.click();
        WebElement AccountPage = driver.findElement(By.xpath(verifLogout));
        Assert.assertTrue(AccountPage.isDisplayed());
        driver.navigate().back();

    }
}
