public abstract class ProgSpraak implements Comparable<ProgSpraak>{
    protected int rank;

    public int compareTo(ProgSpraak spraak){
        return rank - spraak.rank;
    }

    public String toString(){
       return "Min rank er " + rank + " og klassen min er " + getClass().getName();
    }
}