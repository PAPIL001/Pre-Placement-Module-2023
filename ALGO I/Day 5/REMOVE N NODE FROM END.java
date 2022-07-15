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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a=head;
        int c=0;
        while(a!=null)
        {
            a=a.next;
            c++;
}
        a=head;
        if(n==c)
            return a.next;
        for(int i=1;i<c-n;i++)
            a=a.next;
        a.next=a.next.next;
        return head;
    }
}