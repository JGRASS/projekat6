package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;
/**
 * 
 * @author Tatjana
 *
 */
public class SOPronadjiPredmet {
	/**
	 * Sistemska operacija za pronalazenje predmeta koji je unet kao parametar.
	 * 
	 * @param naziv naziv predmeta koji se pronalazi.
	 * @param predmeti lista svi predmeta u kojoj se pronalazi predmet.
	 * @return predmet koji je pronadjen.
	 */
	public static Predmet pronadjiPredmet(String naziv, LinkedList<Predmet> predmeti) {
		
		for(int i = 0; i<predmeti.size(); i++){
			if(predmeti.get(i).getNaziv().equals(naziv))
				return predmeti.get(i);
		}
		return null;
			
	}
}
