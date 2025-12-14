public class findFirstNode_of_loopLinkedList {
     public int cycleStart(Node head) {
        // code here
       
         Node f=head,s=head;
        while(f!=null && f.next!=null){
           
            f=f.next.next;
            s=s.next;
            if(f==head){
            return f.data;
           }
            if(s==f){
                s=head;
                break;
            }
           
        
        }
        
        
         
        while(f!=null && f.next!=null){
           
            f=f.next;
            s=s.next;
            if(s==f){
                return s.data;
            }
        }
        
        
        return -1;
        
        
    }
}
