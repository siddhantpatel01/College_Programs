
// sum of digits in number.
import java.io.*;
import java.util.Scanner;

class Sum_of_digits {

    /* Function to get sum of digits */
    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigits(n / 10);
    }

    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
    }
 
}


