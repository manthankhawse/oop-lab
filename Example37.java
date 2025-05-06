import java.io.*;
import java.util.*;

public class Example37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter filename to read: ");
        String filename = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("File contents:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the filename.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        }

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
            scanner.nextLine(); // clear the invalid input
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.print("Enter index to access (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid index.");
            scanner.nextLine();
        }

        try {
            String str = null;
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot perform operations on a null reference.");
        }

        System.out.println("Program executed with exception handling.");
        scanner.close();
    }
}
