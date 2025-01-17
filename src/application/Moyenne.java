package application;

import java.util.Scanner;

public class Moyenne {

	public double calculMoyenne(double nombre1, double nombre2) {
		return (nombre1 + nombre2) / 2;
	}

	public static void main(String[] args) {

		double nombre1;
		double nombre2;

		Moyenne exemple = new Moyenne();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Quel est le premier nombre? ");
		nombre1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Quel est le premier nombre? ");
		nombre2 = scanner.nextDouble();

		double moyenne = exemple.calculMoyenne(nombre1, nombre2);

		System.out.println("La moyenne est: " + moyenne);
	}

}
