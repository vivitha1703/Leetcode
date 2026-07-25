class Solution {
    public int countPoints(String rings) {
      HashMap<Integer, Set<Character>> ringMap = new HashMap<>();
      int count=0;
      for(int i=1;i<rings.length();i=i+2){
        char c = rings.charAt(i);
        if(Character.isDigit(c)){
            int index = Character.getNumericValue(c);
            if(ringMap.get(index)==null){
                HashSet<Character> set = new HashSet<>();
                ringMap.put(index,set);
            }
            ringMap.get(index).add(rings.charAt(i-1)); 
        }
      }  
      for(int num:ringMap.keySet()){
        Set<Character> set = ringMap.get(num);
        if(set.size()==3){
            count++; 
        }
      }
      return count;
    }
}