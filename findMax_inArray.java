public class findMax_inArray {
    public static int pa(int[] arr,int max,int l){
        if(l==0){
            return max;
        }
        
        if(max<arr[l-1]){
            max=arr[l-1];
            
        }
        return pa(arr,max,l-1);
         

    }
       
    public static void main(String[] args) {
        int[] arr={1,4,5,6,7,8,0,2};
       System.out.print(pa(arr,Integer.MIN_VALUE,arr.length));
    }
}
