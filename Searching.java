import java.util.Scanner;
public class Searching {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Key You want to search: ");
        int Key=sc.nextInt();
        int A[]={2,1,4,5,6,8,9,12,34,67,87,77,90,98,23};

        for(int i=0;i<A.length;i++)
        {
            if(A[i]==Key)

            {
                System.out.println("Key is found at: "+i);
                System.exit(0);

            }

        }
        System.out.println("Key is not found!");


    }
}
