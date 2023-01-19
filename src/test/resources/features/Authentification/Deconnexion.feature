@REQ_POEC4-10
Feature: [U6]La déconnexion de l'application
	#En tant que utilisateur, je souhaite déconnecter de l’application
	#
	#Règles de gestion :
	#RG1 : Dans l'espace "My Account" un lien "Logout" permet la déconnexion, la page Account affiche les pavé de
	#"Login" et de "Register".

  @TEST_POEC4-13 @TESTSET_POEC4-63 @GR4_TNR
  Scenario Outline: [U6]La déconnexion de l'application via logout
    Given j ouvre l application practice.automationtesting
    When j accède la page My Account
    And je saisis un login "<login>"
    And je saisis un mot de passe "<MDP>"
    And je clique sur LOGIN
    And la page Dashbord saffiche
    And je clique sur le lien logout
    Then L affichage du page Account
    And L affichage des pavé de Login et de Registe
    Examples:
      |login                          | MDP|
      |poecgroupe4@yopmail.com        | Cd_groupe4|
