public class TreeNodeDemo {
    public TreeNode constructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0 || pre.length != in.length) {
            System.out.println("Error: invalid input.");
            return null;
        }
        return construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    public TreeNode construct(int[] pre, int[] in, int pStart, int pEnd, int iStart, int iEnd) {
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

    public void preOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.printf(String.valueOf(node.value) + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public void inOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left);
        System.out.printf(String.valueOf(node.value) + " ");
        inOrderTraverse(node.right);
    }

    public void postOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.printf(String.valueOf(node.value) + " ");
    }

}
