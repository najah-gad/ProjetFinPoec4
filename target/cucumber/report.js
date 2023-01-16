$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/DescriptionArticle.feature");
formatter.feature({
  "name": "[US8]Accès aux détails des articles",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC4-15"
    }
  ]
});
formatter.scenario({
  "name": "[US8]Accès aux détails des articles",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POEC4-15"
    },
    {
      "name": "@TEST_POEC4-33"
    },
    {
      "name": "@TESTSET_POEC4-65"
    },
    {
      "name": "@GR4"
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
  "name": "je clique sur le lien SHOP",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsDescriptionArticle.jeCliqueSurLeLienSHOP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur un article",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsDescriptionArticle.jeCliqueSurUnArticle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "la page detail article s\u0027affiche",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsDescriptionArticle.laPageDetailArticleSAffiche()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je verifie le bon affichage des details articles",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsDescriptionArticle.jeVerifieLeBonAffichageDesDetailsArticles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je verifie l affichage le bouton ADD TO BASKET",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsDescriptionArticle.jeVerifieLAffichageLeBoutonADDTOBASKET()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je verifie un champ permet d indiquer le nombre exemplaire voulu",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsDescriptionArticle.jeVerifieUnChampPermetDIndiquerLeNombreExemplaireVoulu()"
});
formatter.result({
  "status": "passed"
});
});