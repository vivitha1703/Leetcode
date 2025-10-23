class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] rows = new StringBuilder[numRows];
        if(numRows==1){
            return s;
        }
        for(int row=0;row<numRows;row++){
            rows[row] = new StringBuilder();
        }
        boolean goingDown=false;
        int currRow=0;
        for(char c:s.toCharArray()){
            rows[currRow].append(c);
            if(currRow==0 || currRow==numRows-1){
                goingDown = !goingDown;
            }
            currRow += goingDown?1:-1;
        }
        StringBuilder result = new StringBuilder();
        for(int row=0;row<numRows;row++){
            result.append(rows[row]);
        }
        return result.toString();
    }
}