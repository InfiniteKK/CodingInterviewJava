public class Application {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ReorderDemo demo = new ReorderDemo();
        IsOddNumber isOddNumber = new IsOddNumber();
        demo.reorder_1(array,isOddNumber);
        for (int arr : array) {
            System.out.printf("%d ",arr);
        }
    }
}
