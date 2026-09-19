class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        int max=prices[prices.length-1];
        for(int i=prices.length-1;i>=0;i--){
            p=Math.max(p,max-prices[i]);
            max=Math.max(max,prices[i]);

        }
        return p;
    }
}