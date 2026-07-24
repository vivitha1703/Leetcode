class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
        int left = 0;
        int right = length-1;
        while(left<length && right>=0 && left<right){
            while(left<length && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(right>=0 && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if(left>right){
                break;
            }
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if(leftChar != rightChar){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}