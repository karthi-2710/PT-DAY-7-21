public class mathtable_in_recursion {
    public static void mt(int n,int i,int j){
        if(j<i){
            return;
        }
        mt(n,i,j-1);
        System.out.println((n +" * "+j+" = "+(n*j)));
    }

    public static void main(String[] args) {
        mt(5,1,5);
    }
}
