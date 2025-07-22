class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)<=2){
                list.add(num);
            }
        }
        int i=0;
        for(int num:list){
            nums[i++] = num;
        }
        return list.size();
    }
}