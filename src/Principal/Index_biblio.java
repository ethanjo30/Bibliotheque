package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import ClasseMetier.Bibliotheque;
import ClasseMetier.Livre;
import utilitaire.Input;

public class Index_biblio {

static ArrayList<Livre>listlivre= new ArrayList<>();
static ArrayList<Livre>listBD= new ArrayList<>();

	public static void main(String[] args) {
		
		String saisie5;
		Bibliotheque.start();
		do {
		
		Input.message("0.Emprunter, 1.Rendre, 2. Ajouter");
		
		Scanner scan = new Scanner(System.in);
		int choix = scan.nextInt();
		
		
		switch (choix){
			case 0:{
				Input.message("0.livre, 1.BD");
				
				Scanner scan2 = new Scanner(System.in);
				int choix2 = scan.nextInt();
					switch (choix2){
						case 0:{
							Bibliotheque.Emprunter_Livre();
							break;
						}
						case 1:{
							Bibliotheque.Emprunter_BD();
							break;
						}
					}
					
				break;
			}
			case 1:{
				Input.message("0.livre, 1.BD");
				
					Scanner scan3 = new Scanner(System.in);
					int choix3 = scan.nextInt();
						switch (choix3){
							case 0:{
								Bibliotheque.Rendre_Livre();
								break;
							}
							case 1:{
								Bibliotheque.Rendre_BD();
								break;
							}
						}
				
				break;
			}
			case 2:{
				Input.message("0.livre, 1.BD, 2.Lecteur");
				
					Scanner scan4 = new Scanner(System.in);
					int choix4 = scan.nextInt();
						switch (choix4){
							case 0:{
								Bibliotheque.Ajouter_Livre();
								break;
							}
							case 1:{
								Bibliotheque.Ajouter_BD();
								break;
							}
							case 2:{
								Bibliotheque.Ajouter_Lecteur();
							}
						}
				break;
			}
		}
			
			System.out.println("souhaiter vous continuer ?");						
			Scanner scan5 = new Scanner(System.in);
			saisie5 = scan5.nextLine();
			
		} while(saisie5.equals("oui"));
	}
}
