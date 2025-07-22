class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split("\\s");
        int k=str[str.length-1].length();
        return k;
    }
}