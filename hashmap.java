import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap <String,Integer> hash = new HashMap<>();
        hash.put("Taufique", 1);
        hash.put("T", 2);
        hash.put("U", 3);
        System.out.println(hash);

        for(String name:hash.keySet()){
            System.out.println(name + " "+ hash.get(name));
        }

        hash.remove("T");
        System.out.println(hash);

        int a= hash.size();
        System.out.println(a);
    }
}
