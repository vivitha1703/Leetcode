class Solution {
    static int precedence(char ch){
        if(ch=='+' || ch=='-') return 1;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='^') return 3;
        return -1;
    }
    public static String infixToPostfix(String str) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for(char ch:str.toCharArray()){
           if((ch>='a' && ch<='z') || (ch>='A'&&ch<='Z') || (ch>='0'&&ch<='9')){
               result += ch;
           }
           else{
               if(ch==')'){
                   while(stack.peek()!='('){
                       result += stack.pop();
                   }
                   stack.pop();
               }
               else{
                   while(ch!='(' && !stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){
                       result += stack.pop();
                   }
                   stack.push(ch);
               }

           }
        //   System.out.println(stack);
        //   System.out.println(result);
        }
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}