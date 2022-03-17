// Problem link - https://leetcode.com/problems/remove-duplicates-from-sorted-list/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null)
            return null;
        
        if(head.next == null)
            return head;
        
        ListNode newHead = head;
        // ListNode newHead = head;
        
        while(head.next != null){
             
            
            while(head.val == head.next.val  ){
                if(head.next.next == null){
                head.next = null;
                    break;
                }
                head.next = head.next.next;
            }
             if(head.next != null)
                head = head.next;
        }
        
        return newHead;
        
    }
}
