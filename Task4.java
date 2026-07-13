import java.util.Scanner;

public class Task4 {

    // Time Complexity: O(n) - n recursive calls read the input, printing happens on the way back
    public static void readAndReverse(Scanner sc, int count) {
        if (count == 0) {
            return;
        }
        int x = sc.nextInt();
        readAndReverse(sc, count - 1);
        System.out.print(x + " ");
    }
}
