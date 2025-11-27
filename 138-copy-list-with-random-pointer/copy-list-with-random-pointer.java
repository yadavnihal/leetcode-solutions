/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null ) return null;
        HashMap<Node,Node> map=new HashMap<>();
        Node newHead=new Node(head.val);
        Node oldtemp=head.next;
        Node newtemp=newHead;
        map.put(head,newHead);
        while(oldtemp!=null){

            Node copyNode= new Node(oldtemp.val);
            newtemp.next=copyNode;
            newtemp=copyNode;
            map.put(oldtemp,newtemp);
            oldtemp=oldtemp.next;
        }
    oldtemp=head;
    newtemp=newHead;
    while(oldtemp!=null){
        if(oldtemp.random!=null){
            
            Node temp=map.get(oldtemp.random);
            newtemp.random=temp;
        }
        oldtemp=oldtemp.next;
        newtemp=newtemp.next;
    }
    return newHead;
    }
}