public class uniquePath_InGrid_rec {
    public static int tp(int i,int j,int m,int n){
       if(i==n || j==m){
                return 0;
    }
    if(i==m-1 && j==n-1){
        return 1;
    }
    return tp(i,j+1,n,m) + tp(i+1,j,n,m);


}
public static int mop(int m,int n) {
    return tp(0,0,m,n);
}
public static void main(String[] args) {
    int n=mop(4,4);
    System.out.println(n);
}
}
