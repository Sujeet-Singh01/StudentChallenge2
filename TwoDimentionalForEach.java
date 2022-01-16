public class TwoDimentionalForEach {
    public static void main(String args[])
    {
        int A[][]={{1,2,4,5},{6,7,8,9},{9,7,5,3}};

        for(int x[]:A)
        {
            for(int y:x)
            {
                System.out.print(y);
            }
            System.out.println("\n");
        }
    }
}
