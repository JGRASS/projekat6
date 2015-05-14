package planner.interfejs;

import java.util.LinkedList;

import planner.Predmet;
/**
 * 
 * @author Tatjana
 *
 */
public interface PlannerInterfejs {
	/**
	 * Metoda bez tela, samo zaglavlje, dodaje novi predmet koji je unet kao parametar.
	 * 
	 * @param predmet predmet koji se dodaje.
	 */
	public void dodajPredmet(Predmet predmet);
	
	/**
	 * Metoda bez tela, samo zaglavlje, brise predmet koji je unet kao parametar.
	 * 
	 * @param predmet predmet koji se brise.
	 */
	public void ObrisiPredmet(Predmet predmet);
	
	/**
	 * Metoda bez tela, samo zaglavlje, pronalazi predmet ciji naziv je unet kao parametar.
	 * 
	 * @param naziv naziv predmeta koji se pronalazi.
	 * 
	 * @return predmet koji je pronadjen pod nazivom koji je unet kao parametar.
	 */
	public Predmet pronadjiPredmet(String naziv);
	
	/**
	 * Lista svih predmeta koje je student polozio, metoda bez tela.
	 * 
	 * @return lista svih predmeta jednog studenta.
	 */
	public LinkedList<Predmet> vratiSvePredmete();
	
	/**
	 * Lista svih predmeta koje je student polozio, metoda bez tela.
	 * 
	 * @return lista svih polozenih predmeta jednog studenta.
	 */
	public LinkedList<Predmet> vratiPolozenePredmete();
	public LinkedList<Predmet> vratiAktuelnePredmete();
	
	/**
	 * Metoda bez tela, samo zaglavlje, racuna prosek ocena jednog studenta, pozivajuci sistemsku operaciju za izracunavanje proseka.
	 * 
	 * @return prosek ocena jednog studenta.
	 */
	public double izracunajProsek();
	
	/**
	 * Metoda racuna ukupan broj ESPB bodova jednog studenta, pozivajuci sistemsku operaciju za izracunavanje proseka, metoda bez tela.
	 * 
	 * @return ukupan broj ESPB bodova jednog studenta.
	 */
	public int izracunajESPB();
	
	/**
	 * Metoda ucitava iz fajla putanju koja je uneta kao parametar, metoda bez tela.
	 * 
	 * @param putanja 
	 */
	public void ucitajIzFajla(String putanja);
	
	/**
	 * Metoda cuva u fajl putanju koja je uneta kao parametar, metoda bez tela.
	 * 
	 * @param putanja 
	 */
	public void sacuvajUFajl(String putanja);
	
}
