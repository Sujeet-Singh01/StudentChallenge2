public class VarArguments2 {
    static int sum(int ...A)
    {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(sum(5,10,20,50));
    }
}
