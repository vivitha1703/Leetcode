class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowel_map = new HashMap<>();
        HashMap<Character,Integer> cons_map = new HashMap<>();
        int vmax=0,cmax=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowel_map.put(c,vowel_map.getOrDefault(c,0)+1);
            }
            else {
                cons_map.put(c,cons_map.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:vowel_map.entrySet()){
            if(entry.getValue()>vmax){
                vmax = entry.getValue();
            }
        }
        for(Map.Entry<Character,Integer> entry:cons_map.entrySet()){
            if(entry.getValue()>cmax){
                cmax = entry.getValue();
            }
        }
        return vmax+cmax;
        
    }
}