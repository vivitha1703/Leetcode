class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0 || n==1) return n;
        if(n==2 && nums[0]==nums[1]) return 1;
        int currLength=1, maxLength=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]-1) {
                currLength++;
            } else if(nums[i]==nums[i+1]) {
                continue;
            } else {
                maxLength = Math.max(currLength,maxLength);
                currLength=1;
            }
        }
        // if(nums[n-2]==nums[n-1]-1){
             maxLength = Math.max(currLength,maxLength);
        // }
        return maxLength;
    }
}