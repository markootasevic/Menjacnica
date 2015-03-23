package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	public LinkedList<Valuta> valuta = new LinkedList<Valuta>();
	@Override
	public void dodajKurs(double prodajni, double kupovni,
			GregorianCalendar dan, String naziv, String skraceniNaziv) {
		Valuta v1 = new Valuta();
		v1.setDatum(dan);
		v1.setKupovniKurs(kupovni);
		v1.setNaziv(naziv);
		v1.setProdajniKurs(prodajni);
		v1.setSkraceniNaziv(skraceniNaziv);
		v1.setSrednjiKurs((kupovni + prodajni) / 2);
		valuta.add(v1);
		
	}

	@Override
	public void brisanjeKursa(GregorianCalendar dan, String naziv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pronadjiKursNaDan(GregorianCalendar dan, String naziv) {
		// TODO Auto-generated method stub
		
	}

	

}
