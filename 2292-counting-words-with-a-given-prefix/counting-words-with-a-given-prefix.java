class Solution {
    public int prefixCount(String[] words, String pref) {
      int count = 0;
      for(String word : words){
        if(word.length() >= pref.length()){
            String str = word.substring(0,pref.length());
            if(str.equals(pref)) count++;
        }
      }  
      return count;
    }
}