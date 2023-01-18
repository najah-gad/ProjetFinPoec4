@REQ_POEC4-6
Feature: [U7]Ajout des articles dans le panier depuis la page "Shop"
	#En tant qu' Utilisateur Je souhaite Depuis la page ""Shop"", ajouter des articles dans mon panier Afin de Pouvoir passer des commandes Règles de gestion : RG1 : La page "Shop" contient les articles en vente RG2 : Chaque article possède un bouton "ADD TO BASKET" permettant d'ajouter l'article au panier. A chaque ajout, un lien ""VIEW BASKET"" apparaît au-dessous l'article, si l'article n'est pas en stock, un bouton "READ MORE" apparaît à la place du bouton "ADD TO BASKET" RG3 : Le lien ""View Basket"" redirige vers le panier. Le panier peut être consulté depuis toutes les pages avec un lien contenu dans une icône en entête RG4 : Un filtre permet d'affiner la vue des articles par prix RG5 : Un filtre permet d'affiner la vue des articles par thème RG6 : Chaque article contient une photo descriptive, un libellé et le prix affiché au-dessous. Un lien actif sur ces 3 éléments redirige vers le détail de l'article

	#Ce test permet de vérifier que La page "Shop" contient les articles en vente.  Chaque article contient une photo descriptive, un libellé et le prix affiché au-dessous
	#
	#On vérifie l’existence  des filtres :un filtre permet d'affiner la vue des articles par prix et un filtre permet d'affiner la vue des articles par thème.
	@TEST_POEC4-62 @TESTSET_POEC4-65 @GR4_TNR
	Scenario: Vérifier les détails de la page shop
		Given j ouvre l application practice.automationtesting
		When je clique sur le lien SHOP
		Then je verifie le bon Affichage des articles sur la page shop
		And  je vérifie  la présence du filtre prix
		And  Je vérifie  la présence du filtre thème
