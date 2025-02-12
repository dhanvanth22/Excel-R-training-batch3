import java.util.HashSet;

public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        System.out.println("Duplicate elements in the array:");
        for (int num : arr) {
            if (!seen.add(num)) { // If num is already in 'seen', it's a duplicate
                if (duplicates.add(num)) { // Ensure it's printed only once
                    System.out.println(num);
                }
            }
        }
    }
}
