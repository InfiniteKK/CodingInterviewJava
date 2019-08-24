public class Application {
    public static void main(String[] args) {

        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        int value = 3;
        BinaryTreeDemo demo = new BinaryTreeDemo();
        BinaryTreeNode head = demo.constructBinaryTree(pre, in);
        System.out.print("InOrder:\t");
        demo.inOrderTraverse(head);
        System.out.println();
        SelectNode selectNode = new SelectNode(null);

        demo.inOrderTraverseSelectNode(head,value,selectNode);
        System.out.print("Current node: " + String.valueOf(value) + "\t Next node: " + String.valueOf(demo.getNextNode(selectNode.node).value)+ "\n");

//        BinaryTreeNode node1 = head.left.left.right;
//        BinaryTreeNode node2 = head.left;
//        BinaryTreeNode node3 = head.right.right.left;
//        System.out.print("Current node: " + String.valueOf(node1.value) + "\t Next node: " + String.valueOf(demo.getNextNode(node1).value) + "\n");
//        System.out.print("Current node: " + String.valueOf(node2.value) + "\t Next node: " + String.valueOf(demo.getNextNode(node2).value) + "\n");
//        System.out.print("Current node: " + String.valueOf(node3.value) + "\t Next node: " + String.valueOf(demo.getNextNode(node3).value) + "\n");
//
//        BinaryTreeNode node4 = null;
//        demo.getNextNode(node4);
    }
}
