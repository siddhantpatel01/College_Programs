import java.util.*;

class sqrt_prime {

    static int i = 2;

    // Function check whether a number
    // is prime or not
    public static boolean isPrime(int n) {

        // Corner cases
        if (n == 0 || n == 1) {
            return false;
        }

        // Checking Prime
        if (n == i)
            return true;

        // Base cases
        if (n % i == 0) {
            return false;
        }
        i++;
        return isPrime(n);
    }

    static int countSquares(int n) {
        int sqr = (int) Math.sqrt(n);
        int result = (int) (sqr);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        if (isPrime(n)) {
            System.out.println(countSquares(n));
        } else {
            System.out.println("number is not prime");
        }
    }
}
