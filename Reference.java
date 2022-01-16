interface NewInter
{
    public void display(String str);
}
public class Reference {
    public Reference(String str)
    {
        System.out.println(str.toUpperCase());
    }
    public static void main(String args[])
    {
        NewInter ni=Reference::new;
        ni.display("New Method Reference");
    }
}
