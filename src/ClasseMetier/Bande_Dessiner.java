package ClasseMetier;

public class Bande_Dessiner {

	
	private String Auteur;
	private String titre;
	private String Dispo;
	private int ISBN;
	
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		this.Auteur = auteur;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDispo() {
		return Dispo;
	}
	public void setDispo(String dispo) {
		this.Dispo = dispo;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		this.ISBN = iSBN;
	}
	public Bande_Dessiner(String auteur, String titre, String dispo, int iSBN) {
		super();
		this.Auteur = auteur;
		this.titre = titre;
		this.Dispo = dispo;
		this.ISBN = iSBN;
	}
	public String resumer_Bande_Dessiner() {
		return Auteur + " " + titre + " " + "Diponible" + " " + Dispo + " " + "Numéro ISBN" + " " +getISBN();
	}
	public void modifDispo() {
		if (Dispo.matches("oui")) {
			Dispo = "non";
		} else {
			Dispo ="oui";
		}
	}
}
