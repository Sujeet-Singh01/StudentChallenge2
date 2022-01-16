public class RectangleTest {
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=10;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());
    }
  static public class Rectangle
    {
       public double length;
       public double breadth;

        double area()
        {
            return length*breadth;
        }
        double perimeter()
        {
            return 2*(length+breadth);
        }
        boolean isSquare()
        {
            if (length==breadth)
            return true;
            else return false;

        }
    }
}
