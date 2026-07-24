class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
        int left = 0;
        int right = length-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;
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