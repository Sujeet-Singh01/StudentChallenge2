import java.util.Scanner;
public class VoidCheck {
    public static void main(String args[])
    {
        check(1);
    }
    static void check(int count)
    {
        Scanner s=new Scanner(System.in);
        if(s.hasNext()==true)
        {
            String ns=s.nextLine();
            System.out.println(count+" "+ns);
            count++;
            check(count);
        }
    }
}
