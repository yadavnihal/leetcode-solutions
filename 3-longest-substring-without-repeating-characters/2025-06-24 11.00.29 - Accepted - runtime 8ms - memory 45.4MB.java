class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int left=0;
        String sb="";
        for(int right=0;right<s.length();right++){
            while(sb.contains(String.valueOf(s.charAt(right)))){
                left++;
                sb=s.substring(left,right);
            }
            sb=s.substring(left,right+1);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}