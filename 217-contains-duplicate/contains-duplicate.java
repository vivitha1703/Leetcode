class Solution {
    public boolean containsDuplicate(int[] nums) {
        int duplicateLength = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int noDuplicateLength = set.size();
        if(duplicateLength!=noDuplicateLength){
            return true;
        }
        return false;
    }
}