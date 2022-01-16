import java.util.Scanner;

public interface TryCatch2 {
                    public static void main(String args[])
                    {
                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enter your favourite number: ");

                        try {
                            int a=sc.nextInt();
                            System.out.println(a);
                        }catch(Exception e)
                        {
                            System.out.println("Enter a valid number!!");
                        }
                    }
}
