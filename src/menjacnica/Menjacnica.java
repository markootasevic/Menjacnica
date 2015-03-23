package menjacnica;

import java.util.GregorianCalendar;

import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	public LinkedList<Valuta> valuta = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(double prodajni, double kupovni,
			GregorianCalendar dan, String naziv, String skraceniNaziv) {
		Valuta v = new Valuta();
		v.setDatum(dan);
		v.setKupovniKurs(kupovni);
		v.setProdajniKurs(prodajni);
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		v.setSrednjiKurs((prodajni + kupovni) / 2);
		valuta.add(v);

	}

	@Override
	public void brisanjeKursa(GregorianCalendar dan, String naziv) {

		Valuta v = new Valuta();
		v.setDatum(dan);
		v.setNaziv(naziv);
		for (int i = 0; i < valuta.size(); i++) {
			if (valuta.get(i).equals(v))
				valuta.remove(i);
		}

	}

	@Override
	public void pronadjiKursNaDan(GregorianCalendar dan, String naziv) {

		Valuta v = new Valuta();
		v.setDatum(dan);
		v.setNaziv(naziv);
		for (int i = 0; i < valuta.size(); i++) {
			if (valuta.get(i).equals(v))
				System.out.println(valuta.get(i));
		}

	}

}
