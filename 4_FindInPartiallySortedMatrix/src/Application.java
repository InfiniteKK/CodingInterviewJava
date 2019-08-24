public class Application {

    public static void main(String[] args) {
//        int[][] array = {{}};
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int number = 7;
        FindDemo demo = new FindDemo();
        if (demo.find(array, number)) {
            System.out.printf("Number %d is in array.", number);
        } else {
            System.out.printf("Number %d is not in array.", number);
        }
    }
}
