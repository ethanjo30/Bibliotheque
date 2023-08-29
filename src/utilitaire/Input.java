package utilitaire;

import java.util.Scanner;

public class Input {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void message(String x){
		System.out.println(x);
	}

	public static void resultat(int y){
		System.out.println(y);	
	}
	
	// scan d'entier
	public static int nextInt() {

		return scan.nextInt();
	}
	
	public static String nextLine() {
	
		return scan.nextLine();
	}
	
}