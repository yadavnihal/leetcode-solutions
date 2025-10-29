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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public ListNode middle(ListNode head){
  ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

      ListNode fh=head;
      ListNode m=middle(head);
      ListNode sh=reverse(m.next);

      while(sh!=null){
        if(sh.val!=fh.val) return false;
        sh=sh.next;
        fh=fh.next;
      }
      return true;
    }
}