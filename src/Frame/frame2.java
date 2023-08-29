package Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ClasseMetier.Bande_Dessiner;
import ClasseMetier.Bibliotheque;
import ClasseMetier.Categorie_Utilisateur;
import ClasseMetier.Emprunteur;
import ClasseMetier.Livre;
import ClasseMetier.Utilisateur;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JScrollBar;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;

public class frame2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	static ArrayList<Livre>listLivre= new ArrayList<>();
	static ArrayList<Livre>listAuteur= new ArrayList<>();
	static ArrayList<Livre>listDispo= new ArrayList<>();
	static ArrayList<Bande_Dessiner>listBD= new ArrayList<>();
	static ArrayList<Bande_Dessiner>listAuteurBD= new ArrayList<>();
	static ArrayList<Bande_Dessiner>listDispoBD= new ArrayList<>();
	static ArrayList<Utilisateur>listLecteur= new ArrayList<>();
	static ArrayList<Emprunteur>QuiEmprunt= new ArrayList<>();
	static ArrayList<Emprunteur>QuiEmpruntTampon= new ArrayList<>();
	static JCheckBox chcBox = new JCheckBox();	

	/**
	 * Launch the application.
	 */
	public static void start(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
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

	/**
	 * Create the frame.
	 */
	public frame2() {
		Object saisie = null;
		JCheckBox chckbxNewCheckBox = null;
		String recupNomLecteur = null;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_8 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_2, 0, 0, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 108, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
						.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
							.addGap(45)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.Y_AXIS));
		
		JButton Bouton_Valider_Selection = new JButton("Valider la selection");
		Bouton_Valider_Selection.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				for (Component chb : panel_9.getComponents()) {
					if (((JCheckBox) chb).isSelected() ) {
						// recupere le livre
						// appel la methode modifdispo
						for (int i=0; i < listLivre.size(); i++){
							 if (listLivre.get(i).getTitre().matches(((JCheckBox) chb).getText())) {
								listLivre.get(i).modifDispo();
								//System.out.println(listLivre.get(i).getDispo() + "-" + listLivre.get(i).getTitre() );
							}
						}
					}
				}
				
				String recupNomLecteur = textField_1.getText();
				for (Utilisateur value : listLecteur) {
					for (int i=0; i < listLivre.size(); i++){
					if (value.getNom().matches(recupNomLecteur)) {
					System.out.println(value.toString());
					}}
				
				JOptionPane.showMessageDialog(new JFrame(),value.toString(), null, JOptionPane.INFORMATION_MESSAGE);
				}
				
//				Emprunteur Couple_tampon_Livre = new Emprunteur(Utilisateur_Tampon_Livre, Livre_Tampon); // creation d'un emprunteur avec les deux valeur precedente
//				QuiEmprunt.add(Couple_tampon_Livre); // Ajout des donnée dans la liste QuiEmprunt
//				System.out.println(QuiEmprunt.get(QuiEmprunt.size()-1).toString()); // Verrification grace a l'affichage
//			}
			}
			
		});				

		Bouton_Valider_Selection.setForeground(new Color(0, 128, 0));
		panel_8.add(Bouton_Valider_Selection);
		Bouton_Valider_Selection.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		Bouton_Valider_Selection.setVisible(false);
			
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel Nb_Livre = new JLabel(listLivre.size() + " " + "livre disponible");
		Nb_Livre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		Nb_Livre.setBackground(new Color(240, 240, 240));
		panel_2.add(Nb_Livre);
		
		JLabel Nom_Lecteur = new JLabel("Nom du lecteur");
		Nom_Lecteur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		
		panel_2.add(Nom_Lecteur);
		
		textField_1 = new JTextField();
		textField_1.addContainerListener(new ContainerAdapter() {
			@Override
			// a l'ajout utilisateur le scan se met en route
			public void componentAdded(ContainerEvent e) {
				Scanner scan = new Scanner(System.in); 
				String recupNomLecteur = scan.nextLine();
			}
		});
		
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Nom_Auteur = new JLabel("Nom de l'auteur");
		Nom_Auteur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		panel_2.add(Nom_Auteur);
		
		textField = new JTextField();	
		textField.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				Scanner scan2 = new Scanner(System.in); 
				String recupAuteur = scan2.nextLine();
			}
		});
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("valider");
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				String recupAuteur = textField.getText();
				Bouton_Valider_Selection.setVisible(true);
				for (Livre value : listLivre) { // boucle qui parcour toute la liste
					if (value.getAuteur().matches(recupAuteur)) { // boucle qui lis tout les auteur jusqu'a trouver celui de la saisie
						JCheckBox chcBox = new JCheckBox();	
						panel_9.add(chcBox);
						chcBox.setText(value.resumer_livre());
						chcBox.setVisible(true);					
					}
				}
			}
	
		});
		
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Annuler");
		btnNewButton_1.setForeground(new Color(220, 20, 60));
		btnNewButton_1.setFont(new Font("Stencil", Font.PLAIN, 11));
		panel.add(btnNewButton_1);
		contentPane.setLayout(gl_contentPane);
	}
}
