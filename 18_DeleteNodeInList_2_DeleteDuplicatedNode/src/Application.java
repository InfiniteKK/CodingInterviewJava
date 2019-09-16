public class Application {
    public static void main(String[] args) {
        ListNodeDemo demo = new ListNodeDemo();
//        ListNodeNode head = new ListNodeNode(demo.constructList(6,"increase"));
//        ListNodeNode head = new ListNodeNode(demo.constructList(6,"constant"));
        ListNodeNode head = new ListNodeNode(demo.constructList(6,"others"));
        demo.printList(head.listNode);
        demo.deleteDuplicationNode(head);
        demo.printList(head.listNode);
    }
}
