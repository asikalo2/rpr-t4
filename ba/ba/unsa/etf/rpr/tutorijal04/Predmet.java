package ba.unsa.etf.rpr.tutorijal04;

import java.util.List;

public class Predmet {

	private String ime;
	private String sifra;
	private List<ba.unsa.etf.rpr.tutorijal04.Student> upisaniStudenti;
	private int maxbrstudenata=0;
	private int brojStudenata=0;

	/**
	 *
	 */


	public int getBrojStudenata() {

		return brojStudenata;
	}

	/*public void upisiStudenta(Student student) {
		// TODO - implement Predmet.upisiStudenta
		throw new UnsupportedOperationException();
	}*/

	public List<ba.unsa.etf.rpr.tutorijal04.Student> getUpisaniStudenti() {
		return upisaniStudenti;

	}
	public String getIme() {
		return ime;
	}

	public String getSifra() {
		return sifra;
	}

	public void setUpisaniStudenti(List<ba.unsa.etf.rpr.tutorijal04.Student> upisaniStudenti) {
		this.upisaniStudenti = upisaniStudenti;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public void upisi(ba.unsa.etf.rpr.tutorijal04.Student s){
		if(brojStudenata<maxbrstudenata) {
			upisaniStudenti.add(new ba.unsa.etf.rpr.tutorijal04.Student("Amila","Sikalo",17973));
			System.out.println("Student je uspjesno upisan");
		}
		else{
			System.out.println("Predmet je popunjen, nemoguce upisati studenta");
			}
		}

	/*public void ispisi(Student s){
			if(brojStudenata>0) {
				boolean ima = false;
				for (int i = 0; i < brojStudenata; i++) {
					if (getSifra() == s.getBrojIndexa()) {
						upisaniStudenti.remove();
						ima = true;
						break;
					}
				}
				if (!ima)
					System.out.println("Student nije upisan na predmet, nemoguce ispisati studenta");
				else
					System.out.println("Student je uspjesno ispisan");
			}
			else
				System.out.println("Predmet nema upisanih studenata");
		}
*/

		public int getMaxbrstudenata() {

		return maxbrstudenata;
		}






}