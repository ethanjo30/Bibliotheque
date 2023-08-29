package ClasseMetier;

public class Utilisateur {

	private String Nom;
	private String Prenom;
	private Categorie_Utilisateur Statut;
	
	public Utilisateur( String prenom, String nom, Categorie_Utilisateur statut) {
		super();
		Prenom = prenom;
		Nom = nom;
		Statut = statut;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		this.Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		this.Prenom = prenom;
	}

	public Categorie_Utilisateur getStatut() {
		return Statut;
	}

	public void setStatut(Categorie_Utilisateur statut) {
		Statut = statut;
	}
	public String toString(){
		return   Prenom + " " + Nom + " " + Statut ;
		}
	
}
