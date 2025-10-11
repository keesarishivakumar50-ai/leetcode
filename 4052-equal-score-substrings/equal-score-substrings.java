class Solution {
    public boolean scoreBalance(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sum+=(int)ch-96;
        }
        
        int a=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            a+=(int)ch-96;
            int b=sum-a;
            if(a==b) return true;
        }
        return false;
    }
}