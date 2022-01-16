import java.lang.reflect.*;
class My01
{
    private int a;
    protected int b;
    public int c;
    int d;
    public My01(){}
    public My01(String s1,String s2){}
    public void display(int x,int y) {}
    public int show(int j,int k){return 0;}

}
public class Reflection {
    public static void main(String args[])
    {
        Class c=My01.class;

        Field field[]=c.getDeclaredFields();
        for(Field f:field)
            System.out.println(f);
        Method m[]=c.getMethods();
        for(Method mt:m)
            System.out.println(mt);

    }
}
