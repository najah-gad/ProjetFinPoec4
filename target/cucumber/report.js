$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/Connexion.feature");
formatter.feature({
  "name": "[US2]Authentification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC4-2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "[US2] Connexion réussie",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_POEC4-19"
    },
    {
      "name": "@TESTSET_POEC4-63"
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
  "keyword": "Then "
});
formatter.step({
  "name": "je verifie le bon fonctionnement menu",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "login",
        "MDP"
      ]
    },
    {
      "cells": [
        "poecgroupe4@yopmail.com",
        "Ab_groupe4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "[US2] Connexion réussie",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC4-2"
    },
    {
      "name": "@TEST_POEC4-19"
    },
    {
      "name": "@TESTSET_POEC4-63"
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
  "name": "je saisis un mot de passe \"Ab_groupe4\"",
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
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsConnexion.laPageDashbordSaffiche()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je verifie le bon fonctionnement menu",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsMyAccount.jeVerifieLeBonFonctionnementMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:features/ConnexionKO.feature");
formatter.feature({
  "name": "[US2]Authentification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC4-2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "[US2]Connexion échouée",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_POEC4-25"
    },
    {
      "name": "@TESTSET_POEC4-63"
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
  "name": "un message d\u0027erreur s affiche \"\u003cMSG\u003e\"",
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
        "MSG"
      ]
    },
    {
      "cells": [
        "poecgroupe4@yopmail.com",
        "Abgroupe4",
        "ERROR: The password you entered for the username incorret"
      ]
    },
    {
      "cells": [
        "testpractise@poec.fr",
        "TEST!Poec12",
        "Error: A user could not be found with this email address"
      ]
    }
  ]
});
formatter.scenario({
  "name": "[US2]Connexion échouée",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC4-2"
    },
    {
      "name": "@TEST_POEC4-25"
    },
    {
      "name": "@TESTSET_POEC4-63"
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
  "name": "je saisis un mot de passe \"Abgroupe4\"",
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
  "name": "un message d\u0027erreur s affiche \"ERROR: The password you entered for the username incorret\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsConnexion.unMessageDErreurSAffiche(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "[US2]Connexion échouée",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC4-2"
    },
    {
      "name": "@TEST_POEC4-25"
    },
    {
      "name": "@TESTSET_POEC4-63"
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
  "name": "je saisis un login \"testpractise@poec.fr\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConnexion.jeSaisisUnLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un mot de passe \"TEST!Poec12\"",
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
  "name": "un message d\u0027erreur s affiche \"Error: A user could not be found with this email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsConnexion.unMessageDErreurSAffiche(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:features/GererCompte.feature");
formatter.feature({
  "name": "[US5]Visualisation des informations d\u0027 un utilisateur",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC4-14"
    }
  ]
});
formatter.scenarioOutline({
  "name": "[US5]Informations de compte  Client",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_POEC4-29"
    },
    {
      "name": "@TESTSET_POEC4-64"
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
formatter.step({
  "name": "je me connecte \"\u003clogin\u003e\" \"\u003cMDP\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "je clique sur  Account Details",
  "keyword": "And "
});
formatter.step({
  "name": "Un formulaire avec les informations de client saffiche",
  "keyword": "Then "
});
formatter.step({
  "name": "Un espace permet de modifier son mot de passe s affiche",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "login",
        "MDP"
      ]
    },
    {
      "cells": [
        "poecgroupe4@yopmail.com",
        "Ab_groupe4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "[US5]Informations de compte  Client",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC4-14"
    },
    {
      "name": "@TEST_POEC4-29"
    },
    {
      "name": "@TESTSET_POEC4-64"
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
  "name": "je me connecte \"poecgroupe4@yopmail.com\" \"Ab_groupe4\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsGestionCompte.jeMeConnecte(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je clique sur  Account Details",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsGestionCompte.jeCliqueSurAccountDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Un formulaire avec les informations de client saffiche",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsGestionCompte.unFormulaireAvecLesInformationsDeClientSaffiche()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Un espace permet de modifier son mot de passe s affiche",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsGestionCompte.unEspacePermetDeModifierSonMotDePasseSAffiche()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("classpath:features/RemenberLogin.feature");
formatter.feature({
  "name": "[US2]Authentification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC4-2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "[US2]Cocher l\u0027option Remember",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_POEC4-26"
    },
    {
      "name": "@TESTSET_POEC4-63"
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
  "name": "je coche l\u0027option remember me",
  "keyword": "And "
});
formatter.step({
  "name": "je clique sur LOGIN",
  "keyword": "And "
});
formatter.step({
  "name": "la page Dashbord saffiche",
  "keyword": "Then "
});
formatter.step({
  "name": "je verifie le champ login prerempli",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "login",
        "MDP"
      ]
    },
    {
      "cells": [
        "poecgroupe4@yopmail.com",
        "Ab_groupe4"
      ]
    }
  ]
});
formatter.scenario({
  "name": "[US2]Cocher l\u0027option Remember",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC4-2"
    },
    {
      "name": "@TEST_POEC4-26"
    },
    {
      "name": "@TESTSET_POEC4-63"
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
  "name": "je saisis un mot de passe \"Ab_groupe4\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConnexion.jeSaisisUnMotDePasse(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je coche l\u0027option remember me",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConnexion.jeCocheLOptionRememberMe()"
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
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsConnexion.laPageDashbordSaffiche()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je verifie le champ login prerempli",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsConnexion.jeVerifieLeChampLoginPrerempli()"
});
formatter.result({
  "status": "passed"
});
});