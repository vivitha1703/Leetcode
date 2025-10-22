class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] found = new boolean[256];
        int left=0,right=0,max=0;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(!found[ch]){
                found[ch]=true;
                max = Math.max(right-left+1,max);
                right++;
            }
            else{
                found[s.charAt(left)] = false;
                left++;
            }
        }
        return max;
    }
}