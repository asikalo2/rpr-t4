package ba.unsa.etf.rpr.tutorijal04;

import java.util.List;

public class PlanStudija {

	private String ime;
	private List<Semestar> semestri;
	private List<Predmet> obavezniPredmeti;
	private List<Predmet> izborniPredmeti;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

}