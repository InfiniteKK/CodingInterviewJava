public class Application {
    public static void main(String[] args) {
        ListNodeDemo demo = new ListNodeDemo();
        ListNode head = demo.createListTailInsert(9);
//        ListNode head = createListHeadInsert(9);

        if (head == null) {
            System.out.println("List is empty.");
            return;
        } else {
            demo.printList(head);
            demo.printListReverseOrder_Iteratively(head);
            demo.printListReverseOrder_Recursively(head);
        }

    }
}
