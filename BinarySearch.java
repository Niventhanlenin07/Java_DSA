// In binary search the array is ASC or DSEC order only it work.
// import java.util.*;
// public class BinarySearch{
//     static void search(int[]arr,int target){
//             int mid=arr.length/2;
//             if(arr[mid]>target){
//                 if(arr[mid]==arr[0]){
//                     System.out.println("Not match");
//                 }else{
//                     arr=Arrays.copyOfRange(arr,0,mid);
//                     search(arr, target);
//                 }
//             }else if(arr[mid]<target){
//                 if(arr[mid]==arr[arr.length-1]){
//                     System.out.println("Not match");
//                 }else{
//                     arr=Arrays.copyOfRange(arr,mid+1,arr.length);
//                     search(arr, target);
//                 }
//             }else{
//                 System.out.println("Match");
//             }
//     }
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int[]arr={1,2,3,4,5};
//         System.out.println("Enter the target");
//         int target=scan.nextInt();
//         search(arr,target);
//     }
// }