package LinkedList;

public class OddEvenLinkedList {

    public static ListNode OddEvenLL(ListNode input) {
        ListNode odd = input;
        ListNode even = input.next;
        ListNode evenhead = even;
        if(input == null)
            return input;
        while (even!= null && even.next != null) {
            odd.next = even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return input;
    }

    public static void printLL(ListNode result){
        if(result==null)
            System.out.println("Result :" +result);
        while (result!=null){
            System.out.println("Result :" +result.val);
            result=result.next;
        }
    }

    public static void main(String[] args) {

        ListNode l = new ListNode(2);
        l.next = new ListNode(90);
        l.next.next = new ListNode(7);
        l.next.next.next = new ListNode(99);
        l.next.next.next.next = new ListNode(10);
        l.next.next.next.next.next = new ListNode(129);
        ListNode result = OddEvenLL(l);
        printLL(result);

    }

}