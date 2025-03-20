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