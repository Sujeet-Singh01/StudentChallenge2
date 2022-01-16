import java.io.*;
public class Serialization01 {
    public static void main(String args[]) throws Exception
    {
        Student001 st=new Student001();
        FileInputStream fis=new FileInputStream("D:/JavaProjects/My.txt");

        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        st.roll=Integer.parseInt(br.readLine());

        st.name=br.readLine();
        st.stream=br.readLine();

        System.out.println(st.roll+" "+st.name+" "+st.stream);

    }
}
