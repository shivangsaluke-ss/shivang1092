class demo
{
    static int i=10;
    static void add()
    {
        System.out.println("hello");
    }
    static void inc()
    {
       i++;
       System.out.println(i);   
    }
}
 public class keyword extends demo
{
    public static void main(String[] args) {
       demo.add();
       demo.inc(); 
    }
}