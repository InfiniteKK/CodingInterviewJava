public class EntryNodeDemo {
    public void createList(ListNode head, int listLength, int loopEntry) {
        ListNode temp = head;
        ListNode tempEntry = null;
        if(loopEntry == 1){
            tempEntry = head;
        }
        for (int i = 1; i < listLength; i++) {
            temp.next = new ListNode(i + 1);
            if (i == loopEntry - 1) {
                tempEntry = temp.next;
            }
            temp = temp.next;
        }
        temp.next = tempEntry;
    }

    public void printList(ListNode head, int listLength,int loopEntry) {
        ListNode temp = head;
        int i = 0;
        while (i++ != listLength) {
            if (i != listLength) {
                if(i == loopEntry){
                    System.out.printf("%d(Loop entry) -> ", temp.value);
                }else {
                    System.out.printf("%d -> ", temp.value);
                }

            } else {
                if(i == loopEntry){
                    System.out.printf("%d(Loop entry)\n", temp.value);
                }else {
                    System.out.printf("%d\n", temp.value);
                }
            }
            temp = temp.next;
        }
    }

    private ListNode meetingNode(ListNode head) {
        if (head == null) {
            System.out.println("Error: invalid input.");
            return null;
        }
        ListNode slowNode = head.next;
        if (slowNode == null) {
            return null;
        }
        ListNode fastNode = slowNode.next;
        while (fastNode != null && slowNode != null) {
            if (fastNode == slowNode) {
                return fastNode;
            }
            slowNode = slowNode.next;
            fastNode = fastNode.next;
            if (fastNode != null) {
                fastNode = fastNode.next;
            }
        }
        return null;
    }

    public ListNode entryNodeOfLoop(ListNode head) {
        ListNode meetingNode = meetingNode(head);
        if (meetingNode == null) {
            return null;
        }
        int nodesInLoop = 1;
        ListNode tempNode = meetingNode;
        while (tempNode.next != meetingNode) {
            tempNode = tempNode.next;
            nodesInLoop++;
        }

        ListNode frontNode = head;
        ListNode behindNode = head;
        for (int i = 0; i < nodesInLoop; i++) {
            frontNode = frontNode.next;
        }
        while (frontNode != behindNode) {
            frontNode = frontNode.next;
            behindNode = behindNode.next;
        }
        return frontNode;
    }
}
