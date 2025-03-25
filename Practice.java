// import java.util.ArrayList;
// class Student{ 
//     String Name;
//     int Age;
//     Student(String name,int age){
//         this.Name=name;
//         this.Age=age;
//     }
// }
// class Parents{
//     String Name;
//     int Age;
//     Parents(String name,int age){
//         this.Name=name;
//         this.Age=age;
//     }
// }
// class Practice{
//     public static void main(String[] args) {
//       ArrayList mylist=new ArrayList();
//       mylist.add(new Student("Niventhan",21));
//       mylist.add(new Student("Abinaya", 22));
//       mylist.add(new Student("Prabhu kumar", 25));
//       mylist.add(new Student("Kamaraj", 28));
//       mylist.add(new Parents("Lenin", 49));
//       for(int i=0;i<mylist.size();i++){
//         Object obj=mylist.get(i);
//         if(obj instanceof Student){
//             Student s=(Student)mylist.get(i);
//             System.out.println("Name : "+s.Name);
//             System.out.println("Age : "+s.Age);
//             System.out.println();
//           }
//       else if(obj instanceof Parents){
//         Parents p=(Parents)mylist.get(i);
//         System.out.println("Name : "+p.Name);
//         System.out.println("Age : "+p.Age);
//         System.out.println();
//       }
//     }
//     }
// }

// import java.util.Arrays;
// class Student{ 
//         String Name;
//         int Age;
//         Student(String name,int age){
//             this.Name=name;
//             this.Age=age;
//         }
//     }
// class Practice{
//     public static void main(String[] args) {
//        Student[]s=new Student[5];
//        s[0]=new Student("Niventhan", 21);
//        for(Student i:s){
//         if(i==null){
//             throw new NullPointerException("No elements are there");
//         }else{
//             System.out.println(i.Name+" "+i.Age);
//         }
//        }
//     }
// }
//import java.util.*;
// class Student{ 
//     String Name;
//     int Age;
//     Student(String name,int age){
//         this.Name=name;
//         this.Age=age;
//     }
//     public String toString(){
//         return Name+" "+Age;
//     }
// }
// class Practice{
//         public static void main(String[] args) {
//           ArrayList mylist=new ArrayList();
//           mylist.add(new Student("Niventhan",21));
//           mylist.add(new Student("Abinaya", 22));
//           mylist.add(new Student("Prabhu kumar", 25));
//           mylist.add(new Student("Kamaraj", 28));
//           for(Object obj:mylist){
//             System.out.println(obj.toString());
//           }
//         }
//     } 

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

// class Practice{
//     public static void main(String[] args) {
//         Integer[]arr={1,2,3,5,6,7,9,8,4};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//         List<Integer>l=Arrays.asList(arr);
//         Collections.reverse(l);
//         System.out.println(l.toString());
//     }
// }

// import java.util.Arrays;

// class practice{
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,5,6};
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             int temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             end--;
//             start++;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }
