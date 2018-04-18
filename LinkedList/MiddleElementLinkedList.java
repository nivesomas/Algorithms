package LinkedList;

public class MiddleElementLinkedList {

    public static void FindMiddleElement(ListNode input){
        ListNode OneIncrementPtr = input;
        ListNode TwoIncrementPtr = input;
        while(TwoIncrementPtr.next.next!=null){
            OneIncrementPtr=OneIncrementPtr.next;
            TwoIncrementPtr=TwoIncrementPtr.next.next;
        }
        System.out.println("Middle Element : " +OneIncrementPtr.val);
    }

    public static void main(String[] args){
        ListNode node = new ListNode(5);
        node.next = new ListNode(7);
        node.next.next = new ListNode(88);
        node.next.next.next = new ListNode(909);
        node.next.next.next.next = new ListNode(656);
        node.next.next.next.next.next = new ListNode(33);
        FindMiddleElement(node);
    }
}
