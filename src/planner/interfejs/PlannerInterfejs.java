package planner.interfejs;

import java.util.LinkedList;

import planner.Predmet;
import planner.Student;

public interface PlannerInterfejs {

	public void dodajPredmet(Predmet predmet);
	public void ObrisiPredmet(Predmet predmet);
	public Predmet pronadjiPredmet(String naziv);
	public LinkedList<Predmet> vratiSvePredmete();
	public LinkedList<Predmet> vratiPolozenePredmete();
	public void izracunajProsek();
	public void izracunajESPB();
	
	public void ucitajIzFajla(String putanja);
	public void sacuvajUFajl(String putanja);
	
}
