@REQ_POEC4-1
Feature: [U3]Présence de Logo
	#En tant que utilisateur, je souhaite voir le logo du Site "AT"
	#
	#Règles de gestion :
	#RG1 : Le logo contient un lien qui doit rediriger le site sur la page accueil
	#RG2 : Le logo doit être présent sur toutes les pages du site

	#Ce test permet de vérifier si le clic sur le logo redirige à la page d’accueil
  @TEST_POEC4-3 @TESTSET_POEC4-66 @GR4_TNR
  Scenario: [U3]Le bon fonctionnement du logo "AT"
    Given j ouvre l application practice.automationtesting
    When je verifie l affichage logo AT
    And je clique sur la page shop
    And je clique sur le logo AT
    Then le logo rederige vers la page d acceuil via un lien
    And je clique sur la page My Account
    And je clique sur le logo AT
    And le logo rederige vers la page d acceuil via un lien
    And je clique sur la page Test case
    And je clique sur le logo AT
    And le logo rederige vers la page d acceuil via un lien
    And je clique sur la page panier
    And je clique sur le logo AT
    And le logo rederige vers la page d acceuil via un lien
