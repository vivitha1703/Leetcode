class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramGroup= new HashMap<>();
        for(String str:strs){
            int[] freqArr = new int[26];
            for(char ch:str.toCharArray()){
                freqArr[ch-'a']++;
            }
            StringBuilder freqStringBuilder = new StringBuilder();
            for(int freq:freqArr){
                freqStringBuilder.append(freq).append("#");
            }
            String freqString = freqStringBuilder.toString();
            anagramGroup.putIfAbsent(freqString,new ArrayList<>());
            anagramGroup.get(freqString).add(str);
        }
        return new ArrayList<>(anagramGroup.values());
    }
}