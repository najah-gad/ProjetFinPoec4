@REQ_POEC4-14
Feature: [US5]Visualisation des informations d' un utilisateur
	#En tant qu' utilisateur je souhaite depuis la page "My Account" visualiser mes informations de compte Afin de Pouvoir gérer mon compte
	#
	#Règles de gestion :
	#
	#RG1 : Dans la page "My Account", un lien "Account Details" redirige vers les informations de comptes (nom prénom, mail)
	#
	#RG2 : Un espace permet de changer son mot de passe, l'utilisateur doit saisir son mot de passe actuel, saisir un nouveau mot de passe et le confirmer. En cas de succés un message "Account details changed successfully." s'affiche, sinon un message d'erreur s'affiche suivant la nature du problème ("Your current password is incorrect.", "New passwords do not match.")

	#Ce test permet de changer son mot de passe, l'utilisateur doit saisir son mot de passe actuel, saisir un nouveau mot de passe et le confirmer. En cas de succés un message "Account details changed successfully."
	#
	#En cas de saisir MDP acuel invalide ou un nouveau de paasse alors  un message d’erreur s’affiche.
  @TEST_POEC4-30 @TESTSET_POEC4-63 @GR4
  Scenario Outline: [US5]Changement de mot de passe
    Given j ouvre l application practice.automationtesting
    When  je me connecte "<login>" "<MDP>"
    And   je clique sur  Account Details
    And   je saisi un MDP actuel "<MdpActuel>"
    And   je saisi un nouveau MDP "<MDP1>"
    And   je saisi la confirmations de mot de passe "<MDP2>"
    And   je valide modification de MDP
    Then  un message s affiche "<MSG>"
    Examples:

      |login                   |MDP         |MdpActuel      | MDP1          |   MDP2              | MSG|
      |poecgroupe4@yopmail.com |Cd_groupe4  |Cd_groupe4     | Cd_groupe4    |   Cd_groupe4        | Account details changed successfully|
      |poecgroupe4@yopmail.com |Cd_groupe4  |Abdroupe4      | Cd_groupe4    |   Cd_groupe4        | Your current password is incorrect|
      |poecgroupe4@yopmail.com |Cd_groupe4  |Ab_groupe4     | Cd_groupe4    |   Cdgroupe4           | New passwords do not match|
      |poecgroupe4@yopmail.com |Cd_groupe4  |Cd_groupe4     |               |                     |Please fill out all password fields|
