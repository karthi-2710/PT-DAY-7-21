public class linsec_recfrontTracking {
   
    public static int linsec(int[] arr,int l,int t){
      
        if(l==0){
            return -1;
         }

        

         if(arr[l-1]==t){
             return l-1;
         }
     return linsec(arr,l-1,t);
        
}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int t=7;
        System.out.print(linsec(arr,arr.length,t));
    }
}


