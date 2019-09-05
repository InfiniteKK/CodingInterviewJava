public class Application {
    public static void main(String[] args) {
//        int n = 0;
        int n = 9;

        int count = 0;
        int m = n;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        System.out.println("The number of 1 in " + m + "(Binary) is " + count + ".");

    }
}
