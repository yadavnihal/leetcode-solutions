class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        int n=grid.length;
        int dup=-1;
        int rem=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(!set.add(grid[i][j])){
dup=grid[i][j];
            }
            }            
        }
        for(int i=1;i<=n*n;i++){
            if(set.contains(i)==false){
                rem=i;
            }
        }
        return new int[]{dup,rem};
    }
}