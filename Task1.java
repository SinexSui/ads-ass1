public class Task1 {

    // Time Complexity: O(n) - exactly n recursive calls, O(1) work per call
    public static int sumOfSquares(int n) {
        if (n == 0) {
            return 0;
        }
        return n * n + sumOfSquares(n - 1);
    }
}
