package recursion;/*
 * @created 7/10/2021
 *
 * @Author Poran chowdury
 */

public class Recursion {

    public int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // how to find the sum of digits of a positive integer number using recursion
    public int sumOfPositiveInteger(int n) {
        //base
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfPositiveInteger(n / 10);
    }

    // how to calculate power of a number using recursion ?
    public int calculatePowerOfANumber(int base, int exp) {
        if (exp == 0 || exp == 1) {
            return base;
        }
        return base * calculatePowerOfANumber(base, exp - 1);
    }

    // how to find gcd of two numbers using recursion?
    public int findGcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return findGcd(a, a % b);
    }

    public int decimalToBinary(int decimal) {
        if (decimal == 0) {
            return 0;
        }
        return decimal % 2 + 10 * decimalToBinary(decimal / 2);
    }
}
