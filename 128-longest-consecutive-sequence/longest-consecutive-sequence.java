class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return n;
        HashSet<Integer> set = new HashSet<>();
        int currLength = 1;
        int maxLength = 1;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                while(set.contains(num+1)){
                    currLength++;
                    num++;
                }
                maxLength = Math.max(maxLength,currLength);
                currLength = 1;
            }
        }
        return maxLength;
    }
}