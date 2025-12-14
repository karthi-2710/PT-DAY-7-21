public class sort_0_1_2_LL {
     public Node segregate(Node head) {
        // code here
        Node temp=head,zero=new Node(0),one=new Node(0),two=new Node(0);
        Node t=zero,t1=one,t2=two;
        while(temp!=null){
            if(temp.data==0){
                t.next=temp;
                t=t.next;
            }else if(temp.data==1){
                t1.next=temp;
                t1=t1.next;
            }else{
                t2.next=temp;
                t2=t2.next;
            }
            temp=temp.next;
        }
        
        t.next=null;
        t1.next=null;
        t2.next=null;
        
        if(zero.next==null){
            t1.next=two.next;
            return one.next;
        }else if(one.next==null){
            t.next=two.next;
            return zero.next;
        }else if(two.next==null){
            t.next=one.next;
            return zero.next;
        }else{
            
             t.next=one.next;
             t1.next=two.next;
        }
        
                return zero.next;
                
    }
}
