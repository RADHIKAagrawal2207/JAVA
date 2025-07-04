//package JAVA.LinkedList;
//import java.util.*;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class Reverse_Linkedlist {
    
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode rev=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return rev;
    }
}
