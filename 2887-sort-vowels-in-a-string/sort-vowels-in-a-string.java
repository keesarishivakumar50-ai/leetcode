class Solution {
    public String sortVowels(String s) {
       List<Character> vowel = new ArrayList<>();
       for(char ch : s.toCharArray()){
        if("AEIOUaeiou".indexOf(ch) != -1){
            vowel.add(ch);
        }
       } 
       Collections.sort(vowel);
       String res = "";
       int index = 0;
       for(char ch : s.toCharArray()){
        if("AEIOUaeiou".indexOf(ch) != -1){
            res += (vowel.get(index++));
        }
        else{
            res += ch;
        }
       }
       return res;
    }
}