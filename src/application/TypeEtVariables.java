package application;

public class TypeEtVariables {

	/*
	 * Type: décrit la nature des donnée Variable: emplacement mémoire qui contient
	 * une donnée d'un certain type.
	 *
	 * Création d’une variable : type identificateur; ou bien: type identificateur =
	 * valeur;
	 * 
	 * 
	 * Deux sortes de types en Java - types primitifs (non objets) - types
	 * références
	 * 
	 * 8 types primitifs:
	 * 
	 * Numériques entiers : byte, short, int, long. Numériques réels : float,
	 * double. Caractères : char. Booléens : boolean.
	 * 
	 */

	public static void main(String[] args) {

		char lettreScrabble;
		lettreScrabble = 'Z';
		byte pointsAllo = 4;

		int pointsOxyphenbutazone = 1178;
		long chiffreAffairesScrabble = 10000000000L;
//		float prixScrabble = 74.99; // Erreur double par defaut
//		float prixScrabble = 74.99F;
//		float prixScrabble = (float) 74.99;
		double prixScrabble = 74.99;

		// Expression
		double tvq = 9.9975 / 100;
		byte quantite = 5;
		double prixTotal;
		prixTotal = quantite * prixScrabble * (1 + tvq);
		boolean populaire = true;

		System.out.println(lettreScrabble);
		System.out.println(pointsAllo);
		System.out.println(prixTotal);
	}

}
