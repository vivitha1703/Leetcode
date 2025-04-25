class Solution {
    public int longest(String str,int k){
        if(str.length()==0){
            return 0;
        }
        int[] freq = new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<str.length();i++){
            int start=0;
            if(freq[str.charAt(i)-'a']<k){
                int left = longest(str.substring(0,i),k);
                int right = longest(str.substring(i+1,str.length()),k);
                return Math.max(left,right);
            }
        }
        return str.length();
    }
    public int longestSubstring(String s, int k) {
            return longest(s,k);
    }
}