import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);

        int a = list.get(0);
        System.out.println(list);
        System.out.println(a);
        
        list.set(2,15 );
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        int s = list.size();
        System.out.println(s);

        for(int i= 0 ; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
