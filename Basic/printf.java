package Basic;


public class printf {
    public static void main(String[] args) {
        double myDouble = 20000.0000;

        // System.out.printf("Number is %,f", myDouble);  //Number is 20,000.000000
        // System.out.printf("Number is %20f", myDouble);   //Number is         20000.000000
        // System.out.printf("Number is %-20f", myDouble);   //Number is 20000.000000
        // System.out.printf("Number is %+f", myDouble);  //Number is +20000.000000
        System.out.printf("Number is %+020f", myDouble);  //Number is +000000020000.000000
        
    }
}
