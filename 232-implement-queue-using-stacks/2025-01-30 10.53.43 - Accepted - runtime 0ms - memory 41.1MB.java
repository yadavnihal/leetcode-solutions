import java.util.Stack;

class MyQueue {
    static Stack<Integer> s ;;

    public MyQueue() {
         s = new Stack<>();
    }

    public void push(int x) {
        s.push(x);
    }

    public int pop() {
        if (s.isEmpty()) return -1;
        int top = s.pop();
        if (s.isEmpty()) return top;
        int last = pop();
        s.push(top);
        return last;
    }

    public int peek() {
        if (s.isEmpty()) return -1;
        int top = s.pop();
        if (s.isEmpty()) {
            s.push(top);
            return top;
        }
        int bottom = peek();
        s.push(top);
        return bottom;
    }

    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
