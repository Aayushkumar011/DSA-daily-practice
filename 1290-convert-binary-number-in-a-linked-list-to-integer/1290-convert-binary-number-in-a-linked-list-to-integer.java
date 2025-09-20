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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            a.add(temp.val);
            temp=temp.next;
        }
        int sum = 0;
        int n = a.size();
        int m = n-1;
        for(int i=0;i<n;i++){
            if(a.get(i)==1){
                sum+=1 << m;
            }
            m--;
        }
        return sum;
    }
}