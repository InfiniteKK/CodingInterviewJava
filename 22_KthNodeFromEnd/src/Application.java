public class Application {
    public static void main(String[] args) {
        KthNodeDemo demo = new KthNodeDemo();
        ListNode head = new ListNode(1);
        int listLength = 5;
//        int k = 0;
//        int k = 1;
//        int k = 5;
//        int k = 6;
        int k = 3;
        demo.createList(head,listLength);
        demo.printList(head);
        if(demo.FindKthToTail(head,k) !=null) {
            System.out.println(demo.FindKthToTail(head, k).value);
        }
    }
}
