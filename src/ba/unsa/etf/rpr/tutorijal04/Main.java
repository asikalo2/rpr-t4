package ba.unsa.etf.rpr.tutorijal04;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student("Amila", "Sikalo", 17973);
        Student s2 = new Student("Amila1", "Sikalo1", 17974);
        Predmet rpr = new Predmet("Razvoj programskih rjesenja", "RPR", 20, 15);
        Predmet sis = new Predmet("Signali i sistemi", "SIS", 20, 15);

        rpr.upisi(s1);
        System.out.println(rpr.getUpisaniStudenti());

        rpr.upisi(s2);
        System.out.println(rpr.getUpisaniStudenti());

        rpr.ispisi(s2);
        System.out.println(rpr.getUpisaniStudenti());

        Semestar petiSemestar = new Semestar(5);
        petiSemestar.dodajPredmet(rpr);
        petiSemestar.dodajPredmet(sis);

        BachelorStudij aie = new BachelorStudij("aie-bsc");
        aie.dodajIzborniPredmet(rpr);
        aie.dodajObavezniPredmet(sis);

        aie.dodajSemestar(petiSemestar);
    }
}
