class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int l=s.lastIndexOf(" ");
        return s.length()-l-1;
    }
}