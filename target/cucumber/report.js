$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/Modificationarticle.feature");
formatter.feature({
  "name": "[U9]Consultation du panier",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC4-11"
    }
  ]
});
formatter.scenarioOutline({
  "name": "[U9]Modification des articles du panier",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_POEC4-22"
    },
    {
      "name": "@TESTSET_POEC4-65"
    },
    {
      "name": "@GR4_TNR"
    }
  ]
});
formatter.step({
  "name": "j ouvre l application practice.automationtesting",
  "keyword": "Given "
});
formatter.step({
  "name": "j accède la page My Account",
  "keyword": "When "
});
formatter.step({
  "name": "je saisis un login \"\u003clogin\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "je saisis un mot de passe \"\u003cMDP\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur LOGIN",
  "keyword": "And "
});
formatter.step({
  "name": "la page Dashbord saffiche",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur la page shop",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur le lien ADD TO BASKET",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur le bouton panier",
  "keyword": "And "
});
formatter.step({
  "name": "l affichage de page panier",
  "keyword": "And "
});
formatter.step({
  "name": "je verifie l affichage des articles ajouteée",
  "keyword": "And "
});
formatter.step({
  "name": "je verfie  la quantité",
  "keyword": "And "
});
formatter.step({
  "name": "je modifie la quantité d un article par le champs quantité \"\u003cnb\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "And je clique sur le bouton Update Basket",
  "keyword": "And "
});
formatter.step({
  "name": "la quantité de l\u0027article est modifié",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "login",
        "MDP",
        "",
        "nb"
      ]
    },
    {
      "cells": [
        "poecgroupe4@yopmail.com",
        "Cd_groupe4",
        "",
        "8"
      ]
    }
  ]
});
formatter.scenario({
  "name": "[U9]Modification des articles du panier",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC4-11"
    },
    {
      "name": "@TEST_POEC4-22"
    },
    {
      "name": "@TESTSET_POEC4-65"
    },
    {
      "name": "@GR4_TNR"
    }
  ]
});
formatter.step({
  "name": "j ouvre l application practice.automationtesting",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefsConnexion.jOuvreLApplicationPracticeAutomationtesting()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "j accède la page My Account",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsConnexion.jAccèdeLaPageMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un login \"poecgroupe4@yopmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConnexion.jeSaisisUnLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un mot de passe \"Cd_groupe4\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConnexion.jeSaisisUnMotDePasse(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur LOGIN",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConnexion.jeCliqueSurLOGIN()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "la page Dashbord saffiche",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConnexion.laPageDashbordSaffiche()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur la page shop",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsLogo.jeCliqueSurLaPageShop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le lien ADD TO BASKET",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConsultationpanier.jeCliqueSurLeLienADDTOBASKET()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur le bouton panier",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConsultationpanier.jeCliqueSurLeBoutonPanier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "l affichage de page panier",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConsultationpanier.lAffichageDePagePanier()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je verifie l affichage des articles ajouteée",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConsultationpanier.jeVerifieLAffichageDesArticlesAjouteée()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je verfie  la quantité",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConsultationpanier.jeVerfieLaQuantité()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je modifie la quantité d un article par le champs quantité \"8\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsModificationarticle.jeModifieLaQuantitéDUnArticleParLeChampsQuantité(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "And je clique sur le bouton Update Basket",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsModificationarticle.andJeCliqueSurLeBoutonUpdateBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "la quantité de l\u0027article est modifié",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsModificationarticle.laQuantitéDeLArticleEstModifié()"
});
formatter.result({
  "status": "passed"
});
});