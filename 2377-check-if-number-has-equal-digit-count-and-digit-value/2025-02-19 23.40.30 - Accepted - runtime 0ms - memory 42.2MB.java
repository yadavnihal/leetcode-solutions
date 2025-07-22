class Solution {
    public boolean digitCount(String num) {
        for(int i=0;i<num.length();i++){
            int count =0;
            char c= (char) ('0' + i);
            for(int j=0;j<num.length();j++){
                if(num.charAt(j)==c) count++;
            }
            if((count)!=(num.charAt(i)-'0')) return false;

        }
        return true;
    }
}