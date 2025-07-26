class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split("\\s+");
        System.out.println(Arrays.toString(strArr));
        String result="";
        for(int i=strArr.length-1;i>=0;i--){
            result += strArr[i];
            if(i!=0){
                result += " ";
            }
        };
        return result.trim();        
    }
}