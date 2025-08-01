class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }    
        for(int num:arr){
            set.add(map.get(num));
        }
        if(map.size()==set.size()){
            return true;
        }
        return false;
    }
}