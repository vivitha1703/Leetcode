class Solution {
    public void isWater(char[][] grid, int row, int col){
        int rLen = grid.length;
        int cLen = grid[0].length;
        if(row<0 || row>=rLen || col<0 || col>=cLen || grid[row][col]=='0'){
            return;
        }
        if(grid[row][col]=='1'){
            grid[row][col]=0;
            isWater(grid,row+1,col);
            isWater(grid,row-1,col);
            isWater(grid,row,col+1);
            isWater(grid,row,col-1);
        }
    } 
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    isWater(grid,i,j);
                }
            }
        }
        return count;
    }
}