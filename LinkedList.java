class List{
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    Node head;
    Node curr;
    List(){
        head=null;
    }
    void insertEnd(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            curr=head;
        }else{
            curr.next=newNode;
            curr=newNode;
        }
    }
    void insertAtBegin(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    void insertAtPos(int val,int pos){
        Node newNode=new Node(val);
        if(pos==0){
            insertAtBegin(val);
        }
        else{
            Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        }
    }
    void deleteAtPos(int pos){
        Node temp=head;
        Node prev=null;
        if(pos==0){
            head=head.next;
        }
        else{
            for(int i=1;i<=pos;i++){
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
        }
    }
    void view(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
public class LinkedList {
  public static void main(String[] args) {
    List l=new List();
    l.insertEnd(1);
    l.insertEnd(2);
    l.insertEnd(3);
    l.insertEnd(4);
    l.insertEnd(5);
    l.insertEnd(6);
    l.insertAtBegin(0);
    l.insertAtBegin(-1);
    l.insertEnd(7);
    l.insertAtBegin(-2);
    l.insertAtBegin(-3);
    l.insertAtBegin(-4);
    l.insertAtBegin(-5);
    l.insertAtBegin(-6);
    l.insertAtBegin(-7);
    l.deleteAtPos(0);
    l.deleteAtPos(1);
    l.view();
  }  
} 