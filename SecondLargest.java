public class SecondLargest {
    public static void main(String[] args)
    {
        int A[]={3,9,7,8,12,6,18,5,4,10,13,43,56,34,23,78,65};
        int max1=A[0];
        int max2=A[0];

        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }

        }
        System.out.println("Second largest of the given array is: "+max2);
    }
}
