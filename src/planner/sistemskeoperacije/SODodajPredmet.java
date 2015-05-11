package planner.sistemskeoperacije;

import java.util.LinkedList;

import planner.Predmet;

public class SODodajPredmet {

	public static void dodajPredmet(Predmet predmet, LinkedList<Predmet> predmeti){
		
		if (predmeti.contains(predmet))
			throw new RuntimeException("Predmet vec postoji!");
		
		predmeti.add(predmet);
	}
}
