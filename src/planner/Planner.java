package planner;

import java.util.LinkedList;

import planner.interfejs.PlannerInterfejs;
import planner.sistemskeoperacije.SODodajPredmet;
import planner.sistemskeoperacije.SOIzracunajESPB;
import planner.sistemskeoperacije.SOIzracunajProsek;
import planner.sistemskeoperacije.SOObrisiPredmet;
import planner.sistemskeoperacije.SOPronadjiPredmet;
import planner.sistemskeoperacije.SOSacuvajUFajl;
import planner.sistemskeoperacije.SOUcitajIzFajla;
import planner.sistemskeoperacije.SOVratiAktuelnePredmete;
import planner.sistemskeoperacije.SOVratiPolozenePredmete;

/**
 * 
 * @author Tatjana
 *
 */
public class Planner implements PlannerInterfejs{

	/**
	 *  Objekat klase Student, student za kog se pravi planer.
	 */
	private LinkedList<Predmet> predmeti = new LinkedList<Predmet>();
	
	/**
	 * Metoda dodaje novi predmmet u planer, tako sto poziva sistemsku operaciju za dodavanje predmeta.
	 */
	@Override
	public void dodajPredmet(Predmet predmet) {
		SODodajPredmet.dodajPredmet(predmet, predmeti);
		
	}

	/**
	 * Metoda brise predmmet, tako sto poziva sistemsku operaciju za brisanje predmeta.
	 */
	@Override
	public void ObrisiPredmet(Predmet predmet) {
		SOObrisiPredmet.ObrisiPredmet(predmet, predmeti);
		
	}

	/**
	 * 
	 * Metoda pronalazi predmet po nazivu predmeta koji je unet kao parametar, pozivajuci sistemsku operaciju za pronalazenje predmeta.
	 * 
	 * @return predmet koji je pronadjen pod nazivom koji je unet kao parametar.
	 */
	@Override
	public Predmet pronadjiPredmet(String naziv) {
		
		return SOPronadjiPredmet.pronadjiPredmet(naziv, predmeti);
	}

	/**
	 * Lista svih premeta koje je Student uneo.
	 * 
	 * @return lista svih premeta jednog studenta.
	 */
	@Override
	public LinkedList<Predmet> vratiSvePredmete() {
		return predmeti;
	}

	/**
	 * Lista svih predmeta koje je student polozio.
	 * 
	 * @return lista svih polozenih predmeta jednog studenta.
	 */
	@Override
	public LinkedList<Predmet> vratiPolozenePredmete() {
		
		return SOVratiPolozenePredmete.vratiPolozenePredmete(predmeti);
	}
	public LinkedList<Predmet> vratiAktuelnePredmete() {
		
		return SOVratiAktuelnePredmete.vratiAktuelnePredmete(predmeti);
	}

	/**
	 * Metoda racuna prosek ocena jednog studenta, pozivajuci sistemsku operaciju za izracunavanje proseka.
	 * 
	 * @return prosek ocena jednog studenta.
	 */
	@Override
	public double izracunajProsek() {
		return SOIzracunajProsek.izracunajProsek(predmeti);
	}
	
	/**
	 * Metoda racuna ukupan broj ESPB bodova jednog studenta, pozivajuci sistemsku operaciju za izracunavanje proseka.
	 * 
	 * @return ukupan broj ESPB bodova jednog studenta.
	 */
	@Override
	public int izracunajESPB() {
		return SOIzracunajESPB.izracunajESPB(predmeti);
		
	}
	
	/**
	 * Metoda ucitava iz fajla putanju koja je uneta kao parametar.
	 */
	@Override
	public void ucitajIzFajla(String putanja) {
		SOUcitajIzFajla.ucitajIzFajla(putanja, predmeti);
		
	}

	/**
	 * Metoda cuva u fajl putanju koja je uneta kao parametar.
	 */
	@Override
	public void sacuvajUFajl(String putanja) {
		SOSacuvajUFajl.sacuvajUFajl(putanja, predmeti);		
	}
	

	
}
