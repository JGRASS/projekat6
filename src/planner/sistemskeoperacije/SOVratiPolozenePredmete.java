package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;

public class SOVratiPolozenePredmete {

	public static LinkedList<Predmet> vratiPolozenePredmete(LinkedList<Predmet> predmeti){
		LinkedList<Predmet> p = new LinkedList<Predmet>();
		
		for(int i = 0; i<predmeti.size(); i++){
			if(predmeti.get(i).isPolozen())
				p.add(predmeti.get(i));
		}
		return p;
	}
}
