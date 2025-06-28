// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        int[] arr = new int[]{2000,500,200,100,50,20,10,5,2,1};
        List<Integer> result = new ArrayList<>(); 
        while(N!=0){
            for(int i=0;i<arr.length;i++){
                if(N>=arr[i]){
                    result.add(arr[i]);
                    N -= arr[i];
                    break;
                }
            }    
        }
        return result;
    }
}