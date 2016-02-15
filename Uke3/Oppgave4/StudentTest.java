public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        Roedvin nattverdsvin = new Roedvin("Natureo Free", 
                                            0.05, 2013, true);
        Flaske<AlkoholholdigDrikke> alkoholflaske = new Flaske<>(750);
        alkoholflaske.fyllMed(nattverdsvin);
        student.drikkAv(alkoholflaske);

        test(student.kanKjoere(), true, 
             "om studenten kan kjoere etter nattverdsvin");

        Hvitvin riesling = new Hvitvin("Riesling", 11.5, 2012, true);
        alkoholflaske.fyllMed(riesling);
        student.drikkAv(alkoholflaske);

        test(student.kanKjoere(), false, 
             "om studenten kan kjoere etter hvitvin");

        student.sovUtRusen();

        test(student.kanKjoere(), true, 
             "om studenten kan kjoere etter god natts soevn");
    }

    public static void test(boolean testKall, boolean expected, 
                            String message){
        if (testKall == expected){
            System.out.printf("Tester %s: %b   OK\n", 
                               message, expected);
        }
        else {
            System.out.printf(
                "Tester %s: Huff da...! Forventet %b, fikk %b\n", 
                message, expected, testKall);
        }
    }
}