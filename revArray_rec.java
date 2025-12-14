public class revArray_rec {
     public static void rev(int[] arr,int i,int j){
        if(i>j){
            return;
        }
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          rev(arr,i+1,j-1);

     }



    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        rev(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
