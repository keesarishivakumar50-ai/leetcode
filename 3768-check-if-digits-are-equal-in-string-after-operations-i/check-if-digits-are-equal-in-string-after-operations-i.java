class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            StringBuilder str=new StringBuilder();
            for(int i=1;i<s.length();i++){
                int sum=(Character.getNumericValue(s.charAt(i-1))+Character.getNumericValue(s.charAt(i)))%10;
                str.append(sum);
            }
            s=str.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}