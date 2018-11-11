package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Predmet {

    private String ime;
    private String sifra;
    private ArrayList<Student> upisaniStudenti;
    private int maxbrstudenata = 0;
    private double ects;

    /**
     *
     */

    Predmet(String ime, String sifra, int maxbrstudenata, double ects) {
        this.ime = ime;
        this.sifra = sifra;
        this.upisaniStudenti = new ArrayList<Student>();
        this.maxbrstudenata = maxbrstudenata;
        this.ects = ects;
    }


    public int getBrojStudenata() {
        return upisaniStudenti.size();
    }

	/*public void upisiStudenta(Student student) {
		// TODO - implement Predmet.upisiStudenta
		throw new UnsupportedOperationException();
	}*/

    public ArrayList<Student> getUpisaniStudenti() {
        return upisaniStudenti;

    }

    public String getIme() {
        return ime;
    }

    public String getSifra() {
        return sifra;
    }

    public void setUpisaniStudenti(ArrayList<Student> upisaniStudenti) {
        this.upisaniStudenti = upisaniStudenti;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void upisi(Student s) {
        if (upisaniStudenti.size() < maxbrstudenata) {
            upisaniStudenti.add(s);
            System.out.println("Student je uspjesno upisan");
        } else {
            System.out.println("Predmet je popunjen, nemoguce upisati studenta");
        }
    }

	public void ispisi(Student s) {
        try {
            upisaniStudenti.remove(s);
            System.out.println("Student uspješno ispisan!");
        }
        catch (Exception e) {
            System.out.println("Student nije bio upisan!");
        }

    }


    public int getMaxbrstudenata() {

        return maxbrstudenata;
    }


    public double getEcts() {
        return ects;
    }

    public void setEcts(double ects) {
        this.ects = ects;
    }
}