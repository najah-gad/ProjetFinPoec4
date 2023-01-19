@REQ_POEC4-7
Feature: Souscription à la newsletter
	#En tant qu' Utilisateur Je souhaite Souscrire à la newsletter Afin de Me tenir informer des dernières nouvelles de la boutique en ligne Règles de gestion : RG1 : Un champ « SUBSCRIBE HERE » permet la saisie d’une adresse. Un bouton "SUBSCRIBE" permet la validation de cette adresse RG2 : L’adresse saisie doit être au format "xxx@yyy.zz" En cas d’erreur à la validation de l’adresse (format) un message "Please provide a valid email address" apparaît RG3 : La fonctionnalité est présente sur les pages "Shop", "My Account" et "Panier" RG4 : A la souscription, un mail de confirmation est reçu dans la boite mail de l’utilisateur

	#Ce test permet de vérifier la présence de la fonctionnalité newsletter dans la page My account
  @TEST_POEC4-52 @TESTSET_POEC4-64 @GR4_TNR
  Scenario: Présence de la fonctionnalité newsletter dans la page My account
    Given j ouvre l application practice.automationtesting
    When Je clique sur My account
    Then La fonctionnalité newsletter est présente
