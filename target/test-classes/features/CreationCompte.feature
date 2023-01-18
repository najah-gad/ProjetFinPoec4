@REQ_POEC4-4
Feature: Création de compte client
    #En tant qu' Utilisateur Je souhaite Créer un compte client Afin de Gérer mes commandes et mes informations personnelles E Règles de gestion : RG1 : Dans l'espace "My Account", l'utilisateur doit pouvoir créer un compte dans le pavé "Register" : - En saisissant son nom et prénom - En saisissant un mail et un mot de passe - En validant avec un bouton "REGISTER" RG2 : Le mot de passe doit être composé à minima de 7 caractères et contenir à minima une majuscule, une minuscule, un chiffre et un caractère spécial

  @TEST_POEC4-89 @GR4_TNR
  Scenario Outline: Valider la création de compte
    Given j ouvre l application practice.automationtesting
    When  j accède la page My Account
    And   je saisis une adresse mail "<mail>"
    And   je saisis un password "<PSW>"
    And   Je valide avec le bouton REGISTER
    Then  la page Dashbord saffiche
    Examples:
      |mail                                |PSW         |
      | groupe4projeT@yopmail.com          |Sdqwo8s87!  |
      | testpractise@yopmail.com           |test_Group12|