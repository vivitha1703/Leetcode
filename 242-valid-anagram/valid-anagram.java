class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> letterMap = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(char ch='a';ch<='z';ch++){
            letterMap.put(ch,0);
        }
        for(char c:s.toCharArray()){
            letterMap.put(c,letterMap.get(c)+1);
        }
        for(char c:t.toCharArray()){
            letterMap.put(c,letterMap.get(c)-1);
            if(letterMap.get(c)<0){
                return false;
            }
        }
        return true;
    }
}