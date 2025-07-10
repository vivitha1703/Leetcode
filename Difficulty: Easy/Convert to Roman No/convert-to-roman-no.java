class Solution {
    String convertToRoman(int num) {
        int[] values = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romans = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String result="";
        while(num!=0){
            for(int i=values.length-1;i>=0;i--){
                if(num>=values[i]){
                    result += romans[i];
                    num = num - values[i];
                    break;
                }
            }
        } 
        return result;
        
    }
}