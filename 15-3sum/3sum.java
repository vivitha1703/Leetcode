class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       List<List<Integer>> result = new ArrayList<>();
       for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        int num1 = nums[i];
        int left = i+1;
        int right = n-1;
        int complement = 0-num1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum == complement){
                List<Integer> triplet = new ArrayList<>();
                triplet.add(num1);
                triplet.add(nums[left]);
                triplet.add(nums[right]);
                result.add(triplet);
                while(left<right && nums[right] == nums[right-1]){
                    right--;
                }
                while(left<right && nums[left] == nums[left+1]){
                    left++;
                }
                left++;
                right--;
                //System.out.println(result);
            }
            else if(sum > complement){ 
                right--;
            }
            else if(sum < complement){
                left++;
            }
        }
       } 
       return result;
    }
}