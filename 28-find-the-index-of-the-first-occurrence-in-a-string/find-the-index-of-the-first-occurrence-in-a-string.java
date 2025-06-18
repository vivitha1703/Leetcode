class Solution {
    public int strStr(String haystack, String needle) {
        char[] string = haystack.toCharArray();
        char[]  pattern = needle.toCharArray();
        boolean found = false;
        int index=0;
        for(int i=0;i<string.length;i++){
            if(string[i]==pattern[0]){
                index=0;
                while(index<pattern.length && i+index<string.length && string[i+index]==pattern[index]){
                    index++;
                }           
                if(index==pattern.length) found=true;
                if(found){
                    return i;
                }  
            }
        }   
        return -1;    
    }
}