public class MergeDemo {
    public void createList(ListNode head, int n, int mode) {
        if (head == null) {
            System.out.println("Error: invalid input.");
            return;
        }
        ListNode temp = head;
        if (mode == 0) {
            for (int i = 1; i < n; i++) {
                temp.next = new ListNode(2 * i);
                temp = temp.next;
            }
        } else {
            for (int i = 1; i < n; i++) {
                temp.next = new ListNode(2 * i + 1);
                temp = temp.next;
            }
        }
    }

    public void printList(ListNode head) {
        if (head == null) {
            System.out.println("Error: invalid input.");
            return;
        }
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

    public ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }
        ListNode mergeHead = null;
        if (head1.value < head2.value) {
            mergeHead = head1;
            mergeHead.next = merge(head1.next, head2);
        } else {
            mergeHead = head2;
            mergeHead.next = merge(head1, head2.next);
        }
        return mergeHead;
    }

}
