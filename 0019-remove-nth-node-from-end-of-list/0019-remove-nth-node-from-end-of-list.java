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
        int l = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        if(n == l){
            return head.next;
        }
        l=l-n;
        temp=head;
        while(l-->1){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    return head;
    }
}