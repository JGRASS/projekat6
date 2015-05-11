package planner.sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import planner.Predmet;

public class SOUcitajIzFajla {

	public static void ucitajIzFajla(String putanja, LinkedList<Predmet> predmeti){
		
		try{
			ObjectInputStream in = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(putanja)));
			
			
			LinkedList<Predmet> p = (LinkedList<Predmet>)(in.readObject());
			predmeti.clear();
			predmeti.addAll(p);
			
			in.close();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
}
	

