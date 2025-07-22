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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        if(head.next==null) return null;
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==k) return head.next;
        int indexToRemove=size-k;
        ListNode prev =head;
        for(int i=1;i<indexToRemove;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;

        return head;

    }
}