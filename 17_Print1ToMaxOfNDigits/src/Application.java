public class Application {
    public static void main(String[] args) {
//        int n = 0;
        int n = 2;
        if (n <= 0) {
            System.out.println("Error: invalid input.");
            return;
        }
        Print1ToMaxOfNDigitsDemo demo = new Print1ToMaxOfNDigitsDemo();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append('0');
        }

        // solution 1
//        while (!demo.printNumber(stringBuilder)){
//            demo.print(stringBuilder);
//        }

        //solution 2 recursively
        for (int i = 0; i < 10; i++) {
            stringBuilder.setCharAt(0, (char) (i + '0'));
            demo.printNumberRecursively(stringBuilder, 0);
        }

    }
}
