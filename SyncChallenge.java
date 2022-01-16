class ATM
{
       synchronized public void DisplayName (String n)
        {
            System.out.println("Name of the customer is:" + n);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
      synchronized public void Withdraw (String n,int i)
        {
            System.out.println(n + " is withdrawing rupees " + i);
            try{
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

}
class Customer01 extends Thread
{
    ATM atm;
    String name;
    int amt;
    public Customer01(String n,int a,ATM ref)
    {
        name=n;
        amt=a;
        atm=ref;
    }

    void useAtm()
    {
        atm.DisplayName(name);
        atm.Withdraw(name,amt);

    }
    public void run()
    {
        useAtm();
    }
}
public class SyncChallenge {
    public static void main(String args[])
    {
        ATM ref=new ATM();
        Customer01 c1=new Customer01("Sujeet",100,ref);
        Customer01 c2=new Customer01("Nishant",200,ref);
        Customer01 c3=new Customer01("Sujal",300,ref);

            c1.start();
            c2.start();
            c3.start();

    }

    }

