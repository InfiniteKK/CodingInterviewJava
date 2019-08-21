public class Application {
    public static TreeNode constructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0 || pre.length != in.length) {
            System.out.println("Error: invalid input.");
            return null;
        }
        return construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    public static TreeNode construct(int[] pre, int[] in, int pStart, int pEnd, int iStart, int iEnd) {
        TreeNode root = new TreeNode(pre[pStart]);
        if (pStart == pEnd && iStart == iEnd) {
            if (pre[pStart] != in[iStart]) {
                System.out.println("Error: invalid input.");
                return null;
            }
            return root;
        }

        int rootIndex = iStart;
        while (root.value != in[rootIndex] && rootIndex < iEnd) {
            rootIndex++;
        }
        if (rootIndex > iEnd) {
            System.out.println("Error: invalid input.");
            return null;
        }
        int leftLength = rootIndex - iStart;
        if (leftLength > 0) {
            root.left = construct(pre, in, pStart + 1, pStart + leftLength, iStart, rootIndex - 1);
        }
        if (leftLength < iEnd - iStart) {
            root.right = construct(pre, in, pStart + leftLength + 1, pEnd, rootIndex + 1, iEnd);
        }
        return root;
    }

    public static void preOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.printf(String.valueOf(node.value) + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public static void inOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left);
        System.out.printf(String.valueOf(node.value) + " ");
        inOrderTraverse(node.right);
    }

    public static void postOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.printf(String.valueOf(node.value) + " ");
    }

    public static void main(String[] args) {
//        int[] pre = {};
//        int[] in = {};
//        int[] pre = {1, 2, 3};
//        int[] in = {4, 5, 6};
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode head = constructBinaryTree(pre, in);

        System.out.printf("PreOrder:\t");
        preOrderTraverse(head);
        System.out.printf("\nInOrder:\t");
        inOrderTraverse(head);
        System.out.printf("\nPostOrder:\t");
        postOrderTraverse(head);

    }
}
