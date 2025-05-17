class Solution {
    public void backTrack(int[] arr, int target, int start, List<Integer> curr, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(target<arr[i]){
                break;
            }
            curr.add(arr[i]);
            backTrack(arr,target-arr[i],i,curr,result);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backTrack(candidates,target,0,new ArrayList(),result);
        return result;
        
    }
}