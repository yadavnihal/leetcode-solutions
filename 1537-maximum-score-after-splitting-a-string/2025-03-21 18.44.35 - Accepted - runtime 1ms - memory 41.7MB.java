class Solution {
    public int maxScore(String s) {
        int ms=0;
        int leftZeros=0;
        int totalOnes=0;
        
          for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }

        for(int i=0;i<s.length()-1;i++){
           if(s.charAt(i)=='0') leftZeros++;
           else totalOnes--;
            ms=Math.max(ms,leftZeros+totalOnes);
        }
        return ms;
    }
}