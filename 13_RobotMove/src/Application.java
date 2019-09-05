import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
//        int rows = 0;
//        int cols = 6;
//        int threshold = 5;

        int rows = 2;
        int cols = 6;
        int threshold = 5;


        if(threshold < 0 || rows <=0 || cols <=0){
            System.out.println("Error: invalid input.");
            return;
        }
        boolean[] visited = new boolean[rows*cols];
        Arrays.fill(visited,false);
        MovingRobotDemo demo = new MovingRobotDemo();
        System.out.println("Robot can reach "+demo.movingRobot(threshold,rows,cols,0,0,visited)+" point(s).");

    }
}
