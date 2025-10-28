// User function Template for Java

class Solution {
    int oddAndEven(String S) {
        int odd=0,even=0;
        char num[] = S.toCharArray();
        for(int i=0;i<S.length();i++){
            if(i%2==0){
                even += Character.getNumericValue(num[i]);
            }
            else{
                odd += Character.getNumericValue(num[i]);
            }
        }
        if(even==odd){
            return 1;
        }
        return 0;
    }
}