//https://leetcode.com/problems/remove-nth-node-from-end-of-list/



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        
    
        while(temp!= null){
            temp = temp.next;
            size++;
        }
        if(n==size){ 
            return head.next;
        }
        temp = head;
        for (int i = 1; i < size - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}