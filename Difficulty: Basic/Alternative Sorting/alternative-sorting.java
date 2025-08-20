// User function Template for Java

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int index=0;
        
        int left=0,right=arr.length-1;
        while(left<=right){
            if(left!=right){
                list.add(arr[right--]);
                list.add(arr[left++]);
            }
            else {
                list.add(arr[left]);
                break;
            } 
            
        }
        
        return list;
    }
}
