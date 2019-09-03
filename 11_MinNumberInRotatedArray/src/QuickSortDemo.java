public class QuickSortDemo {
    public void quickSort(int[] array, int start, int end) {
        int i, j, temp, swapTemp;
        if (start > end) {
            return;
        }
        i = start;
        j = end;
        temp = array[start];
        while (i < j) {
            while (array[j] >= temp && i < j) {
                j--;
            }
            while (array[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }
        array[start] = array[j];
        array[j] = temp;
        quickSort(array, start, j - 1);
        quickSort(array, j + 1, end);
    }
}
