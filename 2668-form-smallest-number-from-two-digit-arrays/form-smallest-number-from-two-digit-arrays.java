class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min=1000000,first_num,second_num;
         for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(nums1[i]<min){
                        min=nums1[i];
                    }
                }
                else{
                    first_num = nums1[i]*10+nums2[j];
                    second_num = nums2[j]*10+nums1[i];
                    min = first_num<min?first_num:min;
                    min = second_num<min?second_num:min;
                }
            }
         }   
         return min;
    }
}