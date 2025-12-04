class Solution {
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder st=new StringBuilder(s);
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !isVowel(st.charAt(start))){
                start++;
            }
            while(start<end && !isVowel(st.charAt(end))){
                end--;
            }
            char k=st.charAt(start);
            st.setCharAt(start,st.charAt(end));
            st.setCharAt(end,k);

            start++;
            end--;
        }
        return st.toString();
    }
}