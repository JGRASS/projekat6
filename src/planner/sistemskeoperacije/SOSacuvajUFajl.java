package planner.sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import planner.Predmet;

public class SOSacuvajUFajl {

	public static void sacuvajUFajl(String putanja, LinkedList<Predmet> predmeti){
		try{
			ObjectOutputStream out = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(putanja)));
			
			out.writeObject(predmeti);
			
			out.close();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}
	
}
