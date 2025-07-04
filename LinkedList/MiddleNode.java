//package JAVA.LinkedList;

public class MiddleNode {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode slow =head;
        while(slow!=null){
            cnt++;
            slow=slow.next;
        }
        slow=head;
        for(int i=0;i<cnt/2;i++){
            slow=slow.next;
        }
        return slow;
    }
}
}
