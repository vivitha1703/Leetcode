class Solution {
    public int romanToInt(String s) {
        int values[] = new int[256];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;
        char[] romans = s.toCharArray(); 
        int curr=values[romans[0]],prev=0;
        int result = curr;

        for(int i=1;i<s.length();i++){
            prev = curr;
            curr = values[romans[i]];
            if(curr>prev){
                curr = curr-prev;
                result -= prev;
            }
            System.out.println("curr : "+curr);
            System.out.println("result : "+result);
            result += curr;
        }
        return result;
    }
}