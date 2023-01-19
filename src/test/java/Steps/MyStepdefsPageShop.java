package Steps;

import Commun.Hooks;
import Pages.ShopPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MyStepdefsPageShop extends Hooks {
    ShopPage pageShop = new ShopPage();

    //cliquer sur le lien Shop
    @And("je clique sur le lien SHOP")
    public void jeCliqueSurLeLienSHOP() {
        pageShop.clickLeLienSHOP();
    }

    //La page Shop contient les articles en vente etChaque article contient une photo descriptive, un libellé et le prix affiché
    @Then("je verifie le bon Affichage des articles sur la page shop")
    public void jeVerifieLeBonAffichageDesArticlesSurLaPageShop() {

        pageShop.VerifAriclePageShop();
    }

    //Verification Filtre Prix
    @And("je vérifie  la présence du filtre prix")
    public void jeVérifieLaPrésenceDuFiltrePrix() {

        pageShop.FiltrePrix();
    }

    //Verification Filtre theme
    @And("Je vérifie  la présence du filtre thème")
    public void jeVérifieLaPrésenceDuFiltreThème() {

        pageShop.FiltreThème();
    }

    // Vérification d'ajout au panier a partir de la page shop
    @And("Je clique sur ADD TO BASKET pour cet article")
    public void jeCliqueSurADDTOBASKETPourCetArticle() {

        pageShop.clickAddBasket();
    }

    //Vérification View Basket a partir de la page shop
    @Then("je vérifie Un lien VIEW BASKET apparait en dessous de l article")
    public void jeVérifieUnLienVIEWBASKETApparaitEnDessousDeLArticle() {

        pageShop.clicViewBasket();
    }

    //Vérificationn l'affichage de panier
    @And("L article s affiche dans le panier {string}")
    public void lArticleSAfficheDansLePanier(String nonArticle) {

        pageShop.veriArticlePanier(nonArticle);
    }

    // Verification bouton READ MORE pour article non disponible
    @And("Je sélectionne un article indisponible READ MORE")
    public void jeSélectionneUnArticleIndisponibleREADMORE() {

        pageShop.VerifBoutonREADMORE();
    }

    @Then("L article out of stock dans le panier {string}")
    public void lArticleOutOfStockDansLePanier(String nonArticle) {

        pageShop.ajoutArticleOutOfStock(nonArticle);
    }


}



