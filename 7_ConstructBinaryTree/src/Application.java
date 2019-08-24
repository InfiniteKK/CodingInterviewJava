public class Application {
    public static void main(String[] args) {
//        int[] pre = {};
//        int[] in = {};
//        int[] pre = {1, 2, 3};
//        int[] in = {4, 5, 6};
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNodeDemo demo = new TreeNodeDemo();
        TreeNode head = demo.constructBinaryTree(pre, in);

        System.out.printf("PreOrder:\t");
        demo.preOrderTraverse(head);
        System.out.printf("\nInOrder:\t");
        demo.inOrderTraverse(head);
        System.out.printf("\nPostOrder:\t");
        demo.postOrderTraverse(head);
    }
}
