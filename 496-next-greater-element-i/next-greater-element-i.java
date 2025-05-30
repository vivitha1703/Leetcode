class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int max = -1;
            for(int j=nums2.length-1;nums2[j]!=nums1[i];j--){
                if(nums2[j] > nums1[i]){
                    max = nums2[j];
                }
            }
            result[i] = max;
        }
        return result;
    } 
}