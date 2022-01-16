import java.io.*;
class Student001
{
    int roll;
    String name;
    String stream;
}
public class Serialization {
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("D:/JavaProjects/My.txt");
        PrintStream ps=new PrintStream(fos);
        Student001 st=new Student001();
        st.roll=126;
        st.name="Sujeet Singh";
        st.stream="IT";

        ps.println(st.roll);
        ps.println(st.name);
        ps.println(st.stream);
        fos.close();


    }
}
