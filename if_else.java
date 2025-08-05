
import java.util.Scanner;

public class if_else{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("enter the maths marrks");
          int maths=sc.nextInt();
          System.out.println("enter the html marks");
          int html=sc.nextInt();
          System.out.println("enter the php marks");
          int php=sc.nextInt();
          int total=maths+html+php;
          float sum=(total*100)/300;
          System.out.println("your percentage is this"+sum);
          if (sum>80) {
              System.out.println("firstclass");
          } else if(sum>65)
          {
            System.out.println("second class");

          }
          else if(sum<50)
          {
            System.out.println("your are pass");

          }
          else if(sum<=35)
          {
            System.out.println("grating");

          }
          else{
            System.out.println("fail");
          }
          
        
    }
}