
// public class final_keyword{
//     public static void main(String[] args) {
//    final int a=20;
//    System.out.println(a);
//     }
// }
class A
{
     final void display()
     {
        System.out.println("hello world");
     }

}
class B
{
    void display()
    {
        System.out.println("hello world");
    }
}
public class final_keyword
{
    public static void main(String[] args) {
        A a1=new A();
        a1.display();
        B b1=new B();
        b1.display();
    }
}