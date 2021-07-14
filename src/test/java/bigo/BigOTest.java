package bigo;

import org.junit.jupiter.api.Test;

/*
 * @created 7/14/2021
 *
 * @Author Poran chowdury
 */
class BigOTest {

    @Test
    void sumOfProduct() {
        new BigO().sumOfProduct(new int[] {1,2,3,4,5,6});
    }

    @Test
    void printPairs() {
        new BigO().printPairs(new int[] {1,2,3});
    }

    @Test
    void reverse() {
        new BigO().reverse(new int[] {1,2,3});
    }
}