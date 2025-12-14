public class isPalindrome_rec {
    public static boolean palin(int[] arr,int i,int j){
        if(i>j){
            return true;
        }
          if(arr[i]!=arr[j]){
            return false;
          }
          return palin(arr,++i,--j);

     }



    public static void main(String[] args) {
        int[] arr={8,7,6,5,5,6,7,8};
       System.out.print(palin(arr,0,arr.length-1));
        
    }
}
