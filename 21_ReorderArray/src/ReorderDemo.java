public class ReorderDemo{
    public void reorder_1(int[] array,IsOdd isOdd){
        if(array.length == 0){
            System.out.println("Error: invalid input.");
            return;
        }
        int begin = 0;
        int end = array.length - 1;
        while (begin < end){
            while (begin < end && !isOdd.check(array[begin])){
                begin++;
            }
            while (begin < end && isOdd.check(array[end])){
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

