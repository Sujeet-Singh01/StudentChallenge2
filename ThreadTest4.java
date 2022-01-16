class MyNewThread implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class ThreadTest4 {
    public static void main(String args[])
    {
        MyNewThread th=new MyNewThread();
        Thread t=new Thread(th);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
            i++;
        }
    }
}
