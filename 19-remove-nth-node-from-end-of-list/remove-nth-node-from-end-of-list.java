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
     int size=0;
     
     ListNode curr=head;
     while(curr!=null){
        size++;
        curr=curr.next;

     }
     if(size==1) return null;
     if(size==2){
        if(n==1){
            head.next=null;
            return head;
        }
        else{
            return head.next;
        }
     }
     if(size-n==0) return head.next;
     curr=head;
     for(int i=0;i<size-n-1;i++){
        curr=curr.next;
     }
     curr.next=curr.next.next;

     return head;
}}