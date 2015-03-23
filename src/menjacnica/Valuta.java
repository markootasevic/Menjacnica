package menjacnica;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double kupovniKurs;
	private double srednjiKurs; // ovaj kurs se ne unosi vec se racuna na osnovu
								// kupovnog i prodajnog
	private double prodajniKurs;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv.length() == 0 || naziv.equals(null))
			throw new RuntimeException("Nije unet naziv");
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv.length() != 3)
			throw new RuntimeException(
					"Skraceni naziv nije pravilno unet(mora da sadrzi 3 slova)");
		this.skraceniNaziv = skraceniNaziv;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		GregorianCalendar danas = new GregorianCalendar();
		if (danas.get(Calendar.YEAR) == datum.get(Calendar.YEAR)
				&& danas.get(Calendar.DAY_OF_YEAR) == datum
						.get(Calendar.DAY_OF_YEAR))
			throw new RuntimeException(
					"Nije moguce uneti kurs za dan koji je u buducnosti ili u proslosti,vec se mora uneti na dati dan");
		this.datum = datum;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs <= 0)
			throw new RuntimeException("Nije odgovarajuci kurs");
		this.kupovniKurs = kupovniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs <= 0)
			throw new RuntimeException("Nije odgovarajuci kurs");
		this.srednjiKurs = srednjiKurs;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs <= 0)
			throw new RuntimeException("Nije odgovarajuci kurs");
		this.prodajniKurs = prodajniKurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { // poredi samo datum i skraceni ili
										// pravi naziv jer je nebitan kurs kada
										// trazimo neku valutu na odredjen dan
		if (!(obj instanceof Valuta))
			return false;

		Valuta valuta = (Valuta) obj;
		GregorianCalendar valutaDan = valuta.getDatum();
		GregorianCalendar danas = new GregorianCalendar();
		if (danas.get(Calendar.YEAR) == valutaDan.get(Calendar.YEAR)
				&& danas.get(Calendar.DAY_OF_YEAR) == valutaDan
						.get(Calendar.DAY_OF_YEAR)
				&& (valuta.getNaziv().equals(naziv) || valuta
						.getSkraceniNaziv().equals(skraceniNaziv)))
			return true;

		return false;

	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv
				+ ", datum=" + datum + ", kupovniKurs=" + kupovniKurs
				+ ", srednjiKurs=" + srednjiKurs + ", prodajniKurs="
				+ prodajniKurs + "]";
	}

}
