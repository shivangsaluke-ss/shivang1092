import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----- 1D Array Example -----
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];   // 1D array

        System.out.println("Enter marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("\n--- 1D Array Output (Student Marks) ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // ----- 2D Array Example -----
        System.out.print("\nEnter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];   // 2D array

        System.out.println("Enter elements of " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- 2D Array Output (Matrix) ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line for next row
        }

        sc.close();
    }
}
