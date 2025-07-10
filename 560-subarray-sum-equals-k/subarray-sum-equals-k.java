class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix=0,result=0;
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            if(prefix==k){
                result++;
            }
            if(map.containsKey(prefix-k)){
                result += map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return result;
    }
}