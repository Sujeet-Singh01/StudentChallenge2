public class ThreadTest3 implements Runnable {
    public void run()
    {
        int i=0;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;

        }
    }
    public static void main(String args[])
    {
        ThreadTest3 t3=new ThreadTest3();
        Thread th=new Thread(t3);
        th.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
