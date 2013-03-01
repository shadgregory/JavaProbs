public class RunEuler {
    public static void main(String args[]) {
        Euler e = new Euler();
        System.out.println("1. The sum is " + e.euler1());
        System.out.println("2. The sum is " + e.euler2());
        System.out.println("3. The largest prime factor is " + e.euler3());
        System.out.println("4. The largest palindrome is " + e.euler4());
        System.out.println("5. The smallest number is " + e.euler5());
    }
}
