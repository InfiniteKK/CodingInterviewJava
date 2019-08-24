public class DuplicationNumberDemo {
    public void duplicationNumber(int[] array) {
        if (array.length == 0) {
            System.out.println("Error: no element in array.");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 1 || array[i] > array.length - 1) {
                System.out.println("Error: input error.");
                return;
            }
        }
        int start = 1;
        int end = array.length - 1;
        int middle;
        while (end >= start) {
            middle = (end - start) / 2 + start;
            int count = countNumber(array, start, middle);
            if (end == start) {
                if (count > 1) {
                    System.out.println("Duplication number is " + start + ".");
                } else {
                    System.out.println("Error: no duplication number.");
                }
                break;
            }
            if (count > middle - start + 1) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }


    }

    public int countNumber(int[] array, int start, int end) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= start && array[i] <= end) {
                sum += 1;
            }
        }
        return sum;

    }
}
