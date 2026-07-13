public class Task2 {

    // Time Complexity: O(n) - exactly n recursive calls, O(1) work per call
    public static int sumOfArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }
}
