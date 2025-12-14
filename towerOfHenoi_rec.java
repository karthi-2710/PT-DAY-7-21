public class towerOfHenoi_rec {
    static long moves=0;
public static void toh(int n,String s,String d,String h){
    if(n==0){
        return;
    }
    toh(n-1,s,h,d);
    moves++;
    toh(n-1,h,d,s);
}


public static void main(String[] args) {
    toh(100,"source","destination","helper");
    System.out.println(moves);
}
}