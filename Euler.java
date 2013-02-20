import java.util.*;
import static java.lang.Math.*;

public class Euler {
    private HashMap<Integer,Integer> fibCache = new HashMap<Integer,Integer>();

    /*
     * Euler 1
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
     * The sum of these multiples is 23.  Find the sum of all the multiples of 3 or 5 below 1000.
     */
    public int euler1() {
        int sum = 0;
        for (int i=3;i<1000;i++) {
            if (((i % 3) == 0) || ((i % 5) == 0))
            sum = sum + i;
        }
        return sum;
    }


    /*
     * Euler 2
     * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By 
     * starting with 1 and 2, the first 10 terms will be:
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
     * find the sum of the even-valued terms.
     */
    private int fib(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        if (fibCache.containsKey(n))
            return fibCache.get(n);
        else {
            fibCache.put(n, fib(n-1) + fib(n-2));
            return fibCache.get(n);
        }
    }
    
    public int euler2 () {
        int sum = 0;
        int i = 1;
        while(true) {
            if (fib(i) > 4000000)
                break;
            sum = sum + fib(i);
            i = i + 1;
        }
        return sum;
    }

    /*
    * The prime factors of 13195 are 5, 7, 13 and 29.
    * What is the largest prime factor of the number 600851475143?
    */
    public long euler3 () {
        long number = 600851475143L;
        long largest = 0;
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                largest = i;
                number = number / i;
            }
        }
        return largest;
    }
}