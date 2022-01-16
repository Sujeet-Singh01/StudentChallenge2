import java.io.FileOutputStream;

public class Source1 {
    public static void main(String args[]) throws Exception
    {
       try(FileOutputStream fos=new FileOutputStream("D:/JavaProjects.Source1.txt"))
       {
           String str=new String("Java is a high level programming language");

           byte b[]=str.toUpperCase().getBytes();

           for(byte x:b)
           {
               fos.write(x);
           }
       }
    }
}
