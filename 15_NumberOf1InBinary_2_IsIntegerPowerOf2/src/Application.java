public class Application {
    public static void main(String[] args) {
//        int n = -6;
//        int n = 0;
//        int n = 3;
        int n = 8;
        IsIntegerPowerOf2Demo demo = new IsIntegerPowerOf2Demo();
        if (demo.isIntegerPowerOf2(n)) {
            System.out.println("Number " + n + " is integer power of 2.");
        }else{
            System.out.println("Number " + n + " is not integer power of 2.");
        }

    }
}
