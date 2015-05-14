package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;
/**
 * 
 * @author Tatjana
 *
 */
public class SOIzracunajProsek {
	/**
	 *Sistemska operacija koja racuna prosek ocena jednog studenta. 
	 * 
	 * @param predmeti lista predmeta.
	 * @return prosek ocena jednog studenta.
	 */
	public static double izracunajProsek(LinkedList<Predmet> predmeti){
		int broj = 0;
		double zbir = 0;
		for (int i = 0; i < predmeti.size(); i++) {
			zbir+=predmeti.get(i).getOcena();
			broj++;
		}
		if(broj!=0)
			return zbir/broj;
		else return 0;
	}
}
