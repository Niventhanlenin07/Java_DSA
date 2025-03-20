//Stack using Array 
// import java.util.Stack;
// class stackArray<T>{
//     T[] arr=(T[])new Object[10];
//     int i=-1;
//     public void add(T val){
//         if(i==9){
//             throw new ArrayIndexOutOfBoundsException("Array is full");
//         }
//         arr[++i]=val;
//     }
//     public void pop(){
//         System.out.println(arr[i--]);
//     }
//     public void view(){
//         for(int j=0;j<=i;j++){
//             System.out.print(arr[j]+" ");
//         }
//         System.out.println();
//     }
// }
// public class stack {
//     public static void main(String[] args) {
//         stackArray<Integer>s=new stackArray<Integer>();
//         s.add(1);
//         s.add(2);
//         s.add(3);
//         s.add(4);
//         s.add(5);
//         s.add(6);
//         s.pop();
//         s.pop();
//         s.pop();
//         s.pop();
//         s.view();
//     }
// }

//Stack using LinkedList
// class stackList{
//     Node top;
//     class Node{
//         int data;
//         Node next;
//         Node(int val){
//             data=val;
//             next=null;
//         }
//     }
//     stackList(){
//         top=null;
//     }
//     public void push(int val){
//         Node n=new Node(val);
//         n.next=top;
//         top=n;
//     }
//     public void pop(){
//         if(top==null){
//             throw new NullPointerException("Stack is empty");
//         }
//         int temp=top.data;
//         System.out.println(temp);
//         top=top.next;
        
//     }
// }
// class stack{
//     public static void main(String[] args) {
//         stackList s=new stackList();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.pop();
//         s.pop();
//         s.pop();
//         s.pop();
//         s.pop();
//         s.pop();
//         s.pop();
//     }
// }