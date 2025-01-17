package application;

import java.util.Scanner;

public class BouclesFor {

	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("------------");
//			System.out.println("i => " + i);
//			System.out.println("------------");
//			for (int j = 0; j < 10; j++) {
//				System.out.println("j => " + j);
//			}
//		}

//		for (int i = 0; i < 10; i++) {
//			System.out.print("*");
//
//			for (int j = 0; j < 10; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println("");
//		}
//	}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int i, j;
		i = 0;
		while (i < n) {
			j = 0;
			while (j < m) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
