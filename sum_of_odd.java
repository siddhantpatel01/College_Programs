
import java.util.Scanner;

// Java program to check for even or odd
// using Bitwise OR operator
class Sum_of_odd {
    // Function to return the sum of
    // all odd natural numbers
    static int sumOdd(int n) {
        int terms = (n + 1) / 2;
        int sum = terms * terms;
        return sum;
    }

    // Function to return the sum of all odd numbers in range L and R
    static int suminRange(int l, int r) {
        return sumOdd(r) - sumOdd(l - 1);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point");
        int l = sc.nextInt();
        System.out.println("Enter the size of end point");
        int r = sc.nextInt();

        System.out.print("Sum of odd natural numbers from L to R is "
                + suminRange(l, r));

    }
}
