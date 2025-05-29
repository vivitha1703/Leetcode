class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        placeQueen(result,board,0);
        return result;
    }
    public void placeQueen(List<List<String>> result, char[][] board, int row){
        int len = board.length;
        if(row==len){
            List<String> currBoard = new ArrayList<>();
            for(char[] r:board){
                currBoard.add(new String(r));
            }
            result.add(currBoard);
            return;
        }
        for(int col=0;col<len;col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                placeQueen(result,board,row+1);
                board[row][col] = '.';
            }
        }
    }
        public boolean isSafe(char[][] board, int row, int col){
            for(int i=0;i<row;i++){
                if(board[i][col]=='Q') return false;
            }
            for(int i=row,j=col; i>=0&&j>=0; i--,j--){
                if(board[i][j]=='Q') return false;
            }
            for(int i=row,j=col; i>=0&&j<board.length; i--,j++){
                if(board[i][j]=='Q') return false;
            }
            return true;
        }
}