class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
        while(set.contains(s.charAt(i))){
        set.remove(s.charAt(l));
        l++;
        }
        set.add(s.charAt(i));
        max=Math.max(max,set.size());
        }
        return max;
    }

}