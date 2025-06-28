class Solution {
    int majorityElement(int arr[]) {
        int maj = arr.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(map.get(num)>maj){
                return num;
            }
        }
        return -1;
    }
}