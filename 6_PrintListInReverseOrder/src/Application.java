import java.util.Stack;

public class Application {
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(String.valueOf(temp.value) + " ");
            } else {
                System.out.print(String.valueOf(temp.value) + "\n");
            }
            temp = temp.next;
        }
    }

    public static ListNode createListTailInsert(int number) {
        ListNode head = null;  // head = null 时 head 未被实例化不会在内存中分配地址空间
        ListNode last = null;
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                head = new ListNode(i); // head 被实例化
                last = head;
            } else {
                last.next = new ListNode(i);
                last = last.next;
            }
        }
        return head;
    }

    public static ListNode createListHeadInsert(int number) {
        ListNode head = null;
        for (int i = 0; i < number; i++) {
            ListNode node = new ListNode(i);
            if (i == 0) {
                head = node;
            } else {
                node.next = head;
                head = node;
            }
        }
        return head;
    }

    public static void printListReverseOrder_Iteratively(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        while (!stack.empty()) {
            if (stack.size() != 1) {
                System.out.print(String.valueOf(stack.pop().value) + " ");
            } else {
                System.out.print(String.valueOf(stack.pop().value) + "\n");
            }
        }
    }

    public static void printListReverseOrder_Recursively(ListNode head) {
        if (head != null) {
            printListReverseOrder_Recursively(head.next);
            System.out.print(String.valueOf(head.value) + " ");
        } else {
            return;
        }

    }

    public static void main(String[] args) {
        ListNode head = createListTailInsert(9);
//        ListNode head = createListHeadInsert(9);

        if (head == null) {
            System.out.println("List is empty.");
            return;
        } else {
            printList(head);
            printListReverseOrder_Iteratively(head);
            printListReverseOrder_Recursively(head);
        }

    }
}
