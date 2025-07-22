class Solution {

    private void permutations( int n, int[] nums,  List<List<Integer>> listOfPermutation, List<Integer> ds,boolean[] taken){

        //base case
        if(ds.size() == n){
            listOfPermutation.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0 ; i<n; i++){
            if(!taken[i]){
                ds.add(nums[i]);
                taken[i] = true;
                permutations(n,nums,listOfPermutation,ds,taken);
                taken[i] = false;
                ds.remove(ds.size()-1);
            }
        }

        

    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> permutationList = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] taken = new boolean[n];
        permutations(n,nums,permutationList,ds,taken);
        return permutationList;
        
    }
}