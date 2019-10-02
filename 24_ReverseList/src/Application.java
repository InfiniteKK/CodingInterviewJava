public class Application {
    public static void main(String[] args) {
        ReverseListDemo demo = new ReverseListDemo();
//        int listLength = 1;
        int listLength = 6;
        ListNode head = new ListNode(1);
        demo.createList(head,listLength);
        demo.printList(head);
        ListNode reverseHead = demo.reverseList(head);
        demo.printList(reverseHead);
    }
}
