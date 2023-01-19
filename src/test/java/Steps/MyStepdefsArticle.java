package Steps;

import Commun.Hooks;
import Pages.ArticlePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyStepdefsArticle extends Hooks {

  ArticlePage article = new ArticlePage();

    //Choisir un article
     @When("je clique sur un article {string}")
    public void jeCliqueSurUnArticle(String nonArticle){

         article .selectionArticle(nonArticle);
    }
    //Affichage de la page Detail Article selectionne
   @Then("la page detail article s'affiche {string}")
    public void laPageDetailArticleSAffiche(String nonArticle){

         article .affichTitreArticle(nonArticle);
    }
    //Vérification de bon Affichage
    @And("je verifie le bon affichage des details articles")
    public void jeVerifieLeBonAffichageDesDetailsArticles() {

         article.affichageDesDetailsArticles();
    }

    //Verification de la zone de nb exemplaire d'un article
    @And("je verifie un champ permet d indiquer le nombre exemplaire voulu")
    public void jeVerifieUnChampPermetDIndiquerLeNombreExemplaireVoulu() {

         article.nombreExemplaireVoulu();
    }

    //Saisir le nombre des articles souhaités
    @And("jesaisi le nombre exemplaire voulu {string}")
    public void jesaisiLeNombreExemplaireVoulu(String nbrexp) {
        article.saisiLeNbExemplaireVoulu(nbrexp);
    }

    //Vérification de bouton Add to Basket dans la page de détail Article
    @And("je verifie l affichage le bouton ADD TO BASKET")
    public void jeVerifieLAffichageLeBoutonADDTOBASKET() {

         article.verifBoutonADDTOBASKET();
    }

    // Cliquer sur le bouton ADD BASKET
    @And("je clique le bouton ADD TO BASKET")
    public void jeCliqueLeBoutonADDTOBASKET() {

         article.clicBtnADDTOBASKET();
    }

    //Verification d'un message d''ajout de bon article
    @And("je verifie l affichage du message {string} {string} {string}")
    public void jeVerifieLAffichageDuMessage(String msg, String nbr, String nomArticle) {
        article.verifiMessageAjout(msg,nbr,nomArticle);
    }
    // Cliquer sur View Basket
    @And("je clique sur le bouton view Basket")
    public void jeCliqueSurLeBoutonViewBasket() {

         article.clicBoutonViewBasket();
    }

}

