class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        StringBuilder result = new StringBuilder();
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        System.out.println(Arrays.toString(freq));
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(visited[c-'a']==true){
                freq[c-'a']--;
                continue;
            }
            if(stack.isEmpty() || stack.peek()<c){
                if(visited[c-'a']==false){
                    System.out.println("if:"+c);
                    stack.push(c);
                    visited[c-'a'] = true;
                }
                    freq[c-'a']--;
            }
            else{
                System.out.println("else:"+c);
                int index = i-1;
                while((!stack.isEmpty()) && (stack.peek()>c) && (freq[stack.peek()-'a']>0)){
                    visited[stack.peek()-'a'] = false;
                    index--;
                    stack.pop();
                }
                visited[c-'a'] = true;
                freq[c-'a']--;
                stack.push(c);
            }
            System.out.println(Arrays.toString(visited));
            System.out.println(Arrays.toString(freq));
            System.out.println(stack);
            System.out.println("----------------------------------------------------");
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}