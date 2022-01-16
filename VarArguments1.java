public class VarArguments1 {
    static int max(int ...A)
    {
        if(A.length==0) return Integer.MIN_VALUE;
        else {
            int max1 = A[0];
            for (int i = 1; i < A.length; i++) {
                if (A[i] > max1) {
                    max1 = A[i];

                }

            }
            return max1;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(max(5,6,3,67,83,64,23,75,34,45));
    }
}
