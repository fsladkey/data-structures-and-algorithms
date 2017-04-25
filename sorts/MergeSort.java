public class MergeSort {

  public static void sort(int[] arr) {
    sortBetween(arr, new int[arr.length], 0, arr.length - 1);
  }

  private static void sortBetween(int[] arr, int[] aux, int startIdx, int endIdx) {
    System.out.println(java.util.Arrays.toString(arr));
    if (startIdx >= endIdx) {
      return;
    }

    int midIdx = (startIdx + endIdx + 1) / 2;
    sortBetween(arr, aux, startIdx, midIdx - 1);
    sortBetween(arr, aux, midIdx, endIdx);
    merge(arr, aux, startIdx, midIdx - 1, midIdx, endIdx);
  }

  private static void merge(int[] arr, int[] aux, int leftStartIdx, int leftEndIdx,
  int rightStartIdx, int rightEndIdx) {
    int startIdx = leftStartIdx;
    int insertIdx = leftStartIdx;
    while (leftStartIdx <= leftEndIdx && rightStartIdx <= rightEndIdx) {
      if (arr[leftStartIdx] < arr[rightStartIdx]) {
        aux[insertIdx] = arr[leftStartIdx];
        leftStartIdx++;
      } else {
        aux[insertIdx] = arr[rightStartIdx];
        rightStartIdx++;
      }
      insertIdx++;
    }
    while (leftStartIdx <= leftEndIdx) {
      aux[insertIdx] = arr[leftStartIdx];
      leftStartIdx++;
      insertIdx++;
    }
    while (rightStartIdx <= rightEndIdx) {
      aux[insertIdx] = arr[rightStartIdx];
      rightStartIdx++;
      insertIdx++;
    }

    for (int idx = startIdx; idx <= rightEndIdx; idx++) {
      arr[idx] = aux[idx];
    }
  }

  public static void main(String[] args) {
    int[] subject = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
    sort(subject);
    System.out.println(java.util.Arrays.toString(subject));
  }

}
