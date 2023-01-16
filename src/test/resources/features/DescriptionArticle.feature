@REQ_POEC4-15
Feature: [US8]Accès aux détails des articles
	#En tant qu' Utilisateur Je souhaite Accéder aux détails des articles Afin d' Obtenir des informations sur les articles en vente Règles de gestion : RG1 : Les articles sont présentés par une photographie, un détail descriptif, son prix et le nombre d'exemplaires encore disponible RG2 : Un bouton "ADD TO BASKET" permettant d'ajouter l'article au panier. Un champ permet d'indiquer le nombre d'exemplaire voulu RG3 : A chaque ajout, un message “'libellé' has been added to your basket." et un bouton "VIEW BASKET" permettant de se rediriger dans l'espace panier, apparaissent au-dessus l'article

	#Ce test permet de vérifier le bon affichage des articles qui sont présentés par une photographie, un détail descriptif, son prix et le nombre d'exemplaires encore disponible. Un bouton "ADD TO BASKET"  et un champ permet d'indiquer le nombre d'exemplaire voulu sont bien affichés.
  @TEST_POEC4-33 @TESTSET_POEC4-65 @GR4
  Scenario: [US8]Accès aux détails des articles
    Given j ouvre l application practice.automationtesting
    And   je clique sur le lien SHOP
    When  je clique sur un article
    Then  la page detail article s'affiche
    And   je verifie le bon affichage des details articles
    And   je verifie l affichage le bouton ADD TO BASKET
    And   je verifie un champ permet d indiquer le nombre exemplaire voulu
