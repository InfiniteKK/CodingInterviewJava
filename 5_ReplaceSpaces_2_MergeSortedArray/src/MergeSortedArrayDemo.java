import java.util.ArrayList;
public class MergeSortedArrayDemo {
    public void mergeSortedArray(ArrayList<Integer> arrayListA, ArrayList<Integer> arrayListB) {
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
}
