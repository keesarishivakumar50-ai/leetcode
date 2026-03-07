class Solution {
    public String mergeAlternately(String word1, String word2) {
      boolean flag = true;
      int i = 0 , j = 0 , k = 0;
      String res = "";
      while(i < word1.length() && j < word2.length()){
        if(flag == true){
            res += word1.charAt(i);
            i++;
            flag = false;
        }
        else{
            res += word2.charAt(j);
            j++;
            flag = true;
        }
      }
      while(i < word1.length()) res += word1.charAt(i++);
      while(j < word2.length()) res += word2.charAt(j++);
      return res;
    }
}