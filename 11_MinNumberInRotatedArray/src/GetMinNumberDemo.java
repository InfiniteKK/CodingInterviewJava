public class GetMinNumberDemo {
    public int getMinNumber(int[] array) {
        if (array.length == 0) {
            System.out.println("Error: invalid input.");
        }
        int indexStart = 0;
        int indexEnd = array.length - 1;
        int indexMid = indexStart;
        while (array[indexStart] >= array[indexEnd]) {
            if (indexEnd - indexStart == 1) {
                indexMid = indexEnd;
                break;
            }
            indexMid = (indexStart + indexEnd) / 2;

            if (array[indexStart] == array[indexEnd] && array[indexStart] == array[indexMid]) {
                int result = array[indexStart];
                for (int i = indexStart + 1; i <= indexEnd; i++) {
                    if (array[i] < result) {
                        result = array[i];
                    }
                }
                return result;
            }

            if (array[indexStart] <= array[indexMid]) {
                indexStart = indexMid;
            } else if (array[indexEnd] >= array[indexMid]) {
                indexEnd = indexMid;
            }
        }
        return array[indexMid];
    }
}
