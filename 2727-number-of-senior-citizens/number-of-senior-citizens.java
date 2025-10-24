class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++){
            int ch=details[i].charAt(11)-'0';
            int ag=details[i].charAt(12)-'0';
            int age=(ch*10)+ag;
            if(age>60) c++;
        }
        return c;
    }
}