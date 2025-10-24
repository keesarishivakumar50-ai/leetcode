class Solution {
    public boolean squareIsWhite(String coordinates) {
       int n=(int)coordinates.charAt(1);
       char ch=coordinates.charAt(0);
       if(n%2==0){ 
        if(ch=='a' || ch=='c'|| ch=='e'|| ch=='g') return true;
        else return false;
       }
       else{
        if(ch=='b' || ch=='d'|| ch=='f'|| ch=='h') return true;
        else return false;
       }
    }
}