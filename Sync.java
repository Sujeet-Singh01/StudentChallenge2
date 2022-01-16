class MyThread01 extends Thread{
    DataObj d;
    MyThread01(DataObj dat)
    {
        d=dat;
    }
    public void run()
    {
        d.display01("Hello World");
    }

}
class MyThread02 extends Thread{
    DataObj d;
    MyThread02(DataObj dt)
    {
        d=dt;
    }
    public void run()
    {
        d.display01("Welcome");
    }

}
class DataObj
{
     void display01(String str) {
         synchronized(this) {
             for (int i = 0; i < str.length(); i++) {
                 System.out.print(str.charAt(i));
             }
         }
    }
}
public class Sync {
    public static void main(String args[])
    {
        DataObj d=new DataObj();
        MyThread01 my1=new MyThread01(d);
        MyThread02 my2=new MyThread02(d);
        my1.start();
        my2.start();

    }
}
