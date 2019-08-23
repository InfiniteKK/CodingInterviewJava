public class Application {
    public static double fibonacci(int n) {
        int[] result = {0, 1};
        if (n < 2) {
            if (n < 0) {
                System.out.println("Error: invalid input.");
            } else {
                return result[n];
            }
        }
        double fibFirstNumber = 0;
        double fibSecondNumber = 1;
        double fibSum = 0;
        for (int i = 2; i <= n; i++) {
            fibSum = fibFirstNumber + fibSecondNumber;
            fibFirstNumber = fibSecondNumber;
            fibSecondNumber = fibSum;
        }
        return fibSum;
    }

    public static void main(String[] args) {
//        int n = -1;
//        int n = 1;
//        int n = 2;
//        int n = 3;
        int n = 9;
        System.out.println(fibonacci(n));
    }
}
