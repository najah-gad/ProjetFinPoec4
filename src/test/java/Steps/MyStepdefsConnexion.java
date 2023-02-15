package Steps;

import Commun.Hooks;
import Pages.ConnexionPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class MyStepdefsConnexion extends Hooks {
    ConnexionPage connexion = new ConnexionPage();
    //Saisir un login
    @And("je saisis un login {string}")
    public void jeSaisisUnLogin(String login) {
        connexion.saisirLogin(login);
    }
    //Saisir mot de passe
    @And("je saisis un mot de passe {string}")
    public void jeSaisisUnMotDePasse(String mdp) {

        connexion.saisirMotDePasse(mdp);
    }
    // clic sur login
    @And("je clique sur LOGIN")
    public void jeCliqueSurLOGIN() {

        connexion.clickBtnLogin();
    }
    //Affichage Dashbord Des la connexion
    @Then("la page Dashbord saffiche")
    public void laPageDashbordSaffiche() {

        connexion.affichdasbord();
    }

    //Affichage msg d'erreur en cas de connexion echouée
    @Then("un message d'erreur s affiche {string} {string}")
    public void unMessageDErreurSAffiche(String Msg, String login) {

        connexion.msgErreur(Msg, login);
    }

    // Se connecter  avec login et mot de passe
    @When("je me connecte {string} {string}")
    public void jeMeConnecte(String login, String MDP) {

        connexion.seConnecte(login, MDP);
    }


}
