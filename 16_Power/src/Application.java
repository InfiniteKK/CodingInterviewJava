import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
//        double base = 0;
//        int exponent = -1;
       double base = 2;
       int exponent = 3;
       PowerDemo demo = new PowerDemo();
       System.out.println(demo.power(base,exponent));
       if(demo.isInvalidInput){
           System.out.println("Error: invalid input.");
       }

    }
}
