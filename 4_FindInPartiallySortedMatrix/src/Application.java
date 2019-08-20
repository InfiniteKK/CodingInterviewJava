public class Application {
    public static boolean find(int[][] array, int number) {
        boolean found = false;
        if (array[0].length != 0) {
            int row = 0;
            int column = array[0].length - 1;
            while (row < array.length && column >= 0 && column <= array[0].length - 1){
                if(array[row][column] == number){
                    found = true;
                    break;
                }else if(array[row][column] > number){
                    column -= 1;
                }else {
                    row += 1;
                }
            }

        } else {
            System.out.println("Error: no element in array.");
        }
        return found;
    }

    public static void main(String[] args) {
//        int[][] array = {{}};
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

        int number = 7;
        if (find(array, number)) {
            System.out.printf("Number %d is in array.", number);
        } else {
            System.out.printf("Number %d is not in array.", number);
        }
    }
}
