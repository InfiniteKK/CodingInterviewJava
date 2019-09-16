public class ListNodeDemo {
    public ListNode constructList(int length, String mode) { //建立不同链表方便测试
        ListNode head = new ListNode(0);
        ListNode tempPointer = head;
        if (mode.equals("increase")) { // 无重复元素
            for (int i = 1; i < length; i++) {
                ListNode temp = new ListNode(i);
                tempPointer.next = temp;
                tempPointer = temp;
            }
        } else if (mode.equals("constant")) { // 全部为重复元素
             for (int i = 1; i < length; i++) {
                ListNode temp = new ListNode(0);
                tempPointer.next = temp;
                tempPointer = temp;
            }
        } else if (mode.equals("others")) { // 头尾包含重复元素
            for (int i = 1; i < length; i++) {
                if (i == 1) {
                    ListNode temp = new ListNode(0);
                    tempPointer.next = temp;
                    tempPointer = temp;
                } else if (i == length - 1) {
                    ListNode temp = new ListNode(i - 1);
                    tempPointer.next = temp;
                    tempPointer = temp;
                } else {
                    ListNode temp = new ListNode(i);
                    tempPointer.next = temp;
                    tempPointer = temp;
                }
            }
        }
        return head;
    }

    public void printList(ListNode head) {
        if (head == null) {
            System.out.println("List is null.");
            return;
        }
        while (head != null) {
            if (head.next != null) {
                System.out.print(head.value + " -> ");
            } else {
                System.out.println(head.value);
            }
            head = head.next;
        }
    }

    public void deleteDuplicationNode(ListNodeNode head) {
        if(head.listNode == null){
            return;
        }
        ListNode preNode = null;
        ListNode tempNode = head.listNode;
        while (tempNode != null){
            boolean needDelete = false;
            if(tempNode.next != null && tempNode.next.value == tempNode.value){
                needDelete = true;
            }
            if(!needDelete){
                preNode = tempNode;
                tempNode = tempNode.next;
            }else{
                ListNode toBeDeletedNode = tempNode;
                int value = tempNode.value;
                while (toBeDeletedNode != null && toBeDeletedNode.value == value){
                    toBeDeletedNode = toBeDeletedNode.next;
                    tempNode = toBeDeletedNode;
                }
                if (preNode == null){
                    head.listNode = tempNode;
                }else {
                    preNode.next = tempNode;
                }
            }
        }



    }
}
