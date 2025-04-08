// class List{
//     class Node{
//         int data;
//         Node next;
//         Node(int val){
//             data=val;
//             next=null;
//         }
//     }
//     Node last;
//     List(){
//         last=null;
//     }
//     public void insert(int val){
//         Node newNode=new Node(val);
//         if(last==null){
//             newNode.next=newNode;
//             last=newNode;
//         }else{
//             newNode.next=last.next;
//             last.next=newNode;
//             last=newNode;
//         }
//     }
//     public void view(){
//         Node temp=last.next;
//         do{
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }while(temp!=last.next);
//     }
// }
// public class CircularLinkedList {
//     public static void main(String[] args) {
//         List l=new List();
//         l.insert(1);
//         l.insert(2);
//         l.insert(3);
//         l.insert(4);
//         l.insert(5);
//         l.view();
//     }
// }
