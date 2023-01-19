$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/MotDePAsse/SouscrptionNewsletter.feature");
formatter.feature({
  "name": "Souscription à la newsletter",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC4-7"
    }
  ]
});
formatter.scenario({
  "name": "Présence de la fonctionnalité newsletter dans la page My account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@REQ_POEC4-7"
    },
    {
      "name": "@TEST_POEC4-52"
    },
    {
      "name": "@TESTSET_POEC4-64"
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
  "location": "MyStepdefsHome.jOuvreLApplicationPracticeAutomationtesting()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Je clique sur My account",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsNewsletter.jeCliqueSurMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "La fonctionnalité newsletter est présente",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsNewsletter.laFonctionnalitéNewsletterEstPrésente()"
});
formatter.result({
  "status": "passed"
});
});