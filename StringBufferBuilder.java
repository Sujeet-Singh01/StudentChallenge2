public class StringBufferBuilder {
    public static void main(String args[])
    {
        String s1=new String("Hello");
        StringBuffer s2=new StringBuffer("Hello");
        StringBuilder s3=new StringBuilder("Hello");

        String s=s1.concat("World");
        s2.append("World");
        s3.append("World");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1);
    }
}
