public class intersection_in_SortedTwoLinkedList {
     public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node hd=new Node(0);
        Node t=hd;
        Node t1=head1;
        Node t2=head2;
        
        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                t1=t1.next;
            }else if(t1.data>t2.data){
                t2=t2.next;
            }else{
                Node newNode=new Node(t1.data);
                t.next=newNode;
                t=t.next;
                t1=t1.next;
                t2=t2.next;
            }
            
        }
        
        return hd.next;
        
        
    }
}
