package menjacnica.interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(double prodajni,double kupovni,GregorianCalendar dan,String naziv,String skraceniNaziv);
	public void brisanjeKursa(GregorianCalendar dan,String naziv);
	public void pronadjiKursNaDan(GregorianCalendar dan,String naziv);
}
