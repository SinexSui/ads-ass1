public class Task3 {

    // Time Complexity: O(n) - n+1 recursive calls, each doing O(1) multiplication
    private static long sumOfPowersHelper(int b, int n, int i, long currentPower) {
        if (i > n) {
            return 0;
        }
        return currentPower + sumOfPowersHelper(b, n, i + 1, currentPower * b);
    }

    public static long sumOfPowers(int b, int n) {
        return sumOfPowersHelper(b, n, 0, 1);
    }
}
