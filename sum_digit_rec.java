public class sum_digit_rec { 
    public static int sd(int n){
        if(n==0){
            return 0;
        }
       return n%10 + sd(n/10);

    }
    public static void main(String[] args) {
        int num=1234;
        System.out.println(sd(num));
    }
}
