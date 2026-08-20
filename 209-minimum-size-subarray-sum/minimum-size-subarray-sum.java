class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0, right=0, currSum=0, minLength=Integer.MAX_VALUE;
        while(right<nums.length){
            currSum += nums[right];
            while(currSum>=target){
                //while(currSum==target){
                    System.out.println(currSum + " | "+nums[left]+" "+nums[right]);
                    minLength = Math.min(minLength, (right-left+1));
                    currSum -= nums[left];
                    left++;
                //}
                //currSum -= nums[left];
                //left++;
            }
            right++; 
        }   
        return minLength==Integer.MAX_VALUE?0:minLength; 
    }
}