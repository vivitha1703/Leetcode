class Solution {
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] arr) {
        int left=0,right=0;
        int len=arr.length;
        int i=len-2;

        while(i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if(i >= 0) {
            int j = len - 1;
            while(arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }

        reverse(arr,i+1,len-1);
    }
}