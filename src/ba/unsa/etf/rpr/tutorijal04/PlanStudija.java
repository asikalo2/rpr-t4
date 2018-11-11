package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class PlanStudija {

	private String ime;
	private ArrayList<Semestar> semestri;
	private ArrayList<Predmet> obavezniPredmeti;
	private ArrayList<Predmet> izborniPredmeti;

	PlanStudija(String ime) {
	    this.ime = ime;
	    this.semestri = new ArrayList<Semestar>();
	    this.obavezniPredmeti = new ArrayList<Predmet>();
        this.izborniPredmeti = new ArrayList<Predmet>();
    }

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void dodajSemestar(Semestar semestar) {
	    this.semestri.add(semestar);
    }

    public void dodajObavezniPredmet(Predmet predmet){
	    this.obavezniPredmeti.add(predmet);
    }

    public void dodajIzborniPredmet(Predmet predmet) {
	    this.izborniPredmeti.add(predmet);
    }

}