class Solution {
    public int maxScore(String s) {
        int ms=0;
        for(int i=0;i<s.length()-1;i++){
            int l=0;
            int r=0;
            for(int j=0;j<s.length();j++){
                if(j<=i && s.charAt(j)=='0') l++;
                if(j>i && s.charAt(j)=='1') r++;
            }
            ms=Math.max(ms,l+r);
        }
        return ms;
    }
}