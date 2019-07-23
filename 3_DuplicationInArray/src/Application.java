public class Application {
    public static void duplicationNumber(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        } else {
            for (int i = 0; i < array.length; i++) {
                while (i != array[i]) {
                    if (array[i] == array[array[i]]) {
                        System.out.println("One duplication number is " + array[i] + ".");
                        return;
                    }
                    int temp = array[i];
                    array[i] = array[temp];
                    array[temp] = temp;
                }
                if (i == array.length - 1) {
                    System.out.println("No duplication number.");
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 0, 2, 5, 3};
//        int[] array = {2, 3, 1, 0, 4, 5, 6};
//        int[] array = {};
        duplicationNumber(array);

    }
}
