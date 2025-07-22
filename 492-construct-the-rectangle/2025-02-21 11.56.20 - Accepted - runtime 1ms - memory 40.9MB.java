class Solution {
    public int[] constructRectangle(int n) {
        int[] arr=new int[2];
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                arr[1]=i;
                arr[0]=n/i;
            }
        }
        return arr;
    }
}