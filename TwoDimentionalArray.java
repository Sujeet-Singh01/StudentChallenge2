import java.sql.SQLOutput;

public class TwoDimentionalArray {
    public static void main(String args[])
    {
        int A[][]={{1,2,3,4},{5,6,7,8},{9,8,7,6}};

        for(int i=0;i<A.length;i++)
        {
            for(int j=0; j<A[0].length;j++)
            {
                System.out.print(A[i][j]);
            }
            System.out.println("\n");
        }
    }
}
