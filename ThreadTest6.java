class MyNewThreadClass extends Thread
{
    public void run() {
        int i = 1;
        while (i<=100) {
            System.out.println(i++);
        }
    }
}

public class ThreadTest6 {
    public static void main(String args[])
    {
        MyNewThreadClass mythread=new MyNewThreadClass();
        mythread.setDaemon(true);
        mythread.start();
        Thread mainthread=Thread.currentThread();
        try{
            mainthread.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }




    }
}
