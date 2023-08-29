package ClasseMetier;

import java.util.ArrayList;
import java.util.Scanner;

import utilitaire.Input;

public class Bibliotheque {
	// liste des differentes ArrayList
	static ArrayList<Livre>listLivre= new ArrayList<>();
	static ArrayList<Livre>listAuteur= new ArrayList<>();
	static ArrayList<Livre>listDispo= new ArrayList<>();
	static ArrayList<Bande_Dessiner>listBD= new ArrayList<>();
	static ArrayList<Bande_Dessiner>listAuteurBD= new ArrayList<>();
	static ArrayList<Bande_Dessiner>listDispoBD= new ArrayList<>();
	static ArrayList<Utilisateur>listLecteur= new ArrayList<>();
	static ArrayList<Emprunteur>QuiEmprunt= new ArrayList<>();
	static ArrayList<Emprunteur>QuiEmpruntTampon= new ArrayList<>();
	
		public static void start() {
		

		Livre livre1 = new Livre("Thilliez", "Labyrinthes", "oui", 1);
		Livre livre2 = new Livre("Thilliez", "Lucas", "oui", 2);
		Livre livre3 = new Livre("Thilliez", "La chambre des morts", "oui", 3);
		Livre livre4 = new Livre("George", "La maison des rêves", "oui", 4);
		Livre livre5 = new Livre("George", "La prairie enchanter", "oui", 5);
		Livre livre6 = new Livre("Yann", "Le crépuscule d'été", "oui", 6);
		
		listLivre.add(livre1);
		listLivre.add(livre4);
		listLivre.add(livre3);
		listLivre.add(livre2);
		listLivre.add(livre5);
		listLivre.add(livre6);
		
		Bande_Dessiner BD1 = new Bande_Dessiner("Asterix", "César j'en est marre", "oui", 1);
		Bande_Dessiner BD2 = new Bande_Dessiner("Asterix", "La fameuse recette", "oui", 2);
		Bande_Dessiner BD3 = new Bande_Dessiner("George", "Tintin encore en dangé", "oui", 3);
		Bande_Dessiner BD4 = new Bande_Dessiner("Boule et bille", "Catastrophe ambulante", "oui", 4);
		
		listBD.add(BD1);
		listBD.add(BD2);
		listBD.add(BD3);
		listBD.add(BD4);

		Utilisateur Arnaud = new Utilisateur("Arnaud", "Ponti", Categorie_Utilisateur.Lecteur);
		Utilisateur Nathalie = new Utilisateur("Natalie", "Jordan", Categorie_Utilisateur.Lecteur);
		Utilisateur Veronique = new Utilisateur("Veronique", "Massez", Categorie_Utilisateur.Lecteur);
		
		listLecteur.add(Arnaud);
		listLecteur.add(Nathalie);
		listLecteur.add(Veronique);
	}
		
