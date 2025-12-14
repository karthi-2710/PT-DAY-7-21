public class count_key_rec {
    public static int ckey(int n){
        if(n==0){
            return 0;
        }
        
        int c= ckey(n/10);
        if(n%10==4){
            c+=1; 
        }
        return c;
    }
    public static void main(String[] args) {
        int num=144256;
        System.out.println(ckey(num));
    }
}
