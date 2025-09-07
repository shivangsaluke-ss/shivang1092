import java.util.Scanner;

public class SwappingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swapping: a = " + a + ", b = " + b);

        // Swapping using temp variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}
