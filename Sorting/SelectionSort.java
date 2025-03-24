// package Sorting;

// import java.util.Arrays;

// public class SelectionSort {
//     static void sort(int[]arr){
//         for(int i=0;i<arr.length;i++){
//             int min_index=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[min_index]>arr[j]){
//                     min_index=j;
//                 }
//             }
//             int temp=arr[i];
//             arr[i]=arr[min_index];
//             arr[min_index]=temp;
//         }
//     }
//    public static void main(String[] args) {
//       int[]arr={1,4,6,2,3,5};
//       sort(arr);
//       System.out.println(Arrays.toString(arr));
//    } 
// }