class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0,curr=0,max=0,i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                curr = i-left;
                max = Math.max(curr,max);
                left=i+1;
            }
        }   
        curr = i-left;
        max = Math.max(curr,max);
        return max;
    }
}