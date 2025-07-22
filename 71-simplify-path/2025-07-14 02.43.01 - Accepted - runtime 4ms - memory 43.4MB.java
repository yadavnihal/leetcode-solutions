class Solution {
    public String simplifyPath(String path) {
       
        Stack<String> st= new Stack<>();

        String[] l=path.split("/");
        for(int i=0;i<l.length;i++){
            if(!st.isEmpty() && l[i].equals("..")){
                
                st.pop();
            }
            else if(!l[i].equals(".") && !l[i].equals("") && !l[i].equals("..")){
            st.push(l[i]);
        }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.size();i++){
            sb.append("/"+st.get(i));
        }
        return  sb.length()==0 ? "/" :sb.toString();
    }
}