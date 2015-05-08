package planner;

import java.util.GregorianCalendar;


public class Predmet {
	
	private String naziv;
	private int ESPB;
	private double ocena;
	private boolean polozen;
	private GregorianCalendar datumIspita;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getESPB() {
		return ESPB;
	}
	public void setESPB(int eSPB) {
		if(eSPB <4 || eSPB>10)
			throw new RuntimeException("Broj ESPB bodova mora biti izmedju 4 i 10.");
		ESPB = eSPB;
	}
	public double getOcena() {
		return ocena;
	}
	public void setOcena(double ocena) {
		if(ocena <5 || ocena>10)
			throw new RuntimeException("Ocena mora biti izmedju 5 i 10.");
		this.ocena = ocena;
	}
	public boolean isPolozen() {
		return polozen;
	}
	public void setPolozen(boolean polozen) {
		this.polozen = polozen;
	}
	public GregorianCalendar getDatumIspita() {
		return datumIspita;
	}
	public void setDatumIspita(GregorianCalendar datumIspita) {
		GregorianCalendar danasnjiDan = new GregorianCalendar(GregorianCalendar.YEAR, GregorianCalendar.MONTH, GregorianCalendar.DAY_OF_MONTH);;
		if(datumIspita.before(danasnjiDan))
				throw new RuntimeException("Datum ne sme biti u proslosti.");
		this.datumIspita = datumIspita;
	}
	

}
