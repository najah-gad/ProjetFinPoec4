@REQ_POEC4-6
Feature: [U7]Ajout des articles dans le panier depuis la page "Shop"
	#En tant qu' Utilisateur Je souhaite Depuis la page ""Shop"", ajouter des articles dans mon panier Afin de Pouvoir passer des commandes Règles de gestion : RG1 : La page "Shop" contient les articles en vente RG2 : Chaque article possède un bouton "ADD TO BASKET" permettant d'ajouter l'article au panier. A chaque ajout, un lien ""VIEW BASKET"" apparaît au-dessous l'article, si l'article n'est pas en stock, un bouton "READ MORE" apparaît à la place du bouton "ADD TO BASKET" RG3 : Le lien ""View Basket"" redirige vers le panier. Le panier peut être consulté depuis toutes les pages avec un lien contenu dans une icône en entête RG4 : Un filtre permet d'affiner la vue des articles par prix RG5 : Un filtre permet d'affiner la vue des articles par thème RG6 : Chaque article contient une photo descriptive, un libellé et le prix affiché au-dessous. Un lien actif sur ces 3 éléments redirige vers le détail de l'article

	#Ce test permet de vérifier le message “READ MORE” pour l’ajout d’un article indisponible
  @TEST_POEC4-47 @TESTSET_POEC4-65 @GR4_TNR
  Scenario Outline: Verifier l'indisponibilité d'un article
    Given j ouvre l application practice.automationtesting
    When  je clique sur le lien SHOP
    And  Je sélectionne un article indisponible READ MORE
    Then  L article out of stock dans le panier "<nonArticle>"
    Examples:
      | nonArticle              |
      |Functional Programming in JS  |
