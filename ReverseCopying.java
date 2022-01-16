public class ReverseCopying {
    public static void main(String args[])
    {
        int A[]={2,4,5,7,9,12,23,34,45,56,67,78,89};
        int B[]= new int[13];
        int count =0;
        for (int i=A.length-1; i>=0;i--)
        {
            B[count]=A[i];
            count++;
        }
        for(int j=0;j<B.length;j++)
        {
            System.out.print(B[j]+" , ");
        }
    }
}
