class Parent {
     void display() {
final int a=89;
System.out.println(a);
}
}
final class child extends Parent {
    // ❌ Error: Cannot override the final method from Parent
    // void display() { 
    //     System.out.println("Trying to override.");
    // }
}
public class final_keyword
{
    public static void main(String[] args) {
        child d2=new child();
        d2.display();
    }
}
