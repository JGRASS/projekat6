package planner;

public class Student {
	
	private String ime;
	private String prezime;
	private String brIndexa;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if(ime==null)
			throw new RuntimeException("Ime ne sme biti null.");
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		if(prezime==null)
			throw new RuntimeException("Prezime ne sme biti null.");
		this.prezime = prezime;
	}
	public String getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(String brIndexa) {
		if(brIndexa==null)
				throw new RuntimeException("Broj indeksa ne sme biti null.");
		this.brIndexa = brIndexa;
	}

}
