// package Sorting;

// import java.util.Arrays;

// public class BubbleSort {
//     static void sort(int[]arr){
//         for(int i=1;i<arr.length;i++){
//             boolean swapped=false;
//             for(int j=0;j<arr.length-1;j++){
//                 if(arr[j+1]<arr[j]){
//                     swapped=true;
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//             if(!swapped){
//                 System.out.println("Correct order in "+i+" step");
//                 break;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5};
//         sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }