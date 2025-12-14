public class binarySearch_rec {
  public static int binsec(int[] arr,int i,int j,int t){
      
        if(i>j){
            return -1;
         }
        int mid=(i+j)/2; 

        if(arr[mid]==t){
            return mid;
        }
         if(arr[mid]<t){
            return binsec(arr,mid+1,j,t);

        }
        else{
            return binsec(arr,i,mid-1,t);
        }
        
}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int t=7;
        System.out.print(binsec(arr,0,arr.length-1,t));
    }
}
