class Solution {
    public String smallestPalindrome(String s) {
       String str = s.substring(0 , s.length() / 2);
       char[] ch = str.toCharArray();
       Arrays.sort(ch);
       String temp = new String(ch);
       StringBuilder res = new StringBuilder();
       res.append(temp);
       if((s.length() & 1) == 1){
        res.append(s.charAt(s.length() / 2));
       }
       res.append(new StringBuilder(temp).reverse());
       return res.toString();
    }
}