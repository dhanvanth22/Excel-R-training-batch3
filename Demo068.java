public class Demo068 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = { 10, 15, 20, 25, 30, 35, 40 };

        // Count even numbers in the array
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // Print the count of even numbers
        System.out.println("Count of even numbers in the array: " + count);
    }
}
