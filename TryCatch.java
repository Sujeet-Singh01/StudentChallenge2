public class TryCatch {
    public static void main(String args[])
    {
        try {
            int[] a = {2, 5, 7, 9, 7};
            System.out.println(a[1]);
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }
    }
}
