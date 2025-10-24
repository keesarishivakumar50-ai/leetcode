class Solution {
    public boolean isPalindrome(String s) {
      s=space(s);
      return Palindrome(s);
    }
    private String space(String str){
        String s="";
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))) s+=str.charAt(i);
        }
        return s;
    }
    private boolean Palindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=(str.charAt(n-i-1))) return false;
        }
        return true;
    }
}