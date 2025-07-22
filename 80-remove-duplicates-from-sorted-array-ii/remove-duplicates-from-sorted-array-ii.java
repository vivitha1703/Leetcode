class Solution {
    public int removeDuplicates(int[] nums) {
        int next=2;
        for(int k=2;k<nums.length;k++){
            if(nums[k]!=nums[next-2]){
                nums[next] = nums[k];
                next++;
            }
        }
        return next;
    }
}