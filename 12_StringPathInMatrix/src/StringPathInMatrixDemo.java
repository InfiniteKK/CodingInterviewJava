public class StringPathInMatrixDemo {
    public boolean isHasPath(char[] matrix, int rows, int cols, int row, int col, char[] str, int pathLen, boolean[] visited) {
        boolean hasPath;
        int index = row * cols + col;
        if (row < 0 || row >= rows || col < 0 || col >= cols || matrix[index] != str[pathLen] || visited[index]) {
            return false;
        }
        if(pathLen == str.length - 1){
            return true;
        }
        pathLen++;
        visited[index] = true;
        hasPath = isHasPath(matrix, rows, cols, row - 1, col, str, pathLen, visited)
                || isHasPath(matrix, rows, cols, row, col + 1, str, pathLen, visited)
                || isHasPath(matrix, rows, cols, row + 1, col, str, pathLen, visited)
                || isHasPath(matrix, rows, cols, row, col - 1, str, pathLen, visited);
        if (hasPath) {
            return true;
        } else {
            pathLen--;
            visited[index] = false;
            return false;
        }

    }
}
