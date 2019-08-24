public class Application {
    public static void main(String[] args) {
//        int n = 0;
//        int n = 1;
//        int n = 2;
        int n = 9;
        FrogJumpDemo demo = new FrogJumpDemo();
        System.out.println(demo.frogJumpRecursion(n));
        System.out.println(demo.frogJumpNonRecursion(n));

    }
}
