class Solution {
    public boolean isHappy(int n) {
        int sum=n;
        int o=0;
    while(o!=9){
        o++;
        int temp=sum;
        int j=0;
        while(temp>0){
        int s=temp%10;
        j=s*s+j;
    temp=temp/10;


        }
        sum=j;
        if(j==1) return true;
    }
    return false;
    }
}