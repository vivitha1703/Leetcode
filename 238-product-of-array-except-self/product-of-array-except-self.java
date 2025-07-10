class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        int[] result = new int[len];
        prefix[0]=1;
        suffix[len-1]=1;
        for(int i=1;i<len;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
            suffix[len-i-1] = suffix[len-i]*nums[len-i]; 
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        for(int i=0;i<len;i++){
            result[i] = prefix[i]*suffix[i];
        }
        return result;
    }
}