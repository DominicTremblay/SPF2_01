package application;

import java.util.Scanner;

public class CalculsSwitch {
	
	/*
	 * Structures conditionnelles: switch
	 * - Permet de choisir entre plusieurs blocs de code en fonction de la valeur d'une variable.
	 * - Clarifie le code lorsqu'il y a plusieurs cas
	 * - Ne prend en charge que des valeurs spécifiques ou des cas exacts
	 * - Ne fonctionne pas avec tous les types
	 */	

	
	public void afficherResultat(int operation, double nombre1, double nombre2) {
		switch(operation) {
		case 1:
			// addition
			System.out.println("Le resultat est: " + (nombre1 + nombre2));
			break;
		case 2:
			System.out.println("Le resultat est: " + (nombre1 - nombre2));
			break;
		case 3:
			System.out.println("Le resultat est: " + (nombre1 * nombre2));
			break;
		case 4: 
			System.out.println("Le resultat est: " + (nombre1 / nombre2));
			break;
		case 5:
			System.out.println("Le resultat est: " + (calculMoyenne(nombre1,nombre2)));
			break;
		default:
			System.out.println("Votre choix n'est pas valide");
		}
	}
	
	public char determineResultat(double moyenne) {
		
		if (moyenne >= 85) {
			return 'A';
		} else if (moyenne >= 75 && moyenne < 85) {
			return 'B';
		} else if (moyenne >= 60 && moyenne <75) { 
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
		System.out.println("\n");
		System.out.print("Quel est l'opération ? \n");
		choix = scanner.nextInt();
		return choix;
	}

	public static void main(String[] args) {

		double nombre1;
		double nombre2;
		CalculsSwitch exemple = new CalculsSwitch();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quel est le premier nombre? ");
		nombre1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Quel est le premier nombre? ");
		nombre2 = scanner.nextDouble();
	
		int operation = exemple.obtenirOperation(scanner);
		
		exemple.afficherResultat(operation, nombre1, nombre2);
	}

}
