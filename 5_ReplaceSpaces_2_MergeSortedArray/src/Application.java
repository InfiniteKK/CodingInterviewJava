import java.util.ArrayList;
import java.util.Arrays;
public class Application {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayListA = new ArrayList<Integer>();
//        ArrayList<Integer> arrayListB = new ArrayList<Integer>();
//        ArrayList<Integer> arrayListA = new ArrayList<Integer>(Arrays.asList(1, 3, 7, 8, 9));
//        ArrayList<Integer> arrayListB = new ArrayList<Integer>(Arrays.asList(2, 3, 6, 7, 10));
        ArrayList<Integer> arrayListA = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> arrayListB = new ArrayList<Integer>(Arrays.asList(2, 6, 8));
        MergeSortedArrayDemo demo = new MergeSortedArrayDemo();
        demo.mergeSortedArray(arrayListA, arrayListB);
    }
}
