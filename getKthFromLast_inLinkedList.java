public class getKthFromLast_inLinkedList {
     int getKthFromLast(Node head, int k) {
        // Your code here
        Node f=head;
        for(int i=0;i<k-1;i++){
            f=f.next;
            if(f==null){
            return -1;
        }
        }
        
       
          Node s=head;
            while(f!=null && f.next !=null){
                f=f.next;
                s=s.next;
     
            }
        return s.data;
        
        
        
    }
}
