public class BubbleSort {

  public static void sort(int[] arr) {
    boolean sorted = false;
    while (!sorted) sorted = bubblePass(arr);
  }

  private static boolean bubblePass(int[] arr) {
    boolean sorted = true;
    for (int x = 0; x < arr.length - 1; x++) {
      if (arr[x] > arr[x + 1]) {
        swap(arr, x, x + 1);
        sorted = false;
      }
    }
    return sorted;
  }

  private static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public static void main(String[] args) {
    int[] subject = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
    sort(subject);
    System.out.println(java.util.Arrays.toString(subject));
  }

}
