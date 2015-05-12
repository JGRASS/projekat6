package planner;

import java.util.LinkedList;

import planner.interfejs.PlannerInterfejs;
import planner.sistemskeoperacije.SODodajPredmet;
import planner.sistemskeoperacije.SOIzracunajESPB;
import planner.sistemskeoperacije.SOIzracunajProsek;
import planner.sistemskeoperacije.SOObrisiPredmet;
import planner.sistemskeoperacije.SOPronadjiPredmet;
import planner.sistemskeoperacije.SOSacuvajUFajl;
import planner.sistemskeoperacije.SOUcitajIzFajla;
import planner.sistemskeoperacije.SOVratiAktuelnePredmete;
import planner.sistemskeoperacije.SOVratiPolozenePredmete;

public class Planner implements PlannerInterfejs{

	private Student student;
	
	@Override
	public void dodajPredmet(Predmet predmet) {
		SODodajPredmet.dodajPredmet(predmet, student.getPredmeti());
		
	}

	@Override
	public void ObrisiPredmet(Predmet predmet) {
		SOObrisiPredmet.ObrisiPredmet(predmet, student.getPredmeti());
		
	}

	@Override
	public Predmet pronadjiPredmet(String naziv) {
		
		return SOPronadjiPredmet.pronadjiPredmet(naziv, student.getPredmeti());
	}

	@Override
	public LinkedList<Predmet> vratiSvePredmete() {
		return student.getPredmeti();
	}

	@Override
	public LinkedList<Predmet> vratiPolozenePredmete() {
		
		return SOVratiPolozenePredmete.vratiPolozenePredmete(student.getPredmeti());
	}
	public LinkedList<Predmet> vratiAktuelnePredmete() {
		
		return SOVratiAktuelnePredmete.vratiAktuelnePredmete(student.getPredmeti());
	}

	@Override
	public double izracunajProsek() {
		return SOIzracunajProsek.izracunajProsek(student.getPredmeti());
	}

	@Override
	public int izracunajESPB() {
		return SOIzracunajESPB.izracunajESPB(student.getPredmeti());
		
	}

	@Override
	public void ucitajIzFajla(String putanja) {
		SOUcitajIzFajla.ucitajIzFajla(putanja, student.getPredmeti());
		
	}

	@Override
	public void sacuvajUFajl(String putanja) {
		SOSacuvajUFajl.sacuvajUFajl(putanja, student.getPredmeti());		
	}
	

	
}
