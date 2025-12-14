public class twoStack_using_array {
   
     int[] arr =new int[100];
     int t1=-1;
     int t2=100;
    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(t1+1<t2){
            t1++;
            arr[t1]=x;
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        
        // code here
        
        if(t1+1<t2){
            t2--;
            arr[t2]=x;
        }
    }

     
    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
        if(t1>=0){
            return arr[t1--];
        }
        return -1;
        
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
         if(t2<arr.length){
            return arr[t2++];
        }
        return -1;
    }
}
