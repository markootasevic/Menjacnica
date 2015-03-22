package menjacnica.interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(double prodajni,double kupovni);
	public void brisanjeKursa(GregorianCalendar dan);
	public void pronadjiKursNaDan(GregorianCalendar dan);
}
