class Solution {
    public int lengthOfLastWord(String s) {
        String s2=s.trim();
        int n= s2.length()-1;
        int i=0;
        while(n>=0 && s2.charAt(n)!=' '){
            n--;
            i++;
        }
        return i;
    }
}