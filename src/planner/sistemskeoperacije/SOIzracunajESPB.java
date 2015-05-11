package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;

public class SOIzracunajESPB {

	
	public static int izracunajESPB(LinkedList<Predmet> predmeti){
		int rez =0;
		for (int i = 0; i < predmeti.size(); i++) {
			rez+=predmeti.get(i).getESPB();
		}
		return rez;
		
	}
}
