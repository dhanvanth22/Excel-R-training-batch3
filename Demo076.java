// Demo076.java
public class Demo076 {
    
    // Method to find the second maximum number in the array
    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max; // Update second max
                max = num;       // Update max
            } else if (num > secondMax && num < max) {
                secondMax = num; // Update second max
            }
        }

        return secondMax;
    }

    // Method to print the second maximum number
    public static void printSecondMax(int secondMax) {
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum found!");
        } else {
            System.out.println("Second maximum number in the array: " + secondMax);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 23, 56, 89, 34};

        // Finding the second maximum number
        int secondMaxNumber = findSecondMax(arr);

        // Printing the second maximum number
        printSecondMax(secondMaxNumber);
    }
}
