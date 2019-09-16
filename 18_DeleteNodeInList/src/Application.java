public class Application {
    public static void main(String[] args) {
        ListNodeDemo demo = new ListNodeDemo();
        ListNode head = demo.constructList(6);
        demo.printList(head);
        ListNode toBeDeletedNode = demo.getNode(head,2);
        head = demo.deleteNode(head,toBeDeletedNode);
        demo.printList(head);
    }
}
