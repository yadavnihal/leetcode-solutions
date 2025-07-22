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
    public ListNode mergeTwoLists(ListNode temp1, ListNode temp2) {
        ListNode res=new ListNode();
        ListNode curr=res;
        
        while(temp1!=null && temp2!=null){
            if(temp1.val>temp2.val){
                curr.next=temp2;
                temp2=temp2.next;
            }
            else {
                curr.next=temp1;
                temp1=temp1.next;
            }
            curr=curr.next;
        }
if(temp1!=null){
    curr.next=temp1;
}
else{
    curr.next=temp2;
}
return res.next;
    }
}