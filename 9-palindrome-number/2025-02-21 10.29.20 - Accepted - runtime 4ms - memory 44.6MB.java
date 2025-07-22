class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int y=x;
        while(x>0){
            int num=x%10;
            sum=(sum*10)+num;
            x=x/10;
        }
        if(y==sum){
            return true;
        }
        
        return false;
    }
}