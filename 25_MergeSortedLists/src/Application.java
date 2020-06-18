public class Application {
    public static void main(String[] args) {
        MergeDemo demo = new MergeDemo();
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(1);
//        ListNode head2 = null;
        demo.createList(head1,5,0);
        demo.createList(head2,3,1);
        demo.printList(head1);
        demo.printList(head2);
        ListNode mergeHead = demo.merge(head1,head2);
        demo.printList(mergeHead);
        System.out.println("Success!!!");

    }
}
