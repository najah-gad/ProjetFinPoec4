@REQ_POEC4-11
Feature: [U9]Consultation du panier
	#En tant que utilisateur, je souhaite consulter mon panier.
	#
	#Règles de gestion :
	#RG1 : La page panier affiche un récapitulatif des articles ajoutés spécifiant la quantité, le prix unitaire et le prix
	#total
	#RG2 : Chaque article peut être supprimé par un bouton, la quantité de chaque article peut être modifié par le
	#champ quantité
	#RG3 : Au-dessous du récapitulatif des articles, un champ "Coupon code" et un bouton "APPLY COUPON"
	#permettant d’apppliquer un code promotionnel sur la commande
	#RG3 : Un pavé récapitulatif "Basket Totals" spécifie le prix total et la taxe associée
	#RG4 : Un bouton "Proceed to Checkout" permet de valider la commande et de passer au paiement"

	#Ce test permet de valider la commande
  @TEST_POEC4-24 @TESTSET_POEC4-65 @GR4_TNR
  Scenario Outline: [U9]Validation de la commande
    Given j ouvre l application practice.automationtesting
    When  j accède la page My Account
    And   je saisis un login "<login>"
    And   je saisis un mot de passe "<MDP>"
    And   je clique sur LOGIN
    And  la page Dashbord saffiche
    And je clique sur la page shop
    And je clique sur le lien ADD TO BASKET
    And je clique sur le bouton panier
    And je verifie l affichage de pavé Basket Totals
    And je verifie la présence de prix total
    And je verifie la présence de taxe associée
    And je clique sur la bouton Proceed to Checkout
    Then la commande est validée et passer au paiement
    Examples:
      |login                          | MDP|
      |poecgroupe4@yopmail.com        | Cd_groupe4|
