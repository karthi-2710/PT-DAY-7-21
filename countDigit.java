public class countDigit {
    public static int cd(int n){
        if(n==0){
            return 0;
        }
        return 1+cd(n/10);
    }
    public static void main(String[] args) {
        int num=1232344;
        System.out.print(cd(num));
    }
}
