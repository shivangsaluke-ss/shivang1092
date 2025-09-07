 public class overloading{
     void add()
     {
        int i= 90;
        System.out.println(i);
     }
     int add(int i, int j)
     {

     
        int c= i+j;
        System.out.println(c);
        return 0;
     }
    public static void main(String[] args) {
        
        overloading ov1=new overloading();
        ov1.add();
        ov1.add(56,58);
    }
 }
