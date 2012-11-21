//find which number is not present in the second array
import java.util.HashMap;

public class TwoArrays {
  public static int findAbsentNumber() {
    int[] firstArray = {1,2,3,4,5};
    int[] secondArray = {2,3,1,0,5};
    HashMap<Integer,Boolean> mp = new HashMap<Integer,Boolean>();
    for (int i=0;i<secondArray.length;i++) {
      mp.put(secondArray[i], true);
    }
    for (int i=0;i<firstArray.length;i++) {
      if (mp.get(firstArray[i]) == null)
	return firstArray[i];
    }
    return 0;
  }
  public static void main(String args[]) {
    System.out.println("Missing number : " + findAbsentNumber());
  }
}
