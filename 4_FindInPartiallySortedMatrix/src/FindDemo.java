public class FindDemo {
    public boolean find(int[][] array, int number) {
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

}
