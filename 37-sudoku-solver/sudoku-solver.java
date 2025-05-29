class Solution {
    public void solveSudoku(char[][] board) {
        placeNumbers(board);
    }
    public boolean placeNumbers(char[][] board){
        int len = board.length;
        for(int row=0;row<len;row++){
            for(int col=0;col<len;col++){
                if(board[row][col]=='.'){
                    for(char num='1';num<='9';num++){
                        if(isSafe(board,row,col,num)){
                            board[row][col] = num;
                            if(placeNumbers(board)==true){
                                return true;
                            }else{
                                board[row][col] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }  
        return true;  
    }
    public boolean isSafe(char[][] board, int row, int col, char num){
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
            if(board[row][i]==num) return false;
            if(board[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==num) return false;
        }
        return true;
    }
}