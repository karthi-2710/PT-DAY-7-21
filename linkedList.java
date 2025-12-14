class Node{
    int data;
    Node next;
    Node(int x){
       data=x;
       next=null;
    }
}
public class linkedList{
    public static void insertAtEnd(Node head, int x){
        Node newnode = new Node(x);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public static void insertAfterNode(Node head,int x,int d){
        Node newNode = new Node(x);
        Node temp=head;
        while(temp.data!=d){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void deleteNode(Node head,int x){
        Node temp=head;
        while(temp.next.data!=x){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public static Node deleteFirstNode(Node head){
        return head.next;
    }


    public static void printlist(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp

            
        );
    }    
    
    public static void main(String[] args) {
        Node n=new Node(5);
        insertAtEnd(n,10);
        insertAtEnd(n,2);
        insertAtEnd(n,6);
        insertAtEnd(n,60);
        printlist(n);
        
        
    }
}