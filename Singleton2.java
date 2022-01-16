class CoffeeMachine2
{
    private float CoffeeQty;
    private float WaterQty;
     static private CoffeeMachine2 ref=null;
    private CoffeeMachine2()
    {
        CoffeeQty=1;
        WaterQty=1;
    }
    static CoffeeMachine2 getInstance()
    {
        if(ref==null)
            ref=new CoffeeMachine2();
        return ref;
    }

    public void Coffee()
    {
        System.out.println("You can have Coffee");
    }
}
public class Singleton2 {
    public static void main(String args[])
    {
            CoffeeMachine2 c=CoffeeMachine2.getInstance();
        c.Coffee();

    }
}
