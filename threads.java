class xyz implements Runnable
{
public void run()
{
System.out.println ("I am Runnable Interface");
}
}
class threads
{
public static void main (String M[])
{
xyz obj = new xyz();
Thread thread = new Thread (obj);
thread.start();
System.out.println ("I am from the thread");
}
}