public class printArray_rec {
    public static void printArray(int[] arr,int n){
        if(n==0){
            return;
        }
        
        printArray(arr,n-1);
        System.out.print(arr[n-1]+" ");
        
}
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        printArray(arr,arr.length);
    }
}
