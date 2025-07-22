class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas=0;
        int sumCost=0;
        for(int i=0;i<gas.length;i++){
            sumGas+=gas[i];
            sumCost+=cost[i];
        }
        if(sumGas<sumCost) return -1;
        int curr=0;
        int pos=0;
        for(int i=0;i<gas.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                pos=i+1;
            }
        }
        return pos;
    }
}