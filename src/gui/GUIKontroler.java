package gui;


import java.awt.EventQueue;
import java.io.File;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import planner.Planner;
import planner.Predmet;
import planner.interfejs.PlannerInterfejs;

public class GUIKontroler extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUIKontroler() {
	}
	
	
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
					glavni = new PlannerGUI();
					glavni.setVisible(true);
					glavni.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(glavni.getContentPane(),
				"Da li ZAISTA zelite da izadjete iz apliacije", "Izlazak",
				JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	
	public static void prikaziDodajPredmetProzor() {
		DodajPredmet prozor = new DodajPredmet();
		prozor.setLocationRelativeTo(glavni.getContentPane());
		prozor.setVisible(true);
	}
	
	
	public static void ucitajIzFajla() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(glavni.getContentPane());

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				planner.ucitajIzFajla(file.getAbsolutePath());
				
				glavni.prikaziSvePredmete(planner.vratiSvePredmete());
				glavni.prikaziAktuelnePredmete(planner.vratiAktuelnePredmete());
			}	
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(glavni.getContentPane(), e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
   }

	
	public static void sacuvajUFajl() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(glavni.getContentPane());

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();

				planner.sacuvajUFajl(file.getAbsolutePath());
			}
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(glavni.getContentPane(), e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	
	public static void obrisiPredmet(Predmet predmet){
		try{
			planner.ObrisiPredmet(predmet);
			
			glavni.prikaziSvePredmete(planner.vratiSvePredmete());
			glavni.prikaziAktuelnePredmete(planner.vratiAktuelnePredmete());
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(glavni.getContentPane(), e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public static void dodajPredmet(String naziv, String semestar, String ESPB, String datum) {
		try{
			
		Predmet predmet = new Predmet();
		
		predmet.setNaziv(naziv);
		predmet.setSemestar(Integer.parseInt(semestar));
		predmet.setESPB(Integer.parseInt(ESPB));
		predmet.setDatumIspita(datum);
		predmet.setPolozen(false);
		
		planner.dodajPredmet(predmet);
		glavni.prikaziSvePredmete(planner.vratiSvePredmete());
		glavni.prikaziAktuelnePredmete(planner.vratiAktuelnePredmete());
		
		
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(glavni.getContentPane(), e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
		
		}
	

	public static void polozen(Predmet predmet){
		Predmet p = planner.pronadjiPredmet(predmet.getNaziv());
		p.setPolozen(true);
		glavni.prikaziPolozenePredmete(planner.vratiPolozenePredmete());
		glavni.prikaziAktuelnePredmete(planner.vratiAktuelnePredmete());
		
	}


}
