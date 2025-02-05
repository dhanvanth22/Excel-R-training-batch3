public class Demo064 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Check if array has at least two elements
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements to swap.");
        } else {
            // Swap first and last elements
            int temp = numbers[0];
            numbers[0] = numbers[numbers.length - 1];
            numbers[numbers.length - 1] = temp;

            // Print the updated array
            System.out.print("Array after swapping first and last elements: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }
}
