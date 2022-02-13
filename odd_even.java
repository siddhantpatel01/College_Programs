import java.util.Scanner;

// Java program to check for even or odd
// using Bitwise OR operator
class odd_even {
    // Returns true if n is even, else odd
    static boolean isEven(int n) {

        // n|1 is greater than n, then even, else odd
        if ((n | 1) > n)
            return true;
        else
            return false;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isEven(n) == true) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
