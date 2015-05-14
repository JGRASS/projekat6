package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;
/**
 * 
 * @author Tatjana
 *
 */
public class SODodajPredmet {
	/**
	 * Sistemska operacija za dodavanje novog predmeta u listu predmeti.
	 * 
	 * @param predmet
	 * @param predmeti lista pedmeta
	 */
	public static void dodajPredmet(Predmet predmet, LinkedList<Predmet> predmeti){
		if(predmet==null)
			throw new RuntimeException("Predmet ne sme biti null!");
		
		if (predmeti.contains(predmet))
			throw new RuntimeException("Predmet vec postoji!");
		
		predmeti.add(predmet);
	}
}
