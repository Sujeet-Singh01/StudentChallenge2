class MyThread1 extends Thread{
    public void run()
    {
        int i=1;
        while(i<=1000)
        {
            System.out.println(i++);
        }

    }
    
}
public class ThreadTest7 {
    public static void main(String args[])
    {
        MyThread1 my1=new MyThread1();
        Thread th=Thread.currentThread();
        my1.setDaemon(true);
        my1.start();
        try
        {
            th.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
