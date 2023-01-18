@REQ_POEC4-15
Feature: [US8]Accès aux détails des articles
	#En tant qu' Utilisateur Je souhaite Accéder aux détails des articles Afin d' Obtenir des informations sur les articles en vente Règles de gestion : RG1 : Les articles sont présentés par une photographie, un détail descriptif, son prix et le nombre d'exemplaires encore disponible RG2 : Un bouton "ADD TO BASKET" permettant d'ajouter l'article au panier. Un champ permet d'indiquer le nombre d'exemplaire voulu RG3 : A chaque ajout, un message “'libellé' has been added to your basket." et un bouton "VIEW BASKET" permettant de se rediriger dans l'espace panier, apparaissent au-dessus l'article

	#Ce test permet de vérifier ajout panier depuis la page détail de l’article en respectant le nb article voulu <  nb exemplaire. Il permet d'ajouter l'article au panier et  un message “'libellé' has been added to your basket." et un bouton "VIEW BASKET" permettant de se rediriger dans l'espace panier, apparaissent au-dessus l'article.
  @TEST_POEC4-59 @TESTSET_POEC4-65 @GR4_TNR
  Scenario Outline: [U8]Ajout Panier de la page détail article
    Given j ouvre l application practice.automationtesting
    And   je clique sur le lien SHOP
    When  je clique sur un article "<nonArticle>"
    Then  la page detail article s'affiche "<nonArticle>"
    And   jesaisi le nombre exemplaire voulu "<nbrExemplaire>"
    And   je clique le bouton ADD TO BASKET
    And   je verifie l affichage du message "<msg>" "<nbrExemplaire>" "<nonArticle>"
    And   je clique sur le bouton view Basket
    Examples:
      | nonArticle              |   nbrExemplaire|msg                     |
      |HTML5 WebApp Develpment  |       5        |libellé' has been added to your basket|
      | Mastering JavaScript    |       4        |libellé' has been added to your basket|
