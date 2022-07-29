class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        // keep a dummy pointer for result list
        ListNode dummy = new ListNode(-200);
        ListNode result = dummy;
        
        while(head!=null){
            int x = head.val;
            ListNode last = null;
            int count = 0;
            
            // get count with same value as current 
            while(head!=null && head.val==x){
                last = head;
                head = head.next;
                count++;
            }
            
            //if only one node with current data is there add it to result
            if(count==1){
                dummy.next = last;
                dummy = dummy.next;
            }
        }
        //point current result poknter next to null
        dummy.next = null;
        
        return result.next;
    }
}