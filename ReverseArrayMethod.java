public class ReverseArrayMethod {
    static void reverse(int A[])
    {
        int B[]=new int[A.length];
        for(int i=A.length-1,j=0; i<=0;i--,j++)
        {
            B[j]=A[i];
        }
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int A[]={2,4,6,8,9,12,23,34,45,56,67,78,90};
        reverse(A);
    }
}

