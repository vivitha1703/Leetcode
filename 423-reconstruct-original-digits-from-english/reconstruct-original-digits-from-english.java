class Solution {
    public String originalDigits(String s) {
        int freq[] = new int[26];
        StringBuilder result = new StringBuilder();
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }    
        int digit[] = new int[10];
        digit[0] = freq['z'-'a'];
        digit[2] = freq['w'-'a'];
        digit[4] = freq['u'-'a'];
        digit[6] = freq['x'-'a'];
        digit[8] = freq['g'-'a'];
        digit[3] = freq['h'-'a']-digit[8];
        digit[5] = freq['f'-'a']-digit[4];
        digit[7] = freq['s'-'a']-digit[6];
        digit[1] = freq['o'-'a']-digit[0]-digit[2]-digit[4];
        digit[9] = freq['i'-'a']-digit[5]-digit[6]-digit[8];
        for(int i=0;i<10;i++){
            while(digit[i]-->0){
                result.append(i);
            }
        }
        return result.toString();
    }
}