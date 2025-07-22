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
    public ListNode rotateRight(ListNode head, int k) {
       
        if(head==null||head.next==null||k==0) return head;

        ListNode temp=head;
        int l=1;
        while(temp.next!=null){
            temp=temp.next;
            l++;
        }
        k=k%l;
        if(k==0)  return head;
        int i=0;
        while(i<k){
            ListNode curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next.next=head;
            head = curr.next;
            curr.next = null;
            i++;
        }
        return head;
    }
}