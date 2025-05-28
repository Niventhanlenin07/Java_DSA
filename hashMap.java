import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        int[]arr={1,1,2};
        HashMap<Integer,Integer>h=new HashMap<>();
        for(Integer i:arr){
            h.put(i,h.getOrDefault(i, 0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(h.get(arr[i])==1){
                System.out.println(arr[i]);
            }
        }
    }
}
