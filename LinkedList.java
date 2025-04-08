// class List{
//     class Node{
//         int data;
//         Node next;
//         Node(int val){
//             data=val;
//             next=null;
//         }
//     }
//     Node head;
//     Node curr;
//     Node prev;
//     List(){
//         head=null;
//     }
//     void insertEnd(int val){
//         Node newNode=new Node(val);
//         if(head==null){
//             head=newNode;
//             curr=head;
//         }else{
//             curr.next=newNode;
//             curr=newNode;
//         }
//     }
//     void insertAtBegin(int val){
//         Node newNode=new Node(val);
//         if(head==null){
//             head=newNode;
//         }else{
//             newNode.next=head;
//             head=newNode;
//         }
//     }
//     void insertAtPos(int val,int pos){
//         Node newNode=new Node(val);
//         if(pos==0){
//             insertAtBegin(val);
//         }
//         else{
//             Node temp=head;
//         for(int i=1;i<pos-1;i++){
//             temp=temp.next;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//         }
//     }
//     void deleteAtPos(int pos){
//         Node temp=head;
//         Node prev=null;
//         if(pos==0){
//             head=head.next;
//         }
//         else{
//             for(int i=1;i<=pos;i++){
//                 prev=temp;
//                 temp=temp.next;
//             }
//             prev.next=temp.next;
//         }
//     }
//     void update(int val,int pos){
//         Node curr=head; 
//         if(pos==0){
//             head.data=val;
//         }else{
//             for(int i=1;i<=pos;i++){
//                 curr=curr.next;
//             }
//             curr.data=val;
//         }
//     }
//     void get(int pos){
//         Node curr=head; 
//         if(pos==0){
//             System.out.println(curr.data);
//         }else{
//             for(int i=1;i<=pos;i++){
//                 curr=curr.next;
//             }
//             System.out.println("Position of "+pos+" is "+curr.data);
//         }
//     }
//     void search(int val){
//         int i=0;
//         StringBuilder sb=new StringBuilder();
//         Node curr=head;
//         while(curr!=null){
//             if(curr.data==val){
//                 sb.append(i+" ");
//             }
//             curr=curr.next;
//             i++;
//         }
//         if(sb.isEmpty()){
//             System.out.println("Not match");
//         }else{
//             System.out.println("Position : "+sb.toString());
//         }

//     }
//     void contains(int val){
//         int i=0;
//         StringBuilder sb=new StringBuilder();
//         Node curr=head;
//         while(curr!=null){
//             if(curr.data==val){
//                 sb.append(i+" ");
//             }
//             curr=curr.next;
//             i++;
//         }
//         if(sb.isEmpty()){
//             System.out.println("False");
//         }else{
//             System.out.println("True");
//         }

//     }
//     public void reversed(){
//         Node curr=head;
//         prev=null;
//         Node next=head.next;
//         while(curr!=null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//     }
//     void view(){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }
// public class LinkedList {
//   public static void main(String[] args) {
//     List l=new List();
//     l.insertEnd(1);
//     l.insertEnd(2);
//     l.insertEnd(3);
//     l.insertEnd(4);
//     l.insertEnd(5);
//     l.insertEnd(6);
//     l.reversed();
//     l.view();
//   }  
// } 