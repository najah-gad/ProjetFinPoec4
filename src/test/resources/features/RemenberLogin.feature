@REQ_POEC4-2
Feature: [US2]Authentification
	#En tant qu' utilisateur, je souhaite me connecter à mon compte afin de gérer mes commandes et mes informations personnelles
	#
	#Règles de gestion :
	#
	#RG1 : Dans l'espace "My Account""un pavé ""Login"" permet de saisir son login et son mot de passe et de valider avec un bouton "LOGIN"RG2 : En se connectant à son compte l'écran ""Dashboard"" doit s'afficher, et des liens renvoyant aux pages suivantes sont présentes : Dashboard, Orders , Download, Adresses, Account Details, Logout RG3 : En cas de connexion avec un mot de passe erroné, un message "ERROR: The password you entered for the username "Email" incorrect s'affiche RG4 : Une case à cocher "Remember me" permet de garder son login pré-rempli à la prochaine connexion

  @TEST_POEC4-26 @TESTSET_POEC4-63 @GR4
  Scenario Outline: [US2]Cocher l'option Remember
    Given j ouvre l application practice.automationtesting
    When  j accède la page My Account
    And   je saisis un login "<login>"
    And   je saisis un mot de passe "<MDP>"
    And   je coche l'option remember me
    And   je clique sur LOGIN
    Then  la page Dashbord saffiche
    And   je verifie le champ login prerempli
    Examples:
      |login                     | MDP|
      |poecgroupe4@yopmail.com   |Cd_groupe4|
