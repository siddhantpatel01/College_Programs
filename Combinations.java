import java.util.*;

public class Combinations {
    static int fact(int number) {
        int f = 1;
        int j = 1;
        while (j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int r = 2;
        int result;

        result = fact(n) / (fact(r) * fact(n - r));
        System.out.println("The combination value for the numbers list is: " + result);
    }
}
