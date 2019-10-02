public class ReverseListDemo {
    public void createList(ListNode head, int n) {
        if(head == null){
            System.out.println("Error: invalid input.");
            return;
        }
        ListNode temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(i + 1);
            temp = temp.next;
        }
    }

    public void printList(ListNode head) {
        if(head == null){
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

    ListNode reverseList(ListNode head){
        if(head == null){
            System.out.println("Error: invalid input.");
            return null;
        }
        ListNode reverseHead = null;
        ListNode currentNode = head;
        ListNode previousNode = null;
        while (currentNode!=null){
            ListNode nextNode = currentNode.next;
            if(nextNode == null){
                reverseHead = currentNode;
            }
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return reverseHead;
    }
}
