class Solution {
    public int secondHighest(String s) {
        int firstMax = -1;
        int secondMax = -1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                if(digit > firstMax){
                    secondMax = firstMax;
                    firstMax = digit;
                }
                if(digit > secondMax && digit < firstMax){
                    secondMax = digit;
                }
            }
        }
        // if(secondMax==-1){
        //     secondMax = firstMax;
        // }
        return secondMax;
    }
}