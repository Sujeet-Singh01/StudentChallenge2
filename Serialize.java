import java.io.*;
class Stud implements Serializable
{
    String name;
    String custID;
    String phoneNo;
    int count=1;
    public Stud()
    {

    }

    public Stud(String n,String p)
    {
        custID="C"+count;
        name=n;
        phoneNo=p;

    }
    public String toString()
    {
        return "Customer ID"+custID+"\nName "+name+"\nPhone Number "+phoneNo;

    }
}
public class Serialize {
    /*public static void main(String args[]) throws Exception
    {
        FileOutputStream fos =new FileOutputStream("D://Serialize.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

       Stud list[]={new Stud("John","1234456576"),new Stud("Ajay","345677659"),new Stud("Vijay","3456565537")};

       oos.writeObject(list.length);
       for(Stud s:list)
       {
           oos.writeObject(s);
       }
       oos.close();
       fos.close();

    }
*/
    public static void main(String args[]) throws Exception {

        java.util.Scanner sc=new java.util.Scanner(System.in);

            FileInputStream fis=new FileInputStream("D://Serialize.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);

            int noOfStudents =ois.readInt();
            Stud list[]=new Stud[noOfStudents];
            for(int i=0;i<noOfStudents;i++)
            {
                list[i]=(Stud)ois.readObject();
            }
        System.out.println("Enter the name of the Student ");
            String n=sc.nextLine();
            for(int i=0;i<noOfStudents;i++)
            {
                if(n.equalsIgnoreCase(list[i].name))
                    System.out.println(list[i]);
            }
            ois.close();
            fis.close();
    }
}
