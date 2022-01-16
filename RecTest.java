class Rectangle1{
            private float length;
            private float breadth;
            public void setLength(float l)
            {
                if(l>0)
                    length=l;
                else
                    length=0;
            }
    public void setBreadth(float b)
    {
        if(b>0)
            breadth=b;
        else
            breadth=0;
    }
            public float area()
            {
                 return length*breadth;
            }
            public float perimeter()
            {
                return 2*(length+breadth);
            }
}
public class RecTest {
    public static void main(String args[])
    {
        Rectangle1 r=new Rectangle1();
        r.setLength(10);
        r.setBreadth(5);
        System.out.println("Area is: "+r.area());
        System.out.println("Perimeter is: "+r.perimeter());
    }
}
