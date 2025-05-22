import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>h=new HashMap<>();
        String[]arr={"Niventhan","Prabhu","Abi","Niventhan"};
        for(String s:arr){
            h.put(s,h.getOrDefault(s,0)+1);
        }
        System.out.println(h.entrySet());
    }
}
