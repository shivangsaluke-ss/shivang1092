
abstract   class A
{
    abstract void get();
}
class b extends A 
{
    public void get()
    {
        System.out.println("hello");
    }
}
public class absrt
{
    public static void main(String[] args) {
        A a=new b();
        a.get();
    }
}