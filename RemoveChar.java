public class RemoveChar {
  public static String removeChar(String myString, String c) {
    if (myString.length() < 2)
      return myString;
    if (myString.charAt(0) == c.charAt(0))
      return removeChar(myString.substring(1), c);
    else
      return myString.charAt(0) + removeChar(myString.substring(1), c);
  }

  public static void main(String args[]) {
    if (args.length != 2)
      throw new IllegalArgumentException("Two arguments are required.");
    if (args[1].length() != 1)
      throw new IllegalArgumentException("Second argument can have only one character.");
    System.out.println(args[0] + " -> " + removeChar(args[0], args[1]));
  }
}
