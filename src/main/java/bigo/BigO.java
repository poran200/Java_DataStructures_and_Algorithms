package bigo;/*
 * @created 7/14/2021
 *
 * @Author Poran chowdury
 */

import java.util.Arrays;

public class BigO {


    public void sumOfProduct(int[] array) {

        int sum = 0;  // -> -> -> -> -> -> -> O(1)
        int product = 1; // -> ------------ -> O(1)
        for (int value : array) { // ->     -> O(N)
            sum += value;        // ->      -> O(1)
        }
        for (int i : array) {   // ->       -> O(N)
            product *= i;       // ->       -> O(1)
        }
        System.out.println("sum = " + sum + " product =" + product);// ->       -> O(1)
    }
//    time Complexity : O(N)

    /*
     * # Created a function which prints to the console the pairs from given array.
     * # Find the time complexity for created method
     */
    void printPairs(int [] array){
        for (int i = 0; i < array.length; i++) {/// O(N)
            for (int j = 0; j < array.length; j++) {// O(N)
                System.out.println(array[i]+", "+array[j]);//O(1)
            }
        }
        // Time Complexity: O(N)
    }
    /*
     * revers an array
     */
    void reverse(int [] array){
        for (int i = 0; i < array.length/2; i++) {// O(N/2) -> O(N)
            int other = array.length - i - 1;   // O(1)
            int temp = array[i];// O(1)
            array[i] = array[other];// O(1)
            array[other] = temp;// O(1)
        }
        System.out.println(Arrays.toString(array));// O(1)
        // Time Complexity: O(N)
    }


}
