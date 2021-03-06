import java.util.*;

public class RunEuler {
    public static void main(String args[]) {
        Euler e = new Euler();
        System.out.println("1. The sum is " + e.euler1());
        System.out.println("2. The sum is " + e.euler2());
        System.out.println("3. The largest prime factor is " + e.euler3());
        System.out.println("4. The largest palindrome is " + e.euler4());
        System.out.println("5. The smallest number is " + e.euler5());
        System.out.println("6. The difference is " + e.euler6());
        System.out.println("7. The 10,001st prime is " + e.euler7());
        System.out.println("8. The largest product is " + e.euler8());
        System.out.println("9. The triplet is :");
        for (Integer i: e.euler9()) {
            System.out.println(i);
        }
    }
}
