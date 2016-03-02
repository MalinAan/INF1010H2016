/**
 * Created by malinaandahl on 23.02.16.
 */
public class Person implements Comparable<Person> {

    private String navn;
    private int alder;

    Person(String navn){
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn;
    }

    public int compareTo(Person p){

        return navn.compareTo(p.navn);
    }

}
