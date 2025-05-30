class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(search(board,word,i,j,0,visited)){
                    return true;
                }
            }
        }
    return false;    
    }
    public boolean search(char[][] board, String word, int row, int col, int index,  boolean[][] visited){
        if(index==word.length()){
            return true;
        }
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(index) || visited[row][col]){
            return false;
        }
        
        if(board[row][col]==word.charAt(index)){
            visited[row][col]=true;
            boolean left = search(board,word,row,col-1,index+1,visited);
            boolean right = search(board,word,row,col+1,index+1,visited);
            boolean top = search(board,word,row-1,col,index+1,visited);
            boolean bottom = search(board,word,row+1,col,index+1,visited);
            
            if(left || right || top || bottom){
                return true;
            }
            visited[row][col] = false;
        }
        return false;
    }
}