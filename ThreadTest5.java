class MyRun extends Thread

{
    public void run()
    {
            int count=1;
            while(true) {
                System.out.println(count++);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
    }
    public MyRun(String name)
    {
        super(name);
    }
}
public class ThreadTest5 {
    public static void main(String args[])
    {

        MyRun t=new MyRun("First Thread");
        t.interrupt();
        System.out.println("ID is:"+t.getId());
        t.start();
        System.out.println("State is:"+t.getState());
        System.out.println("Status is: "+t.isAlive());
        int i=0;
        while(true)
        {
            System.out.println("Sujeet");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }

    }

}
