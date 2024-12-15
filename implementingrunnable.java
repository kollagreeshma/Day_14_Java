class a implements Runnable
{
    public void run()
    {
        System.out.println("Hello I'm Thread");
    }
}
public class implementingrunnable
{
    public static void main(String args[])
    {
        a g=new a();
        Thread s=new Thread(g);
        s.start();
        s.run();
    }
}