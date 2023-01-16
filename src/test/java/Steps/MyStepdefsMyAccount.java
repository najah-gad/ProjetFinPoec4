package Steps;

import Commun.Hooks;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsMyAccount extends Hooks {
    @And("je verifie le bon fonctionnement menu")
    public void jeVerifieLeBonFonctionnementMenu() {
        //Verif Dashbord
        WebElement dashbord = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/']"));
        dashbord.click();
        WebElement msgdashbord = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/orders/']"));
        Assert.assertTrue(msgdashbord.isDisplayed());
        driver.navigate().back();
        //Verif Orders
        WebElement orders = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/orders/']"));
        orders.click();
        WebElement ordersContenu = driver.findElement(By.xpath("//div[@class=\"woocommerce-MyAccount-content\"]"));
        Assert.assertTrue(ordersContenu.isDisplayed());
        driver.navigate().back();
        //Verif downloads
        WebElement downloads = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/downloads/']"));
        downloads.click();
        WebElement downloadContenu = driver.findElement(By.xpath("//div[@class=\"woocommerce-Message woocommerce-Message--info woocommerce-info\"]"));
        Assert.assertTrue(downloadContenu.isDisplayed());
        driver.navigate().back();
        //Verif Adress
        WebElement address = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/edit-address/']"));
        address.click();
        WebElement addressContenu = driver.findElement(By.xpath("//div[@class='hfeed site']"));
        Assert.assertTrue(addressContenu.isDisplayed());
        driver.navigate().back();
        //Verif details Count
        WebElement detailsAccounts = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/edit-account/']"));
        detailsAccounts.click();
        WebElement detailsContenu = driver.findElement(By.xpath("//form[@class=\"woocommerce-EditAccountForm edit-account\"]"));
        Assert.assertTrue(detailsContenu.isDisplayed());
        driver.navigate().back();
        //Verif Deconnexion
        WebElement logout = driver.findElement(By.xpath("//a[@href='https://practice.automationtesting.in/my-account/customer-logout/']"));
        logout.click();
        WebElement AccountPage = driver.findElement(By.xpath("//div[@class=\"clearfix\"]"));
        Assert.assertTrue(AccountPage.isDisplayed());
        driver.navigate().back();

    }
}
