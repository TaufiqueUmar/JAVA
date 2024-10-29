import java.util.*;

public class ArrayAndVectorExampler {
public static void main(String[] args) {
    int [] arr =  {5,6,8,9,4};
    System.out.println("elements of array:");
    for(int i:arr){
        System.out.println(i);
    }

    Vector<Integer> vect = new Vector<>();

    vect.add(5);
    vect.add(8);
    vect.add(89);
    vect.add(9);

    System.out.println("Element of vector is:");
    for(Integer i :vect){
        System.out.println(i);
    }

    System.out.println(vect);

    vect.remove(2);
    System.out.println(vect);

    int a = vect.size();
    System.out.println(a);
}
    
}
