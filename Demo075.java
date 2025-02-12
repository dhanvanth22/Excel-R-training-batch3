public class Demo075 {
    
    // Method to find the maximum number in the array
    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger value is found
            }
        }
        return max;
    }

    // Method to print the maximum number
    public static void printMax(int max) {
        System.out.println("Maximum number in the array: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 23, 56, 89, 34};

        // Finding the maximum number
        int maxNumber = findMax(arr);

        // Printing the maximum number
        printMax(maxNumber);
    }
}
