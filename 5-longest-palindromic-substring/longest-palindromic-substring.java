class Solution {
    public boolean isPalindrome(int i, int j, String str){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int curr=0,max=0;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && isPalindrome(i,j,s)){
                    curr = Math.max(j-i+1,curr);
                    if(curr>max){
                        max = curr;
                        result = new StringBuilder();
                        for(int start=i;start<=j;start++){
                            result.append(s.charAt(start));
                        }            
                    }
                }
            }
        } 
        return result.toString();          
    }
}