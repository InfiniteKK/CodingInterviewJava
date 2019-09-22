public class ReorderDemo {
    public void reorder_1(int[] array){
        if(array.length == 0){
            System.out.println("Error: invalid input.");
            return;
        }
        int begin = 0;
        int end = array.length - 1;
        while (begin < end){
            while (begin < end && (array[begin]&0x1) != 0){
                begin++;
            }
            while (begin < end && (array[end] & 0x1) == 0){
                end--;
            }
            if (begin < end){
                int temp = array[begin];
                array[begin] = array[end];
                array[end] = temp;
            }
        }
    }

}

