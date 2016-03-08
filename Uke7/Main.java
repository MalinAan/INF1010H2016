public class Main{
    public static void main(String[] args) {
        ToObjekter<Integer> toTall = new ToObjekter<Integer>(20, 40);
        double sum = leggSammen(toTall);
        System.out.println(sum);

        //For aa ikke gjore metoder static
        Main mainen = new Main();
        mainen.printUt();


        //IFI-student programmet.
        IFIStudent student = new IFIStudent("Lisa");
        student.leggTilSpraak(new C());
        student.leggTilSpraak(new Python());
        student.leggTilSpraak(new Scheme());
        student.skrivUtSpraak();

    }

    public void printUt(){
        System.out.println("Hei");
    }

    //Fungerer ikke:
    /*public double leggSammen(ToObjekter<Number> toTall){

    }*/

    public static double leggSammen(ToObjekter<? extends Number> toTall){
        return toTall.returnerForste().doubleValue() + toTall.returnerAndre().doubleValue();
    }


}