public class Application {
    public static void main(String[] args) {
        ListNodeDemo demo = new ListNodeDemo();
        ListNodeNode head = new ListNodeNode(demo.constructList(1));
        demo.printList(head.listNode);
        ListNode toBeDeletedNode = demo.getNode(head.listNode,0);
        demo.deleteNode(head,toBeDeletedNode);
        demo.printList(head.listNode);
    }
}
