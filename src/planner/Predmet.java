package planner;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * 
 * @author Tatjana
 *
 */
public class Predmet implements Serializable {
	
	

	/**
	 * Naziv predmeta.
	 * 
	 */
	private String naziv;
	
	/**
	 * broj ESPB bodova koji nosi odredjeni predmet.
	 */
	private int ESPB;
	
	/**
	 * redni broj semestra kome primada predmet.
	 */
	private int semestar;
	

	/**
	 * Ocena koju je student dobio iz odredjenog predmet.
	 */
	private int ocena;
	
	/**
	 * Da li je predmet polozen ili ne, kao boolean.
	 */
	private boolean polozen;
	
	/**
	 * Datum kada se polaze ispit iz odredjenog predmeta.
	 */
	private GregorianCalendar datumIspita;
	
	/**
	 * 
	 * Metoda vraca vrednost atributa naziv, naziv predmeta.
	 * 
	 * @return naziv predmeta kao String.
	 */
	public String getNaziv() {
		return naziv;
	}
	
	/**
	 * Metoda postavlja naziv predmeta na zadatu vrednost iz parametra.
	 * 
	 * @param naziv novog predmeta.
	 * 
	 */
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.equals(""))
			throw new RuntimeException("Naziv ne sme biti null ili prazan String");
		this.naziv = naziv;
	}
	
	/**
	 * 
	 * Metoda vraca vrednost atributa ESPB, broj ESPB bodova koje nosi odredjeni predmet.
	 * 
	 * @return broj ESPB bodova koje nosi predmet.
	 */
	public int getESPB() {
		return ESPB;
	}
	
	/**
	 * Metoda postavlja ESPB bodove na zadatu vrednost iz parametra.
	 * 
	 * @param nove ESPB bodove za predmet.
	 * 
	 * @throws java.lang.RuntimeException ako je uneta vrenost manja od 4 ili veca od 10.
	 * 
	 */
	public void setESPB(int eSPB) {
		if(eSPB <4 || eSPB>10)
			throw new RuntimeException("Broj ESPB bodova mora biti izmedju 4 i 10.");
		ESPB = eSPB;
	}
	
	/**
	 * Metoda vraca vrednost atributa semestar.
	 * @return redni broj semestra kome pripada predmet
	 */
	public int getSemestar() {
		return semestar;
	}
	
	/**
	 * Metoda postavlja redni broj semestra na zadatu vrednost iz parametra.
	 * @throws java.lang.RuntimeException ako je uneta vrenost manja od 1 ili veca od 8.
	 * @param semestar kome pripada predmet
	 */
	public void setSemestar(int semestar) {
		if(semestar <1 || semestar>8)
			throw new RuntimeException("Broj ESPB bodova mora biti izmedju 1 i 8.");
		this.semestar = semestar;
	}
	
	/**
	 * 
	 * Metoda vraca vrednost atributa ocena, ocena koju je student dobio iz tog predmeta.
	 * 
	 * @return ocena koju je student dobio.
	 */
	public int getOcena() {
		return ocena;
	}
	
	/**
	 * Metoda postavlja ocenu iz nekog predmeta na zadatu vrednost iz parametra.
	 * 
	 * @param nova ocena iz predmeta.
	 * 
	 * @throws java.lang.RuntimeException ako je uneta vrenost manja od 5 ili veca od 10.
	 * 
	 */
	public void setOcena(int ocena) {
		if(ocena <5 || ocena>10)
			throw new RuntimeException("Ocena mora biti izmedju 5 i 10.");
		this.ocena = ocena;
	}
	public boolean isPolozen() {
		return polozen;
	}
	
	/**
	 * Metoda postavlja vrednost atribut polozen ispit na zadatu vrednost iz parametra.
	 * 
	 * @param da li je predmet polozen ili ne.
	 *  
	 */
	public void setPolozen(boolean polozen) {
		this.polozen = polozen;
	}
	
	/**
	 * 
	 * Metoda vraca vrednost atributa datumIspita, datum polaganja ispita.
	 * 
	 * @return datum polaganja ispita.
	 */
	public GregorianCalendar getDatumIspita() {
		return datumIspita;
	}
	
	/**
	 * Metoda postavlja datum polaganja ispita iz odredjenog predmeta na zadatu vrednost iz parametra.
	 * 
	 * @param datum polaganja ispita iz odredjenog predmeta.
	 * 
	 * @throws java.lang.RuntimeException ako je uneta vrednost null ili datum u proslosti.
	 * 
	 */
	public void setDatumIspita(GregorianCalendar datumIspita) {
		if(datumIspita==null || datumIspita.before(new GregorianCalendar()))
				throw new RuntimeException("Datum ne sme biti null ili trenutak u proslosti.");
		this.datumIspita = datumIspita;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Predmet other = (Predmet) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Predmet [naziv=" + naziv + ", ESPB=" + ESPB + ", semestar="
				+ semestar + ", ocena=" + ocena + ", polozen=" + polozen
				+ ", datumIspita=" + datumIspita + "]";
	}
	
	
	

}
