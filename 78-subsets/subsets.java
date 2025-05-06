class Solution { 
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        outer.add(inner);
        int len = nums.length;
        for(int i=0;i<len;i++){
            int size = outer.size();
            for(int j=0;j<size;j++){
                inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}