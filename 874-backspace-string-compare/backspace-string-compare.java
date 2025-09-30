class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#' && sStack.empty()){
                continue;
            }
            else if(c=='#'){
                sStack.pop();
            }
            else{
                sStack.push(c);
            }
        }
        for(char c:t.toCharArray()){
            if(c=='#' && tStack.empty()){
                continue;
            }
            else if(c=='#'){
                tStack.pop();
            }
            else{
                tStack.push(c);
            }
        }
        System.out.println(sStack);
        System.out.println(tStack);
        while(!sStack.empty() && !tStack.empty()){
            if(sStack.pop()!=tStack.pop()){
                return false;
            }
        }
        if(!sStack.empty() || !tStack.empty()) return false;
        return true;
    }
}