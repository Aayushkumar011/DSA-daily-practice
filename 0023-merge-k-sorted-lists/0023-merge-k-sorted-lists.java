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
    public static ListNode merge(ListNode l,ListNode r){
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;
        while(l!=null && r!=null){
            if(l.val>r.val){
                d.next=r;
                r=r.next;
            }
            else{
                d.next=l;
                l=l.next;
            }
            d=d.next;
        }
        while(l!=null){
            d.next=l;
            l=l.next;
            d=d.next;
        }
        while(r!=null){
            d.next=r;
            r=r.next;
            d=d.next;
        }
    return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        ListNode ans = lists[0];
        for(int i=1;i<lists.length;i++){
            ans=merge(ans,lists[i]);
        }
    return ans;
    }
}