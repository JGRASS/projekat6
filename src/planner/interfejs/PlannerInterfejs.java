package planner.interfejs;

import java.util.LinkedList;

import planner.Predmet;

public interface PlannerInterfejs {

	public void dodajPredmet(Predmet predmet);
	public void ObrisiPredmet(Predmet predmet);
	public Predmet pronadjiPredmet(String naziv);
	public LinkedList<Predmet> vratiSvePredmete();
	public LinkedList<Predmet> vratiPolozenePredmete();
	public double izracunajProsek();
	public int izracunajESPB();
	
	public void ucitajIzFajla(String putanja);
	public void sacuvajUFajl(String putanja);
	
}
