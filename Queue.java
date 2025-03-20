//Queue using Array
// class queueArray{
//     int[]arr=new int[20];
//     int front=-1,rear=-1;
//     void enqueue(int val){
//         if(front==-1){
//             front=0;
//         }
//         arr[++rear]=val;
//     }
//     void dequeue(){
//         System.out.println(arr[front++]);
//     }
//     void peek(){
//         System.out.println(arr[front]);
//     }
//     void display(){
//         for(int i=front;i<=rear;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
// public class Queue {
//     public static void main(String[] args) {
//         queueArray q=new queueArray();
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         q.enqueue(4);
//         q.peek();
//         q.dequeue();
//         q.peek();
//         q.display();
//     }
// }
// Queue using LinkedList
// class queueList{
//     Node front;
//     Node rear;
//     class Node{
//         int data;
//         Node next;
//         Node(int val){
//             data=val;
//             next=null;
//         }
//     }
//     queueList(){
//         front=null;
//         rear=null;
//     }
//     void enqueue(int val){
//         Node n=new Node(val);
//         if(front==null){
//             front=n;
//             rear=n;
//         }
//         else{
//             rear.next=n;
//             rear=n;
//         }
        
//     }
//     void dequeue(){
//         if(front==null){
//             throw new NullPointerException("Queue is empty");
//         }else{
//             Node temp=front;
//             front=front.next;
//             System.out.println(temp.data);
//         }
//         if(front==null){
//             rear=null;
//         }
//     }
//     void display(){
//         Node curr=front;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//     }
// }
// class Queue{
//     public static void main(String[] args) {
//         queueList q=new queueList();
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         q.enqueue(4);
//         q.dequeue();
//         q.dequeue();
//         q.dequeue();
//         q.dequeue();
//         if (q.front == null && q.rear == null) {
//             System.out.println("Queue is empty.");
//         } else {
//             System.out.println("Queue is not empty.");
//         }        
//         q.display();
//     }
// }