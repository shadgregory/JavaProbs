public class Palindrome {
  public static Boolean isPalindrome(String str) {
    if (str.equals(reverse(str)))
      return true;
    else
      return false;
  }

  public static String reverse(String str) {
    if (str.length() < 2)
      return str;
    return reverse(str.substring(1)) + str.charAt(0);
  }

  public static void main(String args[]) {
    for (String s: args) {
      System.out.println(s + " : " + isPalindrome(s));
    }
  }
}
