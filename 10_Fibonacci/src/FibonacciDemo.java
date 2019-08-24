public class FibonacciDemo {
    public double fibonacci(int n) {
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
}
