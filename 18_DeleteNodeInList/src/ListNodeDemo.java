public class ListNodeDemo {
    public ListNode constructList(int length) {
        ListNode head = new ListNode(0);
        ListNode tempPointer = head;
        for (int i = 1; i < length; i++) {
            ListNode temp = new ListNode(i);
            tempPointer.next = temp;
            tempPointer = temp;
        }
        return head;
    }

    public void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is null.");
            return;
        }
        while (head != null) {
            if(head.next != null) {
                System.out.print(head.value + " -> ");
            }else {
                System.out.println(head.value);
            }
            head = head.next;
        }
    }

    public ListNode getNode(ListNode head, int value) {
        ListNode node = null;
        while (head != null) {
            if (head.value == value) {
                node = head;
                break;
            }
            head = head.next;
        }
        if (node == null) {
            System.out.println("Error: " + value + " is not in list.");
        }
        return node;
    }

    public void deleteNode(ListNodeNode head, ListNode toBeDeletedNode) {
        if (head.listNode == null || toBeDeletedNode == null) {
            System.out.println("Error: input error.");
            return;
        }
        if (toBeDeletedNode.next != null) {
            toBeDeletedNode.value = toBeDeletedNode.next.value;
            toBeDeletedNode.next = toBeDeletedNode.next.next;
        } else if (head.listNode == toBeDeletedNode) {
            head.listNode = null;
        } else {
            ListNodeNode temp = head;
            while (temp.listNode.next != toBeDeletedNode) {
                temp.listNode = temp.listNode.next;
            }
            temp.listNode.next = null;
        }

    }
}