			public static void Emprunter_Livre() {
<<<<<<< HEAD
			String saisie4;
			do { // Commence avec un do pour ne pas que la boucle s'arrete
			

			System.out.println("Il y a" + " " + listLivre.size() + " " + "livre disponible"); //recuperation du nombre de livre enregistrer
			System.out.println("Veuillez entrer l'auteur"); // demande d'entrer l'auteur desirer
			
			Scanner scan = new Scanner(System.in); // recupération  de la saisie
			String saisie = scan.nextLine();
			 
			for (Livre value : listLivre) { // boucle qui parcour toute la liste
				if (value.getAuteur().matches(saisie)) { // boucle qui lis tout les auteur jusqu'a trouver celui de la saisie
					System.out.println(value.resumer_livre()); // affiche toute les info du matche auteur
					listAuteur.add(value); // ajout de tout les match dans une nouvelle liste
				}
			}
					
			System.out.println("Le livre est - il dans la liste ?"); // affiche mesage
			
			Scanner scan2 = new Scanner(System.in); // recuperation de la saisie 2
			String saisie2 = scan2.nextLine();
			

//			System.out.println("Il y a" + " " + listLivre.size() + " " + "livre disponible"); //recuperation du nombre de livre enregistrer
//			System.out.println("Veuillez entrer l'auteur"); // demande d'entrer l'auteur desirer
=======
//			String saisie4;
//			do { // Commence avec un do pour ne pas que la boucle s'arrete
>>>>>>> 83bc1dfa194b225cc643e20034010446bad985da
//			
////			System.out.println("Il y a" + " " + listLivre.size() + " " + "livre disponible"); //recuperation du nombre de livre enregistrer
////			System.out.println("Veuillez entrer l'auteur"); // demande d'entrer l'auteur desirer
////			
////			Scanner scan = new Scanner(System.in); // recupération  de la saisie
////			String saisie = scan.nextLine();
////			 
////			for (Livre value : listLivre) { // boucle qui parcour toute la liste
////				if (value.getAuteur().matches(saisie)) { // boucle qui lis tout les auteur jusqu'a trouver celui de la saisie
////					System.out.println(value.resumer_livre()); // affiche toute les info du matche auteur
////					listAuteur.add(value); // ajout de tout les match dans une nouvelle liste
////				}
////			}
////					
////			System.out.println("Le livre est - il dans la liste ?"); // affiche mesage
////			
////			Scanner scan2 = new Scanner(System.in); // recuperation de la saisie 2
////			String saisie2 = scan2.nextLine();
////			
////			for (Livre Value : listAuteur) { // boucle qui parcour toute la liste 
////				if (saisie2.equals("oui") && listAuteur.size() == 1) { // si la saisie est ou ET qu'il en a que un dans la liste
////					Value.modifDispo(); // on change la dispo de oui a non
////					System.out.println("La disponibilité passe à"); 
////					System.out.println(Value.getDispo()); // verrification de la dispo qui a changer
////					
////					Livre Livre_Tampon = null; // creation d'un livre tampon
////					Livre_Tampon = Value; //Le livre tampon prend la valeur de Value
////
////					System.out.println("Entrer le Nom");
////					
////					Scanner scan5 = new Scanner(System.in); // recuperation de la saisie5
////					String saisie5 = scan5.nextLine();
//					
//					for (Utilisateur value3 : listLecteur) { // value3 parcour la liste des lecteurs
//						if (value3.getNom().matches(saisie5)) { // value3 recherche le nom (saisie5) dans la liste jusqu'a matche
//							 Utilisateur Utilisateur_Tampon_Livre = null; // creation d'un Utilisateur tampon
//							  Utilisateur_Tampon_Livre = value3; //L'utilisateur tampon prend la valeur de value 3
//							Emprunteur Couple_tampon_Livre = new Emprunteur(Utilisateur_Tampon_Livre, Livre_Tampon); // creation d'un emprunteur avec les deux valeur precedente
//							QuiEmprunt.add(Couple_tampon_Livre); // Ajout des donnée dans la liste QuiEmprunt
//							System.out.println(QuiEmprunt.get(QuiEmprunt.size()-1).toString()); // Verrification grace a l'affichage
//						}				
//					}
//				} else {
//					
//				if (saisie2.equals("oui")) {
//						System.out.println("Ecrire le titre du livre à emprunter");
//						Scanner scan3 = new Scanner(System.in);
//						String saisie3 = scan3.nextLine();						
//						
//						for (Livre Value2 : listAuteur) {
//							if (Value2.getTitre().matches(saisie3))	{
//						Value2.modifDispo();
//						System.out.println("La disponibilité passe à");
//						System.out.println(Value2.getDispo());
//						
//						Livre Livre_Tampon = null;
//						Livre_Tampon = Value2;
//						
//						System.out.println("Entrer le Nom");
//						
//						Scanner scan6 = new Scanner(System.in); // recuperation de la saisie5
//						String saisie6 = scan6.nextLine();
//						
//						for(Utilisateur value4 : listLecteur) {
//							if (value4.getNom().matches(saisie6)) {
//								Utilisateur Utilisateur_Tampon_Livre = null;
//								Utilisateur_Tampon_Livre = value4;
//								Emprunteur Couple_tampon_Livre = new Emprunteur(Utilisateur_Tampon_Livre, Livre_Tampon);
//								QuiEmprunt.add(Couple_tampon_Livre);
//								System.out.println(QuiEmprunt.get(QuiEmprunt.size()-1).toString());
//							}
//						}
//					}
//							} break ;
//						}
//					
//					}		
//			}
//			
//			System.out.println("Voulez-vous emprunter un autre livre");
//			
<<<<<<< HEAD

			for (Livre Value : listAuteur) { // boucle qui parcour toute la liste 
				if (saisie2.equals("oui") && listAuteur.size() == 1) { // si la saisie est ou ET qu'il en a que un dans la liste
					Value.modifDispo(); // on change la dispo de oui a non
					System.out.println("La disponibilité passe à"); 
					System.out.println(Value.getDispo()); // verrification de la dispo qui a changer
					
					Livre Livre_Tampon = null; // creation d'un livre tampon
					Livre_Tampon = Value; //Le livre tampon prend la valeur de Value

					System.out.println("Entrer le Nom");
					
					Scanner scan5 = new Scanner(System.in); // recuperation de la saisie5
					String saisie5 = scan5.nextLine();
					
					for (Utilisateur value3 : listLecteur) { // value3 parcour la liste des lecteurs
						if (value3.getNom().matches(saisie5)) { // value3 recherche le nom (saisie5) dans la liste jusqu'a matche
							 Utilisateur Utilisateur_Tampon_Livre = null; // creation d'un Utilisateur tampon
							  Utilisateur_Tampon_Livre = value3; //L'utilisateur tampon prend la valeur de value 3
							Emprunteur Couple_tampon_Livre = new Emprunteur(Utilisateur_Tampon_Livre, Livre_Tampon); // creation d'un emprunteur avec les deux valeur precedente
							QuiEmprunt.add(Couple_tampon_Livre); // Ajout des donnée dans la liste QuiEmprunt
							System.out.println(QuiEmprunt.get(QuiEmprunt.size()-1).toString()); // Verrification grace a l'affichage
						}				
					}
				} else {
					
				if (saisie2.equals("oui")) {
						System.out.println("Ecrire le titre du livre à emprunter");
						Scanner scan3 = new Scanner(System.in);
						String saisie3 = scan3.nextLine();						
						
						for (Livre Value2 : listAuteur) {
							if (Value2.getTitre().matches(saisie3))	{
						Value2.modifDispo();
						System.out.println("La disponibilité passe à");
						System.out.println(Value2.getDispo());
						
						Livre Livre_Tampon = null;
						Livre_Tampon = Value2;
						
						System.out.println("Entrer le Nom");
						
						Scanner scan6 = new Scanner(System.in); // recuperation de la saisie5
						String saisie6 = scan6.nextLine();
						
						for(Utilisateur value4 : listLecteur) {
							if (value4.getNom().matches(saisie6)) {
								Utilisateur Utilisateur_Tampon_Livre = null;
								Utilisateur_Tampon_Livre = value4;
								Emprunteur Couple_tampon_Livre = new Emprunteur(Utilisateur_Tampon_Livre, Livre_Tampon);
								QuiEmprunt.add(Couple_tampon_Livre);
								System.out.println(QuiEmprunt.get(QuiEmprunt.size()-1).toString());
							}
						}
					}
							} break ;
						}
					
					}		
			}
			
			System.out.println("Voulez-vous emprunter un autre livre");
			
			Scanner scan4 = new Scanner(System.in);
			saisie4 = scan.nextLine();
			
			}while (saisie4.equals("oui"));		
=======
//			Scanner scan4 = new Scanner(System.in);
//			saisie4 = scan.nextLine();
//			
//			}while (saisie4.equals("oui"));		
>>>>>>> 83bc1dfa194b225cc643e20034010446bad985da
	}

