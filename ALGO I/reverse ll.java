class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        } else if (head.next==null){
            return head;
        }
        ListNode first = head, second = head.next, third = head.next.next;
        second.next=first;
        first.next=null;

        while(third!=null){
            first=second;
            second=third;
            third=third.next;
            second.next=first;
        }
        return second;        
    }
}