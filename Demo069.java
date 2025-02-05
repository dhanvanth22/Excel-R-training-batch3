public class Demo069 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Calculate sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Print the sum of elements
        System.out.println("Sum of all elements in the array: " + sum);
    }
}
