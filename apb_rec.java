public class apb_rec {
    public static int apb(int a,int b){
        if(b==0){
            return 1;
        }
        return a* apb(a,b-1);
    }

    public static void main(String[] args) {
        System.out.print(apb(2,3));
    }
}
