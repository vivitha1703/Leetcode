class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> s_map = new HashMap<>();
        Map<Character,Integer> t_map = new HashMap<>();
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        int value=0,sum=0;
        for(int i=0;i<s_arr.length;i++){
            s_map.put(s_arr[i],i);
        }
        for(int i=0;i<t_arr.length;i++){
            t_map.put(t_arr[i],i);
        }
        System.out.println(s_map);
        System.out.println(t_map);
        for(int i=0;i<s_arr.length;i++){
            value = s_map.get(s_arr[i]) - t_map.get(s_arr[i]);
            value = value<0?value*-1:value;
            sum += value;
        }
        return sum;
    }
}