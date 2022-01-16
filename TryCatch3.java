public class TryCatch3 {
    public static void main(String args[])
    {


        try {
            int[] a = {3};
            System.out.println(a[1]);
        } catch(NullPointerException e){
            System.out.println("your array is null!!");
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Your array is out of bond ");
        } catch(Exception e){
            System.out.println("Something went wrong");
        }

    }
}
