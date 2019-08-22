public class Application {

    public static BinaryTreeNode constructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0 || pre.length != in.length) {
            System.out.println("Error: invalid input.");
            return null;
        }
        return construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    public static BinaryTreeNode construct(int[] pre, int[] in, int pStart, int pEnd, int iStart, int iEnd) {
        BinaryTreeNode root = new BinaryTreeNode(pre[pStart]);
        BinaryTreeNode rootLeft = null;
        BinaryTreeNode rootRight = null;
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
            rootLeft = construct(pre, in, pStart + 1, pStart + leftLength, iStart, rootIndex - 1);
            root.left = rootLeft;
            rootLeft.parent = root;
        }
        if (leftLength < iEnd - iStart) {
            rootRight = construct(pre, in, pStart + leftLength + 1, pEnd, rootIndex + 1, iEnd);
            root.right = rootRight;
            rootRight.parent = root;
        }
        return root;
    }

    public static void inOrderTraverse(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left);
        System.out.print(String.valueOf(node.value) + " ");
        inOrderTraverse(node.right);
    }

    public static void inOrderTraverseSelectNode(BinaryTreeNode node, int value, SelectNode selectNode) {
        if (node == null) {
            return;
        }
        inOrderTraverseSelectNode(node.left, value, selectNode);
        if (node.value == value) {
            selectNode.node = node;
            return;
        }
        inOrderTraverseSelectNode(node.right, value,selectNode);
    }


    public static BinaryTreeNode getNextNode(BinaryTreeNode node) {
        BinaryTreeNode nextNode = null;
        if (node == null) {
            System.out.println("Error: invalid input.");
            return null;
        }

        if (node.right != null) {
            BinaryTreeNode tempNode = node.right;
            while (tempNode.left != null) {
                tempNode = tempNode.left;
            }
            nextNode = tempNode;
        } else {
            BinaryTreeNode parentNode = node.parent;
            if (parentNode != null) {
                if (parentNode.left == node) {
                    nextNode = parentNode;
                } else {
                    while (parentNode.parent.left != parentNode) {
                        parentNode = parentNode.parent;
                    }
                    nextNode = parentNode.parent;
                }
            }
        }
        return nextNode;
    }


    public static void main(String[] args) {

        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        int value = 3;
        BinaryTreeNode head = constructBinaryTree(pre, in);
        System.out.print("InOrder:\t");
        inOrderTraverse(head);
        System.out.println();
        SelectNode selectNode = new SelectNode(null);

        inOrderTraverseSelectNode(head,value,selectNode);
        System.out.print("Current node: " + String.valueOf(value) + "\t Next node: " + String.valueOf(getNextNode(selectNode.node).value)+ "\n");

//        BinaryTreeNode node1 = head.left.left.right;
//        BinaryTreeNode node2 = head.left;
//        BinaryTreeNode node3 = head.right.right.left;
//        System.out.print("Current node: " + String.valueOf(node1.value) + "\t Next node: " + String.valueOf(getNextNode(node1).value) + "\n");
//        System.out.print("Current node: " + String.valueOf(node2.value) + "\t Next node: " + String.valueOf(getNextNode(node2).value) + "\n");
//        System.out.print("Current node: " + String.valueOf(node3.value) + "\t Next node: " + String.valueOf(getNextNode(node3).value) + "\n");

//        BinaryTreeNode node4 = null;
//        getNextNode(node4);
    }
}
