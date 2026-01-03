class Solution {
    public int size(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(size(head)<k) return head;
        ListNode temp=head;
        int count=0;
        while(count<k){
            if(temp==null) return head;
            temp=temp.next;
            count++;
        }
        ListNode prevNode=reverseKGroup(temp,k);
        temp=head;
        count=0;
        while(count<k){
            ListNode nxt=temp.next;
            temp.next=prevNode;
            prevNode=temp;
            temp=nxt;
            count++;
        }
        return prevNode;
    }
}