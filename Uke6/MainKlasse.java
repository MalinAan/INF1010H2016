/**
 * Created by malinaandahl on 23.02.16.
 */
public class MainKlasse {

    public static void main(String[] args) {

        FIFOListe<Person> liste = new FIFOListe<Person>();

        Person p1 = new Person("Rune");
        Person p2 = new Person("Even");
        Person p3 = new Person("Mathias");
        Person p4 = new Person("Lisa");
        Person p5 = new Person("Jarand");

        System.out.println("Er lista tom " + liste.erTom());
        liste.leggTil(p1);
		System.out.println("Er lista tom " + liste.erTom());        
		System.out.println("Inneholder listen p1 " + liste.inneholder(p1));
		liste.fjern(p1);
		System.out.println("Inneholder listen p1 " + liste.inneholder(p1));
		System.out.println("Er lista tom " + liste.erTom());
		liste.leggTil(p2);
		liste.leggTil(p3);
		liste.leggTil(p4);
		System.out.println("Er lista tom " + liste.erTom());
		System.out.println("Storrelse " + liste.storrelse());
		liste.fjern(p3);
		System.out.println("Storrelse " + liste.storrelse());


		for(Person p: liste){
			System.out.println(p);
		}

    }
}
