class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        HashMap<Character,Integer> map = new HashMap<>();
        int num=0,firstnum=0,secondnum=0,thirdnum=0;
        for(char c='a';c<='j';c++){
            map.put(c,num);
            num++;
        }
        for(char c:firstWord.toCharArray()){
            firstnum = firstnum*10+(map.get(c));
        }
        for(char c:secondWord.toCharArray()){
            secondnum = secondnum*10+(map.get(c));
        }
        for(char c:targetWord.toCharArray()){
            thirdnum = thirdnum*10+(map.get(c));
        }
        if(firstnum+secondnum==thirdnum){
            return true;
        }
        return false;
    }
}