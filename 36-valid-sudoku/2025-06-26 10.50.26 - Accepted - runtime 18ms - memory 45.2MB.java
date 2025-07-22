class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen =new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    String st="("+board[i][j]+")";
                    if(!seen.add(i+st) || !seen.add(st+j) || !seen.add(i/3 + st + j/3)) return false;
                }
            }
        }
        return true;
    }
}