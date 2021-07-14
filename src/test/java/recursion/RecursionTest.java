package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @created 7/10/2021
 *
 * @Author Poran chowdury
 */
class RecursionTest {

    @Test
    void factorial() {
        Recursion recursion = new Recursion();
       assertEquals(recursion.factorial(2),2);
    }

    @Test
    void fibonacciTest() {
        Recursion recursion = new Recursion();
        assertEquals(recursion.fibonacci(4),3);

    }

    @Test
    void sumOfPositiveInteger() {

        Recursion recursion = new Recursion();
        int sumOfPositiveInteger = recursion.sumOfPositiveInteger(10);
        assertEquals(sumOfPositiveInteger,1);

    }

    @Test
    void calculatePowerOfANumber() {
       assertEquals(new Recursion().calculatePowerOfANumber(2,2),4);
    }

    @Test
    void findGcd() {
        assertEquals(new Recursion().findGcd(8,4),8);
    }

    @Test
    void decimalToBinary() {
   assertEquals(new Recursion().decimalToBinary(10),1010);
    }
}