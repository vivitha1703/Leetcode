class Solution {
    public void moveZeroes(int[] nums) {
        int left=0, i, n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
                nums[left++] = nums[i];
            }       
        }
        while(left<n){
            nums[left++] = 0;
        }
    }
}