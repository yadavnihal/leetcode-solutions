class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] arr=new int[26];
        int max=0;
        int maxf=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            arr[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,arr[s.charAt(r)-'A']);
            if(r-l+1-maxf>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}