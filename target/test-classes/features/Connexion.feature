@REQ_POEC4-2
Feature: [US2]Authentification

  @TEST_POEC4-19 @TESTSET_POEC4-63 @GR4
  Scenario Outline: [US2] Connexion réussie
    Given j ouvre l application practice.automationtesting
    When  j accède la page My Account
    And   je saisis un login "<login>"
    And   je saisis un mot de passe "<MDP>"
    And   je clique sur LOGIN
    Then  la page Dashbord saffiche
    And   je verifie le bon fonctionnement menu
    Examples:
      |login                          | MDP|
      |poecgroupe4@yopmail.com        | Cd_groupe4|
