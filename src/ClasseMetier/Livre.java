package ClasseMetier;

import java.awt.Checkbox;
import java.awt.Component;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JCheckBox;

public class Livre {

	
private String Auteur;
private String Titre;
private static String Dispo;
private static Object listLivre;
private int ISBN;


public String getAuteur() {
	return Auteur;
}
public void setAuteur(String nom) {
	this.Auteur = nom;
}
public String getTitre() {
	return Titre;
}
public void setTitre(String titre) {
	this.Titre = titre;
}
public String getDispo() {
	return Dispo;
}
public void setDispo(String dispo) {
}
public int getISBN() {
	return ISBN;
}
public void setISBN(int iSBN) {
	this.ISBN = iSBN;
}
public Livre(String nom, String titre, String dispo, int iSBN) {
	super();
	this.Auteur = nom;
	this.Titre = titre;
	this.Dispo = dispo;
	this.ISBN = iSBN;
}
public String resumer_livre() {
	return Titre;
}
public void modifDispo() {
	if (Dispo.matches("oui")) {
		Dispo = "non";
	} else {
		Dispo ="oui";
	}
}

}
