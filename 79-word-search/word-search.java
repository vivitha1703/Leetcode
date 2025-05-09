class Solution {
    public boolean search(char[][] board, char[] word, int index, int i, int j){
        if(index>=word.length){
            //System.out.println("index:"+index);
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word[index] || board[i][j]=='@'){
            return false;
        }
        char temp = board[i][j];
        //System.out.println("letter:"+temp+" i:"+i+" j:"+j+" index:"+index);
        board[i][j] = '@';
        boolean ans = (search(board,word,index+1,i+1,j)) ||
                      (search(board,word,index+1,i-1,j)) ||
                      (search(board,word,index+1,i,j+1)) ||
                      (search(board,word,index+1,i,j-1));
        board[i][j] = temp; 
        return ans;
    }
    public boolean exist(char[][] board, String wordStr) {
        char[] word = wordStr.toCharArray();
        int row = board.length;
        int col = board[0].length;
        int index=0;
        boolean result = false;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word[index]){
                    result = search(board,word,index,i,j);
                    if(result==true) return result;
                }
            }
        }
        return result;
    }
}