@REQ_POEC4-14
Feature: [US5]Visualisation des informations d' un utilisateur
	#En tant qu' utilisateur je souhaite depuis la page "My Account" visualiser mes informations de compte Afin de Pouvoir gérer mon compte
	#
	#Règles de gestion :
	#
	#RG1 : Dans la page "My Account", un lien "Account Details" redirige vers les informations de comptes (nom prénom, mail)
	#
	#RG2 : Un espace permet de changer son mot de passe, l'utilisateur doit saisir son mot de passe actuel, saisir un nouveau mot de passe et le confirmer. En cas de succés un message "Account details changed successfully." s'affiche, sinon un message d'erreur s'affiche suivant la nature du problème ("Your current password is incorrect.", "New passwords do not match.")

	#Ce test permet l’accès aux informations de comptes (nom prénom, mail)  à partir de  la page "My Account"
	#
	#en cliquant sur le  lien "Account Details"
  @TEST_POEC4-29 @TESTSET_POEC4-64 @GR4
  Scenario Outline: [US5]Informations de compte  Client
    Given j ouvre l application practice.automationtesting
    When  je me connecte "<login>" "<MDP>"
    And   je clique sur  Account Details
    Then  Un formulaire avec les informations de client saffiche
    And   Un espace permet de modifier son mot de passe s affiche
    Examples:
      |login                     | MDP|
      |poecgroupe4@yopmail.com   |Cd_groupe4|
