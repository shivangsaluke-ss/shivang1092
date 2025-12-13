interface A
{
    void display();

}
interface b
{
    void show();
}
class test implements A,b
{
    public void display()
    {
        System.out.println("hrllo");

    }
    public void show()
    {
        System.out.println("hii");
    }

}
class demo1 extends test
{

public static void main(String[] args) {
    demo1 d1 =new demo1();
    d1.display();
    d1.show();
}
}
