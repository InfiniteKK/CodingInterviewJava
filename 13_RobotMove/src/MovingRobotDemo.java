public class MovingRobotDemo {
    public int movingRobot(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
        int index = row * cols + col;
        int count = 0;

        if (check(threshold, rows, cols, row, col, visited)) {
            visited[index] = true;
            count = 1 + movingRobot(threshold, rows, cols, row - 1, col, visited)
                    + movingRobot(threshold, rows, cols, row, col + 1, visited)
                    + movingRobot(threshold, rows, cols, row + 1, col, visited)
                    + movingRobot(threshold, rows, cols, row, col - 1, visited);
        }
        return count;
    }

    private boolean check(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
        int index = row * cols + col;
        if (row >= 0 && row < rows && col >= 0 && col < cols && getDigitSum(row) + getDigitSum(col) <= threshold && !visited[index]){
            return true;
        }else {
            return false;
        }
    }

    private int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
