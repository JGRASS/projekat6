package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;
/**
 * 
 * @author Tatjana
 *
 */
public class SOObrisiPredmet {
	/**
	 * Sistemska operacija za brisanje predmeta iz liste predmeta.
	 * 
	 * @param predmet predmet koji se brise.
	 * @param predmeti lista svih predmeta jednog studenta.
	 */
	public static void ObrisiPredmet(Predmet predmet, LinkedList<Predmet> predmeti){
		if (!predmeti.contains(predmet))
			throw new RuntimeException("Predmet ne postoji!");
		
		predmeti.remove(predmet);
	}
}
