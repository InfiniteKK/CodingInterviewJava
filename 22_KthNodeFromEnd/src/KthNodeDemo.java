public class KthNodeDemo {
    public void createList(ListNode head, int n) {
        ListNode temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.printf("%d -> ", temp.value);
            } else {
                System.out.printf("%d\n", temp.value);
            }
            temp = temp.next;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if(head == null || k == 0){
            System.out.println("Error: invalid input.");
            return null;
        }
        ListNode frontNode = head;
        ListNode behindNode = head;
        for (int i = 0; i < k - 1; i++) {
            if(frontNode.next != null) {
                frontNode = frontNode.next;
            }else {
                System.out.println("Error: invalid input - k out of range.");
                return null;
            }
        }
        while (frontNode.next != null){
            frontNode = frontNode.next;
            behindNode = behindNode.next;
        }
        return behindNode;
    }
}
