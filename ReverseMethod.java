import java.util.Scanner;
public class ReverseMethod {
   static void reverse(int n)
    {
        while(n!=0)
        {
             int num=n%10;
             n=n/10;
            System.out.print(num);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        reverse(n);
    }
}
