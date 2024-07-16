public class FactorialRecursive {

    public static void main(String[] args) {
        // Input number
        int number = 4;  // You can change this value to test with different numbers

        // Calculate factorial
        long factorial = calculateFactorial(number);

        // Print the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
