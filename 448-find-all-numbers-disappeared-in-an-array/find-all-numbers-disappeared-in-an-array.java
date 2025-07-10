class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            set.add(num);
        }           
        for(int i=1;i<=len;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}