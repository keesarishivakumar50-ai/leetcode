class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return Value(firstWord)+Value(secondWord)==Value(targetWord);
    }
    private int Value(String str){
        int num=0;
        for(char ch:str.toCharArray()){
            num=num*10+(ch-'a');
        }
        return num;
    }
}