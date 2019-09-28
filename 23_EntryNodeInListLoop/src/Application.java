public class Application {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        int listLength = 6;
//        int loopEntry = 1;
//        int loopEntry = 6;
        int loopEntry = 3;
        EntryNodeDemo demo = new EntryNodeDemo();
        demo.createList(head, listLength, loopEntry);
        demo.printList(head, listLength,loopEntry);
        if (demo.entryNodeOfLoop(head) != null) {
            System.out.println("Entry node is " + demo.entryNodeOfLoop(head).value + ".");
        }
    }
}
