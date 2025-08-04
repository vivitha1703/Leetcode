class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,avg,max_avg=Double.NEGATIVE_INFINITY;
        int j=0;
        while(j<k){
            sum += nums[j];
            j++;
        } 
        avg = sum/k;
        max_avg = Math.max(max_avg,avg);   

        for(int i=k;i<nums.length;i++){
            sum -= nums[i-k];
            sum += nums[i];
            avg = sum/k;
            max_avg = Math.max(max_avg,avg); 
        }
        return max_avg;
    }
}