package application;

import java.util.Scanner;

public class CalculsDoWhile {

	/*
	 * Structures conditionnelles: do while : 
	 * - Répète un bloc de code tant qu'une condition est vraie.
	 * - Execute le bloc au moins une fois peut importe la condition
	 */

	public boolean afficherResultat(int operation, double nombre1, double nombre2) {
		switch (operation) {
		case 0:
			return true;
		case 1:
			// addition
			System.out.println("Le resultat est: " + (nombre1 + nombre2));
			return false;
		case 2:
			System.out.println("Le resultat est: " + (nombre1 - nombre2));
			return false;
		case 3:
			System.out.println("Le resultat est: " + (nombre1 * nombre2));
			return false;
		case 4:
			System.out.println("Le resultat est: " + (nombre1 / nombre2));
			return false;
		case 5:
			System.out.println("Le resultat est: " + (calculMoyenne(nombre1, nombre2)));
			return false;
		default:
			System.out.println("Votre choix n'est pas valide");
			return false;
		}
	}

	public char determineResultat(double moyenne) {

		if (moyenne >= 85) {
			return 'A';
		} else if (moyenne >= 75 && moyenne < 85) {
			return 'B';
		} else if (moyenne >= 60 && moyenne < 75) {
			return 'C';
		} else {
			return 'D';
		}
	}

	public double calculMoyenne(double nombre1, double nombre2) {
		return (nombre1 + nombre2) / 2;
	}

	public int obtenirOperation(Scanner scanner) {

		int choix;

		System.out.println("1. Addition");
		System.out.println("2. Soustraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Moyenne");
		System.out.println("0. Terminer");
		System.out.println("\n");
		System.out.print("Quel est l'opération ? \n");
		choix = scanner.nextInt();
		return choix;
	}

	public static void main(String[] args) {

		double nombre1;
		double nombre2;
		boolean terminer = false;
		CalculsDoWhile exemple = new CalculsDoWhile();
		Scanner scanner = new Scanner(System.in);

		do {
			int operation = exemple.obtenirOperation(scanner);
			System.out.print("Quel est le premier nombre? ");
			nombre1 = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Quel est le premier nombre? ");
			nombre2 = scanner.nextDouble();


			terminer = exemple.afficherResultat(operation, nombre1, nombre2);
		} while (!terminer);
	}

}
