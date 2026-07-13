import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = 4;
        System.out.println("Task 1: sum of squares of first " + n1 + " positive integers = " + Task1.sumOfSquares(n1));

        int[] arr = {10, 20, 30, 40, 50};
        int n2 = arr.length;
        System.out.println("Task 2: sum of first " + n2 + " elements of array = " + Task2.sumOfArray(arr, n2));

        int b = 4, n3 = 3;
        System.out.println("Task 3: sum of first " + n3 + " powers of base " + b + " = " + Task3.sumOfPowers(b, n3));

        System.out.println("Task 4: enter N, then N integers:");
        int n4 = scanner.nextInt();
        System.out.print("Reversed sequence: ");
        Task4.readAndReverse(scanner, n4);
        System.out.println();

        scanner.close();
    }
}
