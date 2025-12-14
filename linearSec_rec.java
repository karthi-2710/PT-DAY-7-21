public class linearSec_rec {
    public static int linsec(int[] arr,int l,int t){
      
        if(l==0){
            return -1;
         }

        int in=linsec(arr,l-1,t);

         if(arr[l-1]==t){
             in=l-1;
         }
       return in;
        
}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int t=7;
        System.out.print(linsec(arr,arr.length,t));
    }
}
