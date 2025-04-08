// class List{
//     class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int val){
//             data=val;
//             next=null;
//             prev=null;
//         }
//     }
//     Node head;
//     Node tail;
//     List(){
//         head=null;
//         tail=null;
//     }
//     public void insert(int val){
//         Node newNode=new Node(val);
//         if(head==null && tail==null){
//             head=newNode;
//             tail=newNode;
//         }else{
//             newNode.prev=tail;
//             tail.next=newNode;
//             tail=newNode;
//         }
//     }
//     public void view(){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
//     public void reverseView(){
//         Node curr=tail;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.prev;
//         }
//     }
// }
// class DoublyLinkedList{
//     public static void main(String[] args) {
//         List l=new List();
//         l.insert(1);
//         l.insert(2);
//         l.insert(3);
//         l.insert(4);
//         l.insert(5);
//         l.view();
//         System.out.println();
//         l.reverseView();
//     }
// }