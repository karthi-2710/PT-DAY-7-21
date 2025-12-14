public class iscontainZero_rec {
    
    public static boolean iconz(int n){
        if(n==0){
            return false;
        }
        
        boolean c= iconz(n/10);
        if(n%10==0){
            return true;
        }
        return c;
    }
    public static void main(String[] args) {
        int num=1442506;
        System.out.println(iconz(num));
    }
}


