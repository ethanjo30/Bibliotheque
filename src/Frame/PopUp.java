package Frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

import ClasseMetier.Bibliotheque;
import Principal.Index_biblio;

import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import java.beans.PropertyChangeEvent;
import Frame.frame2;

public class PopUp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox comboBox;
	private Button button_Livre, button_BD,button_Lecteur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		frame2.start(args);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopUp frame = new PopUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PopUp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Panel panel = new Panel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JComboBox comboBox = new JComboBox<String>(new String[] {"Emprunter", "Rendre", "Ajouter"});
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String saisie;
					
				switch (comboBox.getSelectedIndex()) {
				
				case 0 :
					button_Livre.setVisible(true);
					button_Livre.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							frame2 frame_Emprunter_Livre = new frame2();
							frame_Emprunter_Livre.setSize(400, 300);
							frame_Emprunter_Livre.setVisible(true);
							
						}
					});
					button_BD.setVisible(true);
					button_BD.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							JFrame frame_Emprunter_BD = new JFrame();
							frame_Emprunter_BD.setSize(getPreferredSize());
							frame_Emprunter_BD.setVisible(true);
							
						}
					});
					button_Lecteur.setVisible(false);
					button_Lecteur.revalidate();
					break;
				case 1 :
					button_Livre.setVisible(true);
					button_Livre.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							Bibliotheque.Rendre_Livre();
						}
					});
					button_BD.setVisible(true);
					button_BD.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							Bibliotheque.Rendre_BD();
						}
					});
					button_Lecteur.setVisible(false);
					button_Lecteur.revalidate();
					break;
				case 2 :
					button_Livre.setVisible(true);
					button_Livre.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							Bibliotheque.Ajouter_Livre();
						}
					});
					button_BD.setVisible(true);
					button_BD.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							Bibliotheque.Ajouter_BD();
						}
					});
					button_Lecteur.setVisible(true);
					button_Lecteur.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							Bibliotheque.Ajouter_Lecteur();
						}
					});
					button_Lecteur.revalidate();
				
					break;
				default :
					break;	
				}}});

		comboBox.setSelectedIndex(-1);
		panel.add(comboBox);
		
		
		Panel panel_2 = new Panel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		
		button_Livre = new Button("Livre");
		button_Livre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Livre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_Livre.setVisible(false);
		button_Livre.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel_2.add(button_Livre);
		
		button_BD = new Button("BD");
		button_BD.setVisible(false);
		panel_2.add(button_BD);
		
		button_Lecteur = new Button("Lecteur");
		button_Lecteur.setVisible(false);
		panel_2.add(button_Lecteur);
		
		
		
	}
}
