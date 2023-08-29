package Test_Biblio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ClasseMetier.Bande_Dessiner;
import ClasseMetier.Categorie_Utilisateur;
import ClasseMetier.Livre;

class testBiblio {

	
	@Test
	
	public void TestConstructeurLivre() {

		Livre liv = new Livre("Gerard", "AAAA", "oui", 012357);

		assertEquals(012357, liv.getISBN());
		assertEquals("Gerard", liv.getAuteur());
		assertEquals("AAAA", liv.getTitre());
		assertEquals("oui", liv.getDispo());
		
	}
		
	public void TestModifdispoLivre() {
		Livre liv = new Livre("Gerard", "AAAA", "oui", 012357);
		
		Livre.modifDispo();
		assertEquals("non", liv.getDispo());
	}
	
	public void TestConstructeurBd() {

		Bande_Dessiner BAN = new Bande_Dessiner("Gerard", "AAAA", "oui", 012357);

		assertEquals(012357, BAN.getISBN());
		assertEquals("Gerard", BAN.getAuteur());
		assertEquals("AAAA", BAN.getTitre());
		assertEquals("oui", BAN.getDispo());
		
	}
		
	public void TestModifdispoBd() {
		Bande_Dessiner BAN = new Bande_Dessiner("Gerard", "AAAA", "oui", 012357);
		
		Livre.modifDispo();
		assertEquals("non", BAN.getDispo());
	}
	
	public void Utilisateur() {
		ClasseMetier.Utilisateur Uti = new ClasseMetier.Utilisateur( "Nadia", "Massez", Categorie_Utilisateur.Lecteur);
		
		assertEquals("Nadia", Uti.getPrenom());
		assertEquals("Massez", Uti.getNom());
		assertEquals(Categorie_Utilisateur.Lecteur, Uti.getStatut());
	}
	
	
	
		
	}

