//https://www.tutorialspoint.com/recursive-fibonacci-method-in-java

public class Fibonacci {
    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int num = 15;
        System.out.println(num + "th fibonacci number is : " + fib(num));
    }
}