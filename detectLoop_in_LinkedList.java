public class detectLoop_in_LinkedList {
    public boolean detectLoop(Node head) {
        // code here
        // HashSet<Node> hs=new HashSet<>();
        
        // Node temp=head;
        
        // while(temp!=null){
        //     if(!hs.contains(temp)){
        //         hs.add(temp);
        //         temp=temp.next;
        //     }else{
        //         return true;
        //     }
        // }
        
        // return false;
        
        if(head.next ==null){
            return false;
        }
        
        Node f=head,s=head;
        while(f!=null && f.next!=null){
           
            f=f.next.next;
            s=s.next;
            if(s==f){
                return true;
            }
        }
        
        return false;
        
        
    }
}
