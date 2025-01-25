import java.util.Scanner;

public class Demo047{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to count the number of digits
        int count = 0;

        // Handle the case where the number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Loop to count digits
            while (number != 0) {
                number /= 10;  // Remove the last digit
                count++;       // Increment the count
            }
        }

        // Output the result
        System.out.println("The number of digits is: " + count);

        // Close the scanner
        scanner.close();
    }
}

