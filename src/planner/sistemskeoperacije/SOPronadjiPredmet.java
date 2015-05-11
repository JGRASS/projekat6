package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;

public class SOPronadjiPredmet {

	public static Predmet pronadjiPredmet(String naziv, LinkedList<Predmet> predmeti) {
		
		for(int i = 0; i<predmeti.size(); i++){
			if(predmeti.get(i).getNaziv().equals(naziv))
				return predmeti.get(i);
		}
		return null;
			
	}
}
