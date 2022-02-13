import java.util.Scanner;

public class remove_consonants {
    static String remVowel(String str) {
        return str.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]", "");
    }

    // Driver method to test the above function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(remVowel(str));
    }

}