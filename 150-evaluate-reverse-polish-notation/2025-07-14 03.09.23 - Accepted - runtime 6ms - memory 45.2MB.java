class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        if(tokens.length==1){
            return Integer.parseInt(tokens[0]);
        }
        for(int i=0;i<tokens.length;i++){

if(tokens[i].equals("+")){
    sum=st.pop()+st.pop();
    st.push(sum);
}
else if(tokens[i].equals("-")){
   int a=st.pop();
    int b=st.pop();
    sum=b-a;
    st.push(sum);
}
else if(tokens[i].equals("*")){
    sum=st.pop()*st.pop();
st.push(sum);
}
else if(tokens[i].equals("/")){
    int a=st.pop();
    int b=st.pop();
    sum=b/a;
st.push(sum);
}

else{
    st.push(Integer.parseInt(tokens[i]));
}
        }
        return st.pop();
    }
}