			public static void Emprunter_BD() {
				String saisie4;
				do {
				
				System.out.println("Nombre de livre" + " " + listBD.size());
				System.out.println("Veuillez entrer l'auteur");
				
				Scanner scan = new Scanner(System.in);
				String saisie = scan.nextLine();

				
				for (Bande_Dessiner value : listBD) {
					if (value.getAuteur().matches(saisie)) {
						System.out.println(value.resumer_Bande_Dessiner());
						listAuteurBD.add(value);
					}
						}
				
				System.out.println("La bande dessiner est - elle dans la liste ? ");
				
				Scanner scan2 = new Scanner(System.in);
				String saisie2 = scan2.nextLine();
				
				for (Bande_Dessiner Value : listAuteurBD) {
					if (saisie2.equals("oui") && listAuteurBD.size()==1) {
						Value.modifDispo();
						System.out.println("La disponibilité de passe à");
						System.out.println(Value.getDispo());
						
						Bande_Dessiner BD_Tampon = null;
						BD_Tampon = Value;
						
						System.out.println("entrer la nom");
						Scanner scan5 = new Scanner(System.in);
						String saisie5 = scan5.nextLine();
						
						for (Utilisateur value3 : listLecteur) { 
							if (value3.getNom().matches(saisie5)) {
								Utilisateur Utilisateur_Tampon = null;
								Utilisateur_Tampon = value3;
								Emprunteur Couple_Tampon_BD = new Emprunteur(Utilisateur_Tampon, BD_Tampon);
								QuiEmprunt.add(Couple_Tampon_BD);
								
								System.out.println(QuiEmprunt.get(QuiEmprunt.size()-1).toString2());
							}
						}
						
					}else {
						if (saisie.equals("oui")) {
						System.out.println("Ecrire le titre de la bande dessiner à emprunter");
						Scanner scan3 = new Scanner(System.in);
						String saisie3 = scan3.nextLine();
								
						for (Bande_Dessiner Value2 : listAuteurBD) {
							if (Value2.getTitre().matches(saisie3))	{		
								Value2.modifDispo();
								System.out.println("La disponibilité de passe à");
								System.out.println(Value2.getDispo());
								
								Bande_Dessiner BD_Tampon = null;
								BD_Tampon = Value2;
								
								System.out.println("Entrer le Nom");
								Scanner scan6 = new Scanner(System.in);
								String saisie6 = scan6.nextLine();
								
								for (Utilisateur value4 : listLecteur) {
									if (value4.getNom().matches(saisie6)) {
										Utilisateur Utilisateur_Tampon = null;
										Utilisateur_Tampon = value4;
										Emprunteur Couple_Tampon = new Emprunteur (Utilisateur_Tampon, BD_Tampon);
										QuiEmprunt.add(Couple_Tampon);
										
										System.out.println(QuiEmprunt.get(QuiEmprunt.size()-1).toString());
										
									}
								}
								
						}	
								} break ;
							} 
					
							}}
				Input.message("Voulez-vous emprunter un autre livre");
				
				Scanner scan4 = new Scanner(System.in);
				saisie4 = scan.nextLine();
				
				}while (saisie4.equals("oui"));
				
			}
		
