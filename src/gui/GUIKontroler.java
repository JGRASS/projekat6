package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import planner.Planner;
import planner.interfejs.PlannerInterfejs;

public class GUIKontroler extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUIKontroler() {
	}
	
	private static PrijavaGUI prijavaGUI;
	private static PlannerGUI glavni;

	
	private static PlannerInterfejs planner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planner = new Planner();
					prikaziPrijavatProzor();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(prijavaGUI.getContentPane(),
				"Da li ZAISTA zelite da izadjete iz apliacije", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	public static void prikaziPlannerProzor(String ime, String prezime, String brojIndeksa) {
		PlannerGUI prozor = new PlannerGUI();
		ucitajIzFajla(ime, prezime, brojIndeksa);
		prozor.setLocationRelativeTo(prijavaGUI.getContentPane());
		prozor.setVisible(true);
	}
	
	public static void prikaziPrijavatProzor() {
		prijavaGUI = new PrijavaGUI();
		prijavaGUI.setVisible(true);
		prijavaGUI.setLocationRelativeTo(null);
	}
	
	public static void prikaziDodajPredmetProzor() {
		DodajPredmet prozor = new DodajPredmet();
		prozor.setLocationRelativeTo(prijavaGUI.getContentPane());
		prozor.setVisible(true);
	}
	
	
	public static void ucitajIzFajla(String ime, String prezime, String brojIndeksa) {
		try {
				planner.ucitajIzFajla("F:/Workspace/Java/"+ime+prezime+brojIndeksa);
				glavni.prikaziAktuelnePredmete(planner.vratiAktuelnePredmete());
				glavni.prikaziPolozenePredmete(planner.vratiPolozenePredmete());
				glavni.prikaziSvePredmete(planner.vratiSvePredmete());
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(prijavaGUI.getContentPane(), e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
   }

	
	public static void sacuvajUFajl(String ime, String prezime, String brojIndeksa) {
		try {
			planner.sacuvajUFajl("F:/Workspace/Java/"+ime+prezime+brojIndeksa);
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(prijavaGUI.getContentPane(), e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
}
