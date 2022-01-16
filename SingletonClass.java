class CoffeeMachine
{
    private float CoffeeQty;
    private float WaterQty;
    static private CoffeeMachine our=null;
    private CoffeeMachine()
    {
        CoffeeQty=1;
        WaterQty=1;
    }
    static public CoffeeMachine getInstance()
{
        if(our==null)
        our=new CoffeeMachine();
        return our;
}
    public float getCoffeeQty()
    {
        return CoffeeQty;
    }
    public float getWaterQty()
    {
        return WaterQty;
    }
}


public class SingletonClass {
    public static void main(String args[])
    {
            CoffeeMachine c=CoffeeMachine.getInstance();
        System.out.println(c.getCoffeeQty());
        System.out.println(c.getWaterQty());

    }
}
