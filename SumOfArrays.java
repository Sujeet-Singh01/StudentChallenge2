public class SumOfArrays {
    public static void main(String[] args)
    {
        int sum=0;
        int sum1=sum;

        int A[]={1,4,6,7,9,5};
        for(int i=0; i<A.length;i++)
        {
            sum=sum+A[i];
        }
        System.out.println("Sum of the array elements is: "+sum);
        for(int x:A)
        {

            sum1= sum1 + x;
        }
        System.out.println("Sum is: "+sum1);
    }
}
