package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Semestar {

	private int brojSemestra;
	private ArrayList<Predmet> listaPredmeta;

    Semestar(int brojSemestra) {
        this.listaPredmeta = new ArrayList<Predmet>();
    }

    public void dodajPredmet(Predmet predmet) {
        listaPredmeta.add(predmet);
        System.out.println("Predmet uspjesno dodan!");
    }

	public void studentiNaSemestru() {
		// TODO - implement Semestar.studentiNaSemestru
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param student
	 */
	public void provjeriECTS(Student student) {
		// TODO - implement Semestar.provjeriECTS
		throw new UnsupportedOperationException();
	}

	public int getBrojSemestra() {
		return brojSemestra;
	}

	public void setBrojSemestra(int brojSemestra) {
		this.brojSemestra = brojSemestra;
	}



}