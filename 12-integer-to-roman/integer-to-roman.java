class Solution {
    public String intToRoman(int num) {
        String romans[] = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; 
        int values[] = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder result = new StringBuilder();
        while(num!=0){
            for(int i=0;i<values.length;i++){
                if(num>=values[i]){
                    result.append(romans[i]);
                    num = num-values[i];
                    break;
                }
            }
        }
        return result.toString();         
    }
}