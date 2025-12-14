public class apb_efficient {
    public static int apb(int a,int b){
        if(b==0){
            return 1;
        }
        int k=apb(a,b/2);
        if(b%2==0){
            return k*k;
        }else{
            return a*k*k;
        }
    }
    public static void main(String[] args) {
        System.out.print(apb(2,3));
    }
}
