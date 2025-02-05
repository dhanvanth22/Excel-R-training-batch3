
public class Demo067 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = { 10, 15, 20, 25, 30, 35, 40 };

        // Print even elements of the array
        System.out.print("Even elements in the array: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}