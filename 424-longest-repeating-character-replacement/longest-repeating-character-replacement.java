class Solution {
    public int characterReplacement(String s, int k) {
        
        // int[] arr=new int[26];
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int maxf=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            // arr[s.charAt(r)-'A']++;
        map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1) ;
            maxf=Math.max(maxf,map.getOrDefault(s.charAt(r),0));
            if(r-l+1-maxf>k){
                // arr[s.charAt(l)-'A']--;
        map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1); 

                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}