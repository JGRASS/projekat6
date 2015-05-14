package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;
/**
 * 
 * @author Tatjana
 *
 */
public class SOIzracunajESPB {

	/**
	 * Sistemska operacija koja izracunava ukupan broj ESPB bodova jednog studenta.
	 * 
	 * @param predmeti lista svih predmeta jednog studenta.
	 * @return broj ESPB bodova jednog studenta.
	 */
	public static int izracunajESPB(LinkedList<Predmet> predmeti){
		int rez =0;
		for (int i = 0; i < predmeti.size(); i++) {
			rez+=predmeti.get(i).getESPB();
		}
		return rez;
		
	}
}
