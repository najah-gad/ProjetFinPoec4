@REQ_POEC4-2
Feature: [US2]Authentification

  @TEST_POEC4-25 @TESTSET_POEC4-63 @GR4
  Scenario Outline: [US2]Connexion échouée
    Given j ouvre l application practice.automationtesting
    When  j accède la page My Account
    And   je saisis un login "<login>"
    And   je saisis un mot de passe "<MDP>"
    And   je clique sur LOGIN
    Then  un message d'erreur s affiche "<MSG>"
    Examples:
      | login                   | MDP         | MSG                                                       |
      | poecgroupe4@yopmail.com | Abgroupe4   | ERROR: The password you entered for the username incorret |
      | testpractise@poec.fr    | TEST!Poec12 | Error: A user could not be found with this email address  |
