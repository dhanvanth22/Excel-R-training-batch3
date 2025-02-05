public class Demo062 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Check if array has at least two elements
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
        } else {
            // Print first, second, and last elements
            System.out.println("First element: " + numbers[0]);
            System.out.println("Second element: " + numbers[1]);
            System.out.println("Last element: " + numbers[numbers.length - 1]);
        }
    }
}
