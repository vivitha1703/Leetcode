class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1,end=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            end = Math.max(end,piles[i]);
        }
        while(start<end){
            int mid = start+(end-start)/2;
            int sum = 0;
            for(int i=0;i<piles.length;i++){
                sum += (piles[i] + mid - 1) / mid;
            }
            System.out.println(sum+" "+mid+" "+start+" "+end);
            if(sum<=h){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}