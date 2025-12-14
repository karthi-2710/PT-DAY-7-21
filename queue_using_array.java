public class queue_using_array {
      int arr[];
      int r;
      int f;


    public queue_using_array(int n){
         arr=new int[n];
         r=-1;
         f=0;
    }  

   public void offer(int n){
    if(r!=arr.length){
        r++;
        arr[r]=n;
    }else{
        System.out.println("queue overflow");    
    }
   }
 
   public int size(){
    return r-f+1;
   }
   public boolean isEmpty(){
     return (r<f);
   }

   public int peek(){
    if(!isEmpty()){
       return arr[f];
   }
   return -1;
   }


   public void poll(){
    if(!isEmpty()){
        f++;
    }else{
        System.out.println("queue underflow");
    }
   }



    public static void main(String[] args) {
        queue_using_array q=new queue_using_array(5);
         q.offer(8);
         q.offer(9);
         q.offer(3);
         q.offer(4);

       System.out.println(q.peek());
       q.poll();


       
       System.out.println(q.isEmpty()); 
       System.out.println(q.peek()); 

    }
}
