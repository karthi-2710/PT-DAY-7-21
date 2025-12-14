public class square_ofSorted_array {
     public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1;
        int[] arr=new int[nums.length];
        int k=0;
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                arr[k++]=nums[i]*nums[i];
                i++;
            }else{
                arr[k++]=nums[j]*nums[j];
                j--;
            }
        }
        for(int x=0,y=arr.length-1;x<arr.length && y>=0;x++,y--){
            nums[y]=arr[x];
        }
    
        return nums;
    }
}
