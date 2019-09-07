public class Application {
    public static void main(String[] args) {
        int m = 10;
        int n = 13;
        ChangeNumberDemo demo = new ChangeNumberDemo();
        System.out.println("The sum of number need to be changed is " + demo.numberOf1(m ^ n) + ".");
    }

}
