//https://www.geeksforgeeks.org/java-program-to-find-factorial-of-a-number-recursively/

public class Factorial {

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 4;
        int ans = factorial(num);

        System.out.println("Factorial of " + num + " is : " + ans);
    }
}