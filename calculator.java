 class calci {
    int a,b;
    public int add(int a,int b){
         return a + b;
    }
    public int sub(int a,int b){
        return a - b;
   }
}

 class advcalci extends calci{
    int c,d;
    public int multi(int c,int d){
        return c * d;
    }
    public int div(int c,int d){
        return c / d;
    }
}

public class calculator {
    public static void main(String[] args) {
        advcalci a = new advcalci();
        System.out.println(a.add(5,10));
        System.out.println(a.multi(5,10));
        System.out.println(a.sub(5,10));
        System.out.println(a.div(5,10));
        
    }
}