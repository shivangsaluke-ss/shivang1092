import java.util.Scanner;

public class Nestedifexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {  // first condition
            if (num == 0) {
                System.out.println("The number is Zero.");
            } else {
                System.out.println("The number is Positive.");
                if (num % 2 == 0) {
                    System.out.println("It is Even.");
                } else {
                    System.out.println("It is Odd.");
                }
            }
        } else {
            System.out.println("The number is Negative.");
        }

        sc.close();
    }
}
