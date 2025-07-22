class Node {
    int val;
    Node next;

    public Node(int data) {
        this.val = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    
    public int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    
    public int get(int index) {
        int size = size();
        if (index >= size || index < 0) return -1;
        
        Node temp = head;
        int count = 0;
        while (count != index) {
            temp = temp.next;
            count++;
        }
        return temp.val;
    }

   
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size()) return;
        
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

  
    public void deleteAtIndex(int index) {
        int size = size();
        if (index < 0 || index >= size) return;
        
        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}
