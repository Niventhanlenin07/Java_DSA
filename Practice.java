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