			public static void Rendre_Livre() {	
				String saisie3 = null;
				do {
					
					System.out.println("Entrer le nom du lecteur");
					Scanner scan = new Scanner(System.in);
					String saisie = scan.nextLine();
					
					for ( Emprunteur value : QuiEmprunt) {												
						QuiEmpruntTampon.add(value);
						
						if (value.getNom().getNom().equals(saisie) && QuiEmpruntTampon.size() == 1) {
						//	Livre.modifDispo();
							System.out.println(value.RenduLivre());
							}
						
						System.out.println("Marquer le titre du livre à rendre");
						Scanner scan2 = new Scanner(System.in);
						String saisie2 = scan2.nextLine();
						
						for (Emprunteur Value2 : QuiEmpruntTampon) {
							if (Value2.getTitre().getTitre().equals(saisie2)) {
								//Livre.modifDispo();
								System.out.println(Value2.RenduLivre());
							}}}
					
						System.out.println("Avez-vous d'autre livre a rendre ?");						
							Scanner scan3 = new Scanner(System.in);
							saisie3 = scan3.nextLine();
							
					} while(saisie3.equals("oui"));
				
}
			
			public static void Rendre_BD() {
				String saisie3;
				do {
					
					System.out.println("Entrer le nom du lecteur");
					Scanner scan = new Scanner(System.in);
					String saisie = scan.nextLine();
					
					for (Emprunteur value : QuiEmprunt) {
						QuiEmpruntTampon.add(value);
						
						if (value.getNom().getNom().equals(saisie) && QuiEmpruntTampon.size() == 1) {
							//Livre.modifDispo();
							System.out.println(value.RenduBD());
						}
						System.out.println("Marquer le titre de la Bande dessiner à rendre");
						Scanner scan2 = new Scanner(System.in);
						String saisie2 = scan2.nextLine();
						
						for (Emprunteur Value2 : QuiEmpruntTampon) {
							if (Value2.getTitre2().getTitre().equals(saisie2)) {
								//Livre.modifDispo();
								System.out.println(Value2.RenduLivre());
							}}}				
					System.out.println("Avez-vous d'autre livre a rendre ?");						
					Scanner scan3 = new Scanner(System.in);
					saisie3 = scan3.nextLine();
					
						} while(saisie3.equals("oui"));
			}

			public static void Ajouter_Livre() {
				String saisie4;
				
				do {
		
			System.out.println(listLivre.size());
			
			System.out.println("Veuillez entrer l'auteur");
			
			Scanner scan = new Scanner(System.in);
			String saisie = scan.nextLine();
			
			System.out.println("Veuillez entrer le titre");
			
			Scanner scan2 = new Scanner(System.in);
			String saisie2 = scan.nextLine();
			
			System.out.println("Veuillez entrer l'ISBN");
			
			Scanner scan3 = new Scanner(System.in);
			int saisie3 = scan.nextInt();
			
			Livre Tampon = new Livre(saisie, saisie2, "oui", saisie3);
			
			listLivre.add(Tampon);			
			
			System.out.println(listLivre.size());
			
			System.out.println("Votre livre à bien été ajouter");	
			
			System.out.println("Voulez-vous en ajouter d'autre");
			
			Scanner scan4 = new Scanner(System.in);
			saisie4 = scan4.nextLine();
								
				} while (saisie4.equals("oui"));

			}
			
			public static void Ajouter_BD() {
				String saisie4;
				do {		
				
				System.out.println(listBD.size());
				
				System.out.println("Veuillez entrer l'auteur");
				
				Scanner scan = new Scanner(System.in);
				String saisie = scan.nextLine();
				
				System.out.println("Veuillez entrer le titre");
				
				Scanner scan2 = new Scanner(System.in);
				String saisie2 = scan.nextLine();
				
				System.out.println("Veuillez entrer l'ISBN");
				
				Scanner scan3 = new Scanner(System.in);
				int saisie3 = scan.nextInt();
				
				Bande_Dessiner Tampon = new Bande_Dessiner(saisie, saisie2, "oui", saisie3);
				
				listBD.add(Tampon);
				
				System.out.println(listBD.size());
				
				System.out.println("Votre livre à bien été ajouter");
				System.out.println("Voulez-vous en ajouter d'autre");
				
				Scanner scan4 = new Scanner(System.in);
				saisie4 = scan4.nextLine();
						
					} while (saisie4.equals("oui"));
			}
			
			public static void Ajouter_Lecteur() {
			String saisie3;
			do {
			
			System.out.println(listLecteur.size());
			System.out.println("Veuillez entrer le Prenom");
			
			Scanner scan = new Scanner(System.in);
			String saisie = scan.nextLine();
			
			System.out.println("Veuillez le Nom");
			
			Scanner scan2 = new Scanner(System.in);
			String saisie2 = scan.nextLine();
			
			Utilisateur Tampon = new Utilisateur(saisie, saisie2, Categorie_Utilisateur.Lecteur);
			
			listLecteur.add(Tampon);
			
			System.out.println(listLecteur.size());
			System.out.println("Voulez-vous ajouter un autre lecteur?");
			
			Scanner scan3 = new Scanner(System.in);
			saisie3 = scan3.nextLine();
					
				} while (saisie3.equals("oui"));
	}

			
}
