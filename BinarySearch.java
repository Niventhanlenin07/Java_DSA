// In binary search the array is ASC or DSEC order only it work.
// import java.util.*;
// public class BinarySearch{
//     static int search(int[]arr,int target){
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]>target){
//                 end=mid-1;
//             }else if(arr[mid]<target){
//                 start=mid+1;
//             }else{
//                 return 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int[]arr={1,2,3,4,5};
//         System.out.println("Enter the target");
//         int target=scan.nextInt();
//         System.out.println(search(arr,target));
//     }
// }