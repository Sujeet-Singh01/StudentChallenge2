import java.util.Date;
class Students
{
    private String rollNumber;
    private static int count=1;
    Date d=new Date();
    Students()
    {
        rollNumber=assignRollNumber();

    }
    private  String assignRollNumber()
    {
        String rNo="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rNo;

    }
    public String getRollNumber()
    {
        return rollNumber;
    }

}
public class Student1 {
    public static void main(String args[])
    {
            Students s1=new Students();
            Students s10=new Students();
            Students s30=new Students();
        System.out.println(s1.getRollNumber());
        System.out.println(s10.getRollNumber());
        System.out.println(s30.getRollNumber());

    }
}
