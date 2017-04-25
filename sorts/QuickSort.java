public class QuickSort {

  public static void sort(int[] arr) {
    sortBetween(arr, 0, arr.length - 1);
  }

  private static void sortBetween(int[] arr, int startIdx, int endIdx) {
    if (startIdx >= endIdx) return;
    int pivotIdx = randomIndex(startIdx, endIdx);
    int center = partition(arr, startIdx, endIdx, pivotIdx);

    sortBetween(arr, startIdx, center - 1);
    sortBetween(arr, center + 1, endIdx);
  }

  private static int partition(int[] arr, int startIdx, int endIdx, int pivotIdx) {
    swap(arr, startIdx, pivotIdx);
    int pivotVal = arr[startIdx];
    int iterIdx = startIdx + 1;
    int midIdx = iterIdx;
    while (iterIdx <= endIdx) {
      if (arr[iterIdx] < pivotVal) {
        swap(arr, iterIdx, midIdx);
        midIdx++;
      }
      iterIdx++;
    }
    swap(arr, startIdx, midIdx - 1);
    return midIdx - 1;
  }

  private static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  private static int randomIndex(int start, int end) {
    java.util.Random numberGenerator = new java.util.Random();
    return numberGenerator.nextInt(end - start) + start;
  }

  public static void main(String[] args) {
    int[] subject = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
    sort(subject);
    System.out.println(java.util.Arrays.toString(subject));
  }

}
