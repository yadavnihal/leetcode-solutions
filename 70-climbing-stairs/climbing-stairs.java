class Solution {
    public int climbStairs(int n) {
        Stack<Integer> mystack = new Stack<>();
        mystack.push(1);
        mystack.push(1);
        for (int i = 2; i <= n; i++) {
            int num1 = mystack.pop();
            int num2 = mystack.pop();
            mystack.push(num1);
            mystack.push(num1 + num2);
        }
        return mystack.pop();
    }
}