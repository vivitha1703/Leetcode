class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        for(char ch='a';ch<='z';ch++){
            frequencyMap.put(ch,0);
        }
        for(char c:s.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!frequencyMap.containsKey(c)) return false;
            int count = frequencyMap.get(c)-1;
            if(count<0){
                return false;
            }
            frequencyMap.put(c,count);
        }
        return true;
    }
}