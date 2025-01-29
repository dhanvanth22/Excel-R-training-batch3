public class LTCode008 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            nums1[k] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test case
        int[] nums1 = {1, 2, 3, 0, 0, 0};  // nums1 has space for nums2
        int m = 3;  // valid elements in nums1
        int[] nums2 = {2, 5, 6};  // nums2
        int n = 3;  // valid elements in nums2
        
        // Merging nums2 into nums1
        solution.merge(nums1, m, nums2, n);
        
        // Printing the result
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
