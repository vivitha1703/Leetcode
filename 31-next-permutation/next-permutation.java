class Solution {
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void reverse(int[] nums,int s, int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                int left = i;
                for(int j=nums.length-1;j>=i;j--){
                    if(nums[j]>nums[i]){
                        int right = j;
                        swap(nums,left,right);
                        System.out.println(nums[left]);
                        reverse(nums,left+1,nums.length-1);
                        return;
                    }
                }
            }
        }  
        reverse(nums,0,nums.length-1);
        return;  
    }
}