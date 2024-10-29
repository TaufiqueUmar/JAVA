class currency{
    public void convert(double x){
        System.out.println("The amount of currency in rupees:" + x*88); //in usd
    }
    public void convert(double x,String currency){
        if(currency.equals("pound")){
            System.out.println("The amount of curency in pound can be give in rupees:" +x*100);
        }else if(currency.equals("euro")){
            System.out.println("The amount of curency in euro can be give in rupees:" +x*500);
        }else{
            System.out.println("invalid");
        }
    }
}
public class currencyconvert {
    public static void main(String[] args) {
        currency c = new currency();
        System.out.println("usd to inr");
        c.convert(500);
        c.convert(200,"pound");
        c.convert(300,"euro");
        
    }
}
