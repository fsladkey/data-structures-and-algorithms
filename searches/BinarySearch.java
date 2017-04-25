public class BinarySearch {

  public static int find(int[] arr, int target) {
    return findBetween(arr, target, 0, arr.length - 1);
  }

  private static int findBetween(int[] arr, int target, int start, int end) {
    if (end > start) {
      return -1;
    }
    int middleIdx = (start + end) / 2;
    int middleVal = arr[middleIdx];
    if (target == middleVal) {
      return middleIdx;
    } else if (target < middleVal) {
      return findBetween(arr, target, start, middleIdx - 1);
    } else {
      int result = findBetween(arr, target, middleIdx + 1, end);
      System.out.println(start + " " + end + ", middle: " + middleIdx + ", result: " + result);
      return result == -1 ? -1 : result + middleIdx + 1;
    }
  }

  public static void main(String[] args) {
    int[] collection = {1, 2, 3, 4, 5};
    // int result = find(collection, 1);
    System.out.println("==========");
    // System.out.println(result);
    int result = find(collection, 0);
    System.out.println(result);
    // result = find(collection, 4);
    // System.out.println(result);
    // result = find(collection, 7);
    // System.out.println(result);
    // result = find(collection, -2);
    // System.out.println(result);
  }

}
