class demo{
    void add()
    {
     int i=90,j=80;
     int c= i+j;
     System.out.println(c);
    }
    void sub()
    {
        int a=8,b=80;
        int k=a-b;
        System.out.println(k);
    }
    class s1 extends demo{
    int v=10;
    }
}
public class overriding{
    public static void main(String[] args) {
       demo sc=new demo();
         sc.add();
         sc.sub();


    }
}