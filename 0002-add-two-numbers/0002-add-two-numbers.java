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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode n = head;
        int c = 0;
        while(l1!=null || l2!=null){
            int a = (l1!=null)?l1.val:0;
            int b = (l2!=null)?l2.val:0;
            int num = a + b + c;
            n.next =  new ListNode(num%10);
            c = num/10;
            n = n.next;
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        }
        
        if(c>0) n.next =  new ListNode(c);
    return head.next;
    }
}