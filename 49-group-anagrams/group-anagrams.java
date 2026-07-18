class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramGroup= new HashMap<>();
        for(String str:strs){
            int[] freqArr = new int[26];
            for(char ch:str.toCharArray()){
                freqArr[ch-'a'] += 1;
            }
            StringBuilder freqStringBuilder = new StringBuilder();
            for(int freq:freqArr){
                freqStringBuilder.append(freq).append("#");
            }
            String freqString = freqStringBuilder.toString();
            if(anagramGroup.containsKey(freqString)){
                anagramGroup.get(freqString).add(str);
            } else {
                List<String> group = new ArrayList<>();
                group.add(str);
                anagramGroup.put(freqString, group);
            }
        }
        List<List<String>> result = new ArrayList<>(anagramGroup.values());
        return result;
    }
}