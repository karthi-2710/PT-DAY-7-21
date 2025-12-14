public class removeloop_in_LL {
    public static void removeLoop(Node head) {
        Node fast=head,slow=head;
        while(true){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
            if(fast==null || fast.next==null){
               return ;
            }
        }
        if(fast==head){
            while(fast.next!=head){
                fast=fast.next;
            }
            fast.next=null;
            return ;
        }
        slow =head;
        while(slow.next!=fast.next){
            fast=fast.next;
            slow=slow.next;
        }
        fast.next=null;
        
        
    }
}
