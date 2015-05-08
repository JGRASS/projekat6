package planner;

/**
 * @author Tatjana
 *
 */
public class Student {
	
	/**
	 * Ime studenta.
	 */
	private String ime;
	/**
	 * Prezime studenta.
	 */
	private String prezime;
	/**
	 * Broj indeksa koji je tipa String.
	 */
	private String brIndexa;
	
	/**
	 * Metoda vraca vrednost atributa ime, ime studenta.
	 * 
	 * @return ime studenta kao String.
	 */
	public String getIme() {
		return ime;
	}
	
	/**
	 * Metoda postavlja ime studenta na zadatu vrednost iz parametra.
	 * 
	 * @param ime novog studenta.
	 * 
	 * @throws java.lang.RuntimeException ako je uneta vrenost null ili prazan String.
	 * 
	 */
	public void setIme(String ime) {
		if(ime==null)
			throw new RuntimeException("Ime ne sme biti null.");
		this.ime = ime;
	}
	
	/**
	 * Metoda vraca vrednost atributa prezime, prezime studenta.
	 * 
	 * @return prezime studenta kao String.
	 */
	public String getPrezime() {
		return prezime;
	}
	
	/**
	 * Metoda postavlja prezime studenta na zadatu vrednost iz parametra.
	 * 
	 * @param prezime novog studenta.
	 * 
	 * @throws java.lang.RuntimeException ako je unet vrenost null ili prazan String.
	 * 
	 */
	public void setPrezime(String prezime) {
		if(prezime==null)
			throw new RuntimeException("Prezime ne sme biti null.");
		this.prezime = prezime;
	}
	
	/**
	 * Metoda vraca vrednost atributa brIndeksa, broj indeksa studenta.
	 * 
	 * @return broj indeksa studenta kao String.
	 */
	public String getBrIndexa() {
		return brIndexa;
	}
	
	/**
	 * Metoda postavlja broj indeksa na zadatu vrednost iz parametra.
	 * 
	 * @param broj indeksa novog studenta.
	 * 
	 * @throws java.lang.RuntimeException ako je unet vrenost null ili prazan String.
	 * 
	 */
	public void setBrIndexa(String brIndexa) {
		if(brIndexa==null)
				throw new RuntimeException("Broj indeksa ne sme biti null.");
		this.brIndexa = brIndexa;
	}

}
