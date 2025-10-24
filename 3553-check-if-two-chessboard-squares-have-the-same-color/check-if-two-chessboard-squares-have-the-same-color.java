class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String color1=color(coordinate1);
        String color2=color(coordinate2);
        return color1.equals(color2);
    }
    private String color(String coordinates){
        int n=(int)coordinates.charAt(1);
       char ch=coordinates.charAt(0);
       if(n%2==0){ 
        if(ch=='a' || ch=='c'|| ch=='e'|| ch=='g') return "white";
        else return "black";
       }
       else{
        if(ch=='b' || ch=='d'|| ch=='f'|| ch=='h') return "white";
        else return "black";
       }
    }
}