public class InsertionSort {

  public static void sort(int[] arr) {
    int x, y;
    for (x = 0; x < arr.length; x++) {
      int value = arr[x];
      for (y = x - 1; y >= 0 && arr[y] > value; y--) {
        arr[y + 1] = arr[y];
      }
      arr[y + 1] = value;
    }
  }

  public static void main(String[] args) {
    int[] subject = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
    sort(subject);
    System.out.println(java.util.Arrays.toString(subject));
  }

}
