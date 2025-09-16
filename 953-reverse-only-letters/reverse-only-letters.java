class Solution {
    public String reverseOnlyLetters(String s) {
        char[] strArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c:strArr){
            if(Character.isLetter(c)){
                stack.push(c);
            }
        }    
        for(int i=0;i<strArr.length;i++){
            if(Character.isLetter(strArr[i])){
                strArr[i] = stack.pop();
            }
            sb.append(strArr[i]);
        }
        return sb.toString();
    }
}