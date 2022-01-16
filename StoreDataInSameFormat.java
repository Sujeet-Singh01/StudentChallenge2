import java.io.*;
class NewStudent
{
    int roll;
    String name;
    String dept;
}
public class StoreDataInSameFormat {
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("D:/JavaProjects/My1.txt");
        DataOutputStream d=new DataOutputStream(fos);

        NewStudent ns=new NewStudent();

        ns.roll=120;
        ns.name="Otis";
        ns.dept="CSE";

        d.writeInt(ns.roll);
        d.writeUTF(ns.name);
        d.writeUTF(ns.dept);
        d.close();
        fos.close();
    }
}
