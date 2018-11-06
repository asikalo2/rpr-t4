package ba.unsa.etf.rpr.tutorijal04;

public class Student {

	private String ime;
	private String prezime;
	private int brojIndexa;

	public Student(String n,String p,int br){
		ime=n;
		prezime=p;
		brojIndexa=br;
	}

	public Student(){
		ime="Niko";
		prezime="Nikic";
		brindeksa=0;
	}

	public String toString(){

		return getPrezime()+" "+getIme()+" ("+getBrindeksa()+")";
	}

	public int getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

}