class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(visited[arr[i]-1]==true) result.add(arr[i]);
           visited[arr[i]-1] = true;           
        }
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                result.add(i+1);
            }
        }
        return result;
    }
}
