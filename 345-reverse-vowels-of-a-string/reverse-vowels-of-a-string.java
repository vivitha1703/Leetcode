class Solution {
    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start=0,end=s.length()-1;
        int stChar,endChar;
        while(start<end){
            while(start<end && !isVowel(sb.charAt(start))){
                start++;
            }
            while(start<end && !isVowel(sb.charAt(end))){
                end--;
            }
            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
        return sb.toString();
    }
}