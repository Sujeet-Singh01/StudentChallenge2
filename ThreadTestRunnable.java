public class ThreadTestRunnable implements Runnable {
    public void run()
    {
        int i=0;
        while(true)
        {
            System.out.println(i+"Sujeet");
            i++;
        }
    }
    public static void main(String args[])
    {
        ThreadTestRunnable th=new ThreadTestRunnable();
        Thread t=new Thread(th);
        t.start();
        int i=0;
        while(true)
        {
            System.out.println(i+"Singh");
            i++;
        }
    }
}
