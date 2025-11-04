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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            a.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(a);
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;
        for(int i:a){
            d.next=new ListNode(i);
            d=d.next;
        }
    return dummy.next;
    }
}