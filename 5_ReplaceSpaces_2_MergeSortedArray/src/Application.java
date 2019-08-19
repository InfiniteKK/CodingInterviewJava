import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void mergeSortedArray(ArrayList<Integer> arrayListA, ArrayList<Integer> arrayListB) {
        if (arrayListA.size() == 0 || arrayListB.size() == 0) {
            System.out.println("Error: input error.");
            return;
        }
        int originalIndex = arrayListA.size() - 1;
        int tempIndex = arrayListB.size() - 1;
        for (int i = 0; i <= tempIndex; i++) {
            arrayListA.add(0);
        }
        int newIndex = arrayListA.size() - 1;
        while (tempIndex >= 0) {
            if (arrayListB.get(tempIndex) >= arrayListA.get(originalIndex)) {
                arrayListA.set(newIndex, arrayListB.get(tempIndex));
                tempIndex--;
            } else {
                arrayListA.set(newIndex, arrayListA.get(originalIndex));
                originalIndex--;
            }
            newIndex--;
        }

        System.out.println(arrayListA);


    }

    public static void main(String[] args) {
//        ArrayList<Integer> arrayListA = new ArrayList<Integer>();
//        ArrayList<Integer> arrayListB = new ArrayList<Integer>();
//        ArrayList<Integer> arrayListA = new ArrayList<Integer>(Arrays.asList(1, 3, 7, 8, 9));
//        ArrayList<Integer> arrayListB = new ArrayList<Integer>(Arrays.asList(2, 3, 6, 7, 10));
        ArrayList<Integer> arrayListA = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> arrayListB = new ArrayList<Integer>(Arrays.asList(2, 6, 8));
        mergeSortedArray(arrayListA, arrayListB);
    }
}
