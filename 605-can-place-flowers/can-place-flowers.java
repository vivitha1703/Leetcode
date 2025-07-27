class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0,i=1;
        int len = flowerbed.length;
        if(len==1 && flowerbed[0]==0){
            count++;
        }
        if(len>=2 && flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            count++;
        }
        while(i<len-1){
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                count++;
                flowerbed[i]=1;
            }
            i++;
        }
        if(len>=2 && flowerbed[len-1]==0 && flowerbed[len-2]==0){
            flowerbed[len-1]=1;
            count++;
        }
        System.out.println(count);
        return count>=n;
    }
}