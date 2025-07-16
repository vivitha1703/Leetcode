class Solution {
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        System.out.println("Len:"+k);
        reverse(nums,0,len-k-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums,len-k,len-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums,0,len-1);
    }
}