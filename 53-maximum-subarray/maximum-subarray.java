class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0], max = nums[0], res = nums[0];
        for(int i=1;i<nums.length;i++){
            curr += nums[i];
            curr = Math.max(nums[i],curr);
            res = Math.max(curr,res);
        }
        return res;
    }
}