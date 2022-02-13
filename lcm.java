// Java program to compute the LCM of two numbers
// using command line arguments

class lcm {

    // Function to compute the GCD of two numbers
    static int GCD(int a, int b) {
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    // Function to find the LCM
    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    // Driver code
    public static void main(String[] args) {

        // Check if length of args array is
        // greater than 0
        if (args.length > 0) {

            // Get the command line argument and
            // Convert it from string type to integer type
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Find the LCM
            int res = LCM(num1, num2);

            // Print the LCM
            System.out.println(res);
        } else
            System.out.println("No command line "
                    + "arguments found.");
    }
}
