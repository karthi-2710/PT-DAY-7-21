public class recursion_sumofNNum {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
       
        int k=0;
        if(n%2==0){
            k=n;}
            System.out.print(k+" ");
        return k+sum(n-1); 
    }

    public static void main(String[] args) {
        int sum=sum(5);
        System.out.println(sum);
    }
}
