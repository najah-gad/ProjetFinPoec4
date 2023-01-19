package Steps;

import Pages.MyAccountPage;
import cucumber.api.java.en.And;

public class MyStepdefsMyAccount  {

      //Verification de la presence  des liens renvoyant aux pages
      // suivantes sont présentes : Dashboard, Orders, Download, Adresses, Account Details, Logout

    @And("je verifie le bon fonctionnement menu")
    public void jeVerifieLeBonFonctionnementMenu() {

        MyAccountPage AccountPage = new MyAccountPage();
        AccountPage.afiichagePageDashbord();
        AccountPage.affichagePageOrders();
        AccountPage.verifDownloads();
        AccountPage.verifAddress();
        AccountPage.verifAccountDetails();
        AccountPage.verifLogout();

    }
}
