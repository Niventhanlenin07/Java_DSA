//import java.util.*;

// class Array{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
        // int size=scan.nextInt();
        // int[]arr=new int[size];
        // for (int i=0;i<size;i++){
        //     arr[i]=scan.nextInt();
        // }
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        // int row=scan.nextInt();
        // int col=scan.nextInt();
        // int[][]arr=new int[row][col];
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         arr[i][j]=scan.nextInt();
        //     }
        // }
        // for(int[]i:arr){
        //     for(int j:i){
        //         System.out.println(j);
        //     }
        // }
        // String s="Hello world";
        // char[]arr=new char[s.length()];
        // for(int i=0;i<s.length();i++){
        //     arr[i]=s.charAt(i);
        // }
        // String s1="";
        // for(char i:arr){
        //     s1=i+s1;
        // }
        // System.out.println(s1);
        // String s="Hello world";
        // char[]arr=s.toCharArray();
        // for(char i:arr){
        //     System.out.println(i);
        // }
        // Integer[]arr={1,4,2,5,3,6};
        // Integer[]arr1=Arrays.copyOf(arr, arr.length);
        // Arrays.sort(arr);
        // System.out.println(Arrays.compare(arr,arr1));
        // List<Integer>l=new ArrayList<>();
        // l=Arrays.asList(arr);
        // Object[]o=l.toArray();
        // for(Object i:o){
        //     Integer I=(Integer)i;
        //     System.out.println(I);
        // }
        //int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<i+1;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
//    }
//}

// class Array_creation{
//     int size=10;
//     int[]arr=new int[size];
//     int i=0;
//     public void add(int num){
//         if(i==size){
//             expand();
//         }
//         arr[i++]=num;
//     }
//     public void remove(int num){
//         for(int i=0;i<size;i++){
//             if(arr[i]==num){
//                 for(int j=i;j<size-1;j++){
//                     arr[j]=arr[j+1];
//                 }
//             }
//         }
//     }
//     public void insert(int num,int pos){
//         int[]arr1=Arrays.copyOf(arr,size);
//         arr[pos]=num;
//         for(int j=pos+1;j<size-1;j++){
//             arr[j]=arr1[j-1];
//         }
//     }
//     public void view(){
//         System.out.println(Arrays.toString(arr));
//     }
//     private void expand(){
//         size*=2;
//         arr = Arrays.copyOf(arr, size);
//     }
// }
// class Array{
//     public static void main(String[] args) {
//         Array_creation A=new Array_creation();
//         A.add(1);
//         A.add(2);
//         A.add(3);
//         A.add(4);
//         A.add(5);
//         A.add(6);
//         A.add(7);
//         A.add(8);
//         A.add(9);
//         A.add(10);
//         A.add(11);
//         A.view();
//     }
// }
// class Array_creation{
//     int size=10;
//     int[]arr=new int[size];
//     int i=0;
//     public void add(int num){
//         if(i==size){
//             expand();
//         }
//         arr[i++]=num;
//     }
//     public void remove(int num){
//         for(int i=0;i<size;i++){
//             if(arr[i]==num){
//                 for(int j=i;j<size-1;j++){
//                     arr[j]=arr[j+1];
//                 }
//             }
//         }
//     }
//     public void insert(int num,int pos){
//         int[]arr1=Arrays.copyOf(arr,size);
//         arr[pos]=num;
//         for(int j=pos+1;j<size-1;j++){
//             arr[j]=arr1[j-1];
//         }
//     }
//     public void view(){
//         System.out.println(Arrays.toString(arr));
//     }
//     private void expand(){
//         size*=2;
//         arr = Arrays.copyOf(arr, size);
//     }
// }
// class Array{
//     public static void main(String[] args) {
//         Array_creation A=new Array_creation();
//         A.add(1);
//         A.add(2);
//         A.add(3);
//         A.add(4);
//         A.add(5);
//         A.add(6);
//         A.add(7);
//         A.add(8);
//         A.add(9);
//         A.add(10);
//         A.add(11);
//         A.view();
//     }
// }

// import java.util.Arrays;

// class Array{
//     public static void main(String[] args) {
//         int[]arr={1,2,2,3};
//         int[]arr1={1,2,2,3};
//         System.out.println(arr.hashCode());
//         System.out.println(arr1.hashCode());
//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Vector;
// class Array{
    //public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr1 = {1, 2, 3, 4, 5};
        // if(Arrays.equals(arr,arr1)){
        //     System.out.println("True");
        // }else{
        //     System.out.println("False");
        // }
        // ArrayList<Integer>al=new ArrayList<>();
        // al.add(1);
        // al.add(2);
        // al.add(3);
        // al.add(4);
        // al.add(5);
        // System.out.println(al);
        // Vector<Integer>al=new Vector<Integer>();
        // al.add(1);
        // al.add(2);
        // al.add(3);
        // al.add(4);
        // al.add(5);
        // System.out.println(al);
    //}
//}

// import java.util.Arrays;
// import java.util.Scanner;
// class dynamicArray{
//     private int[]arr;
//     private int i;
//     private int capacity;
//     dynamicArray(int capacity){
//         this.capacity=capacity;
//         arr=new int[capacity];
//         i=0;
//     }
//     public void add(int number){
//         if(i==capacity){
//             expand();
//         }
//         arr[i++]=number;
//     }
//     public void insertEnd(int number){
//         arr[i]=number;
//     }
//     public void insert(int number,int pos){
//         int[]arr1=Arrays.copyOf(arr,capacity);
//         for(int i=pos;i<capacity-1;i++){
//             arr[i+1]=arr1[i];
//         }
//         arr[pos]=number;
//     }
//     public void delete(int pos){
//         for(int i=pos;i<capacity-1;i++){
//             arr[i]=arr[i+1];
//         }
//     }
//     public void view(){
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//     }
//     private void expand(){
//         capacity*=2;
//         arr=Arrays.copyOf(arr,capacity);
//     }
// }
// class Array{
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         dynamicArray list=new dynamicArray(10);
//         String result="""
//                 Press 1 for add element in Array
//                 Press 2 for insert element in end of the Array
//                 Press 3 for insert element in given position of the Array
//                 Press 4 for delete element in Array
//                 Press 5 for view the Array
//                 Press 6 for exit
//                 """;
//         boolean loop=true;
//         int number;
//         int pos;
//         while (loop) {
//             System.out.println("Enter the number");
//             int num=scan.nextInt();
//             switch (num) {
//                 case 1:
//                     number=scan.nextInt();
//                     list.add(number);
//                     break;
            
//                 case 2:
//                     number=scan.nextInt();
//                     list.insertEnd(number);
//                     break;
//                 case 3:
//                     number=scan.nextInt(); 
//                     pos=scan.nextInt();
//                     list.insert(number,pos);
//                     break;
//                 case 4:
//                     pos=scan.nextInt();
//                     list.delete(pos);
//                     break;
//                 case 5:
//                     list.view();
//                     break;    
//                 case 6:
//                     loop=false;
//                     break;    
//             }
//         }

//     }
// }