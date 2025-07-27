class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        ArrayList<Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }        
        return result;
    }
}