package application;

import java.util.Scanner;

public class ResultatMoyenneIf {
	
	/*
	 * Structures conditionnelles: exécuter des blocs de
	 * code en fonction d'une ou plusieurs conditions.
	 * 
	 * if / else if / else :
	 * Permet d'exécuter un bloc de code si une condition est vraie.
	 */	
	
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

	public static void main(String[] args) {

		double nombre1;
		double nombre2;

		ResultatMoyenneIf exemple = new ResultatMoyenneIf();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Quel est le premier nombre? ");
		nombre1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Quel est le premier nombre? ");
		nombre2 = scanner.nextDouble();

		double moyenne = exemple.calculMoyenne(nombre1, nombre2);

		System.out.println("La moyenne est: " + exemple.determineResultat(moyenne));
	}

}
