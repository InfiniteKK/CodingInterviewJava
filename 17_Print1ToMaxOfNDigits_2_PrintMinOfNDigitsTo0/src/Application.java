public class Application {
    public static void main(String[] args) {
//        int n = 0;
        int n = 2;

        if (n <= 0){
            System.out.println("Error: invalid input.");
            return;
        }
        PrintMinOfNDigitsTo0Demo demo = new PrintMinOfNDigitsTo0Demo();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append('9');
        }

        // solution 1
//        System.out.println("-" + stringBuilder);
//        while (!demo.printNumber(stringBuilder)) {
//            demo.print(stringBuilder);
//        }
//        System.out.println("0");

        // solution 2 recursively
        for (int i = 9; i >= 0; i--) {
            stringBuilder.setCharAt(0, (char) (i + '0'));
            demo.printNumberRecursively(stringBuilder,0);
        }
        System.out.println("0");


    }
}
