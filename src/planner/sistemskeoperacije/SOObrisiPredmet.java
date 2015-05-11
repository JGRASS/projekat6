package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;

public class SOObrisiPredmet {

	public static void ObrisiPredmet(Predmet predmet, LinkedList<Predmet> predmeti){
		if (!predmeti.contains(predmet))
			throw new RuntimeException("Predmet ne postoji!");
		
		predmeti.remove(predmet);
	}
}
