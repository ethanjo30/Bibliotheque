package ClasseMetier;


public class Emprunteur {
	
	private Utilisateur Nom;
	private Livre livre;
	private Bande_Dessiner BD;
	private Livre Titre;
	private Bande_Dessiner titre2;

	public Emprunteur(Utilisateur util, Livre livre) {
		super();
		this.Nom = util;
		this.livre = livre;
	}
	public Emprunteur(Utilisateur util, Bande_Dessiner bD) {
		super();
		this.Nom = util;
		BD = bD;
	}

	public Utilisateur getNom() {
		return Nom;
	}

	@Override
	public String toString() {
		return Nom.toString()  +" "+  " a emprunter"+" "+ livre.resumer_livre() + "]";
	}
	public String toString2() {
		return Nom.toString()  +" "+  " a emprunter"+" "+ BD.resumer_Bande_Dessiner() + "]";
	}
	public String RenduLivre() {
		return Nom.toString()  +" "+  " a rendu"+" "+ livre.resumer_livre()+ " "+  "]";
	}
	
	public String RenduBD() {
		return Nom.toString()  +" "+  " a rendu "+" "+ BD.resumer_Bande_Dessiner() + "]";
	}
	public Livre getTitre() {
		return Titre;
	}
	public void setTitre(Livre titre) {
		Titre = titre;
	}
	public Bande_Dessiner getTitre2() {
		return titre2;
	}
	public void setTitre2(Bande_Dessiner titre2) {
		this.titre2 = titre2;
	}

}