public class SecL {
    public static void main(String args[])
    {
        int A[]={2,5,8,12,34,56,78,98,45,23,43};
        int max=0;
        int secMax=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            {
                secMax=max;
                max=A[i];
            }
        }
        System.out.println("The max is "+max);
        System.out.println("The Second max is "+secMax);
    }
}
