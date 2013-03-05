import java.util.*;

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


    /*
     * Euler 4
     * A palindromic number reads the same both ways. The largest palindrome made from the product of 
     * two 2-digit numbers is 9009 = 91 × 99.  Find the largest palindrome made from the product of 
     * two 3-digit numbers.
     */  
    public int euler4() {
        int palindrome = 0;
        for (int i=100;i<1000;i++) {
            for (int j=100;j<1000;j++) {
                int prod = i*j;
                String prodStr = Integer.toString(prod);
                String reverseProd = new StringBuffer(prodStr).reverse().toString();
                if (prodStr.equals(reverseProd))
                    if (prod > palindrome)
                        palindrome = prod;
            }
        }
        return palindrome;
    }

    /*
     * Euler 5
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without 
     * any remainder. What is the smallest positive number that is evenly divisible by all of the 
     * numbers from 1 to 20?
     */
    public int euler5() {
	int smallest = 20;
	boolean foundit = false;
	while (true) {
	    for (int i=2;i<=20;i++) {
		if ((smallest % i) == 0) {
		    foundit = true;
		    continue;
		} else {
		    smallest += 20;
		    foundit = false;
		    break;
		}
	    }
	    if (foundit)
		break;
	}
	return smallest;
    }

    /* Euler 6
     * Find the difference between the sum of the squares of the first one hundred natural numbers 
     * and the square of the sum.
     */
    public int euler6() {
	int sum_squares = 0;
	int sum_numbers = 0;
	for (int i=1;i<=100;i++) {
	    sum_squares = sum_squares + i * i;
	    sum_numbers = sum_numbers + i;
	}
	return sum_numbers * sum_numbers - sum_squares;
    }

}//end Euler
