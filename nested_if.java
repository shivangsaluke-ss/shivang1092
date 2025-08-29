
import java.util.Scanner;


public class nested_if
{
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the percentage:");
          int per=sc.nextInt();
          System.out.println("enter the rate:");
          int rate=sc.nextInt();
          System.out.println("enter the annum:");
          int annum=sc.nextInt();
          float interest_rate=per*rate*annum/100*12;
          int sum;
          boolean a=false;

        if(per==0) 
        {
            sum= rate*annum/100*12;
            System.out.println("you percentage is "+sum);
        }         
        else if(rate==0)
        {
        sum= per*annum/100*12;
        System.out.println("you rate is "+sum);

        }
        else if(annum==0)
        {
            sum= per*rate*22/100*7;
            System.out.println("your per annum  is"+sum);

        }
            else
        {
            System.out.println("your interest rate is"+interest_rate);
        }
        

    }
}