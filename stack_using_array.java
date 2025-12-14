public class stack_using_array {
    int top;
    int[] arr;
    public stack_using_array(int n){
          arr =new int[n];
          top =-1;
    }
   public void push(int a){
    if(top!=arr.length-1){
        top++;
        arr[top]=a;
    }else{
        System.out.println("stack overflow");
    }
   }
  public int peek(){
    if(top!=-1){
        return arr[top];
    
    }else{
        return -1;
    }
  }
  
 public boolean isEmpty(){
    return (top==-1);
 }

 public int size(){
    return top+1;
 }

 public void pop(){
    if(top==-1){
         System.out.println("stack underflow");
    }else{
       System.out.println();
        top--;
       
    }
    
 }

  public static void main(String[] args) {
      stack_using_array st=new stack_using_array(10);
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(4);
      st.pop();
      System.out.println(st.peek());
      System.out.println(st.isEmpty());
      st.pop();
      System.out.println(st.size());
    }


}


