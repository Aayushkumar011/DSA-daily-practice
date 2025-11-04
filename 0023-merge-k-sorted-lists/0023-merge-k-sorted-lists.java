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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> a = new ArrayList<>();
        for(ListNode head : lists){
            while(head!=null){
                a.add(head.val);
                head=head.next;
            }
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