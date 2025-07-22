class Solution {
    public int maxProfit(int[] arr) {
        int profitT=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
           int  profit=arr[i+1]-arr[i];
            profitT+=profit;
        }
        }
        return profitT;
    }
}