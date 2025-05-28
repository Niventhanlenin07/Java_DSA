import java.util.*;
class laptop{
    String Name;
    String Ram;
    int price;
    laptop(String Name,String Ram,int Price){
        this.Name=Name;
        this.Ram=Ram;
        this.price=Price;
    }
    public String toString(){
        return "["+Name+","+Ram+","+price+"]";
    }
}
class check implements Comparator<laptop>{
    public int compare(laptop l1,laptop l2){
        return l1.Name.compareTo(l2.Name);
    }
} 
public class hashMap {
    public static void main(String[] args) {
        List<laptop>l=Arrays.asList(new laptop("HP","12GB", 79999),
        new laptop("DELL","12GB",49999),
        new laptop("MAC BOOK","12GB",99999));
        check c=new check();
        Collections.sort(l,c);
        System.out.println(l);
    }
}
