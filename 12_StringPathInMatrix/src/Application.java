import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
//        int rows = 0;
//        int cols = 0;
//        char[] matrix = {};
//        int pathLen = 0;


//        int rows = 3;
//        int cols = 4;
//        int pathLen = 0;
//        char[] matrix = {'a', 'b', 't', 'g', 'c', 'f', 'c', 's', 'j', 'd', 'e', 'h'};
//        char[] str = {'b', 'f', 'c', 'e'};

        int rows = 3;
        int cols = 3;
        int pathLen = 0;
        char[] matrix = {'a', 'b', 'e', 'h', 'e', 'h', 'i', 'o', 'p'};
        char[] str = {'a', 'b', 'e', 'h', 'i', 'o', 'p', 'h', 'e'};

        StringPathInMatrixDemo demo = new StringPathInMatrixDemo();
        boolean[] visited = new boolean[rows * cols];
        Arrays.fill(visited, false);


        if (matrix.length == 0 || str.length == 0) {
            System.out.println("Error: invalid input.");
            return;
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (demo.isHasPath(matrix, rows, cols, row, col, str, pathLen, visited)) {
                    System.out.println("String path is in matrix.");
                    return;
                }
            }
        }
        System.out.println("String path is not in matrix.");


    }
}
