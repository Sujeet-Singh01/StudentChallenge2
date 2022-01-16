import java.sql.SQLOutput;

class Student {
    public int roll;
    public String name;
    public float m1,m2,m3;

    public float total()
    {
        return m1+m2+m3;

    }
    public float average()
    {
        return total()/3;
    }
    public String grade()
    {
        if (average()>60)
            return "A";
        else return "B";
    }
}
public class StudentInfo {
    public static void main(String args[])
    {
        Student s=new Student();
        s.m1=80;
        s.m2=76;
        s.m3=68;
        System.out.println("Total is: "+s.total());
        System.out.println("Average is: "+s.average());
        System.out.println("Grade is: "+s.grade());


    }
}
