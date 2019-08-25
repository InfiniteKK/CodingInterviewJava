public class RectangularCoveringDemo {
    public double rectangularCovering(int n) {
        if (n <= 0) {
            System.out.println("Error: invalid input.");
            return -1;
        }
        double firstNumber = 0;
        double secondNumber = 1;
        double sum = 0;
        for (int i = 0; i < n; i++){
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }

        return sum;
    }
}
