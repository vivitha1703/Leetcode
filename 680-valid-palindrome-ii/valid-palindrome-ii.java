class Solution {
    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int limit=1;
        int start=0,end=s.length()-1;
        while(start<end){
            System.out.println(s.charAt(start)+" "+s.charAt(end));
            if(s.charAt(start)!=s.charAt(end)){
                return isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1);
            }
           else{
                start++;
                end--;
           }
        }
        return true;
    }
}