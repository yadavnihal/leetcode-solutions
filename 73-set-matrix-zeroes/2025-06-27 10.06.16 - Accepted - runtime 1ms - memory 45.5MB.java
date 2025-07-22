class Solution {
    public void setZeroes(int[][] mat) {
        int m =mat.length;
        int n=mat[0].length;
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<row.size();i++){
            int curr=row.get(i);
            for(int j=0;j<n;j++){
                mat[curr][j]=0;
            }
        }
        for(int i=0;i<col.size();i++){
            int curr2=col.get(i);
            for(int j=0;j<m;j++){
                mat[j][curr2]=0;
            }
        }
    }
}