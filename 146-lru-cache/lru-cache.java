class LRUCache {


public class Node{
    int key;
    int value;
    Node next;
    Node prev;
    Node(int k,int v){
        this.key=k;
        this.value=v;
        this.next=null;
        this.prev=null;
    }

}
Node head=new Node(-1,-1);
Node tail=new Node(-1,-1);
public void addNode(Node newNode){
Node nxt=head.next;
head.next=newNode;
newNode.prev=head;
newNode.next=nxt;
nxt.prev=newNode;
}
public void deleteNode(Node oldNode){
    Node prv=oldNode.prev;
    prv.next=oldNode.next;
    oldNode.next.prev=prv;
}
HashMap<Integer,Node> map=new HashMap<>();
int limit;
    public LRUCache(int capacity){
        limit=capacity;
        head.next=tail;
        tail.prev=head;
    }

    
    public int get(int key) {
        Node curr=map.get(key);
        if(curr==null) return -1;
        int ans=curr.value;
        deleteNode(curr);
        addNode(curr);
        return ans;

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node oldNode=map.get(key);
            deleteNode(oldNode);
            map.remove(key);
        }
        if(map.size()==limit){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        Node newNode =new Node(key,value);
        addNode(newNode);
        map.put(key,newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */