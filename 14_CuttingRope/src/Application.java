public class Application {
    public static void main(String[] args) {
//        int length = 0;
//        int length = 5;
        int length = 8;
        MaxProductAfterCuttingDemo demo = new MaxProductAfterCuttingDemo();
        System.out.println("Maximum product is "+demo.solutionDynamicProgramming(length)+".(Dynamic programming)");
        System.out.println("Maximum product is "+demo.solutionGreedyAlgorithm(length)+".(Greedy algorithm)");
    }
}
