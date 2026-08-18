class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, right=0, currCount=0, maxCount=0;
        boolean[] visited = new boolean[256];
        while(right<s.length()){
            char ch = s.charAt(right);
            while(visited[(int)ch]==true){
                visited[(int)s.charAt(left)] = false;
                left++;
            }
            maxCount = Math.max(maxCount,(right-left+1));
            visited[(int)ch] = true;
            right++;
        }
        return maxCount;
    }
}