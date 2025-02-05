public class Demo063 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Check if array is not empty
        if (numbers.length == 0) {
            System.out.println("Array is empty.");
        } else {
            // Calculate sum of first and last elements
            int sum = numbers[0] + numbers[numbers.length - 1];
            System.out.println("Sum of first and last element: " + sum);
        }
    }
